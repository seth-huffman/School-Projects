// Adding Imports
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;

// UI Class: Setting up the Layout of the UI(GUI)
public class UI {
    private Assigner tm;
    private DefaultListModel<Task> lm;
    private JList<Task> rightLayout;

    /*
     * Creation of Data Structure
     * - DefaultListModel
     */
    public UI() {
        tm = new Assigner();
        lm = new DefaultListModel<>();
    }

    public void layout() {

        /*
         * Setting up Global Styles
         * - Fonts: Setting Montserrat as a Font
         * - Color: Creating a Color for the Background
         * - Border: Creating Common Borders for Text Fields
         * - Padding: Creating Common Padding for Text Fields
         */

        Font fnt;
         try {
             fnt = Font.createFont(Font.TRUETYPE_FONT, new File("Montserrat-Bold.ttf")).deriveFont(12f);
         } catch (FontFormatException | IOException e) {
             fnt = null;
         }
        UIManager.put("Label.font", fnt);

        Color backgroundColor = new Color(225, 225, 225);
        Border border = new LineBorder(new Color(241,241,241), 0);
        Border padding = BorderFactory.createEmptyBorder(   16, 16, 16, 16); 

        /*
         * Creation of Frame
         * - Setting close button
         * - Setting Size
         * - Setting to be Visible
         */

        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1000, 450);
        frm.setVisible(true);

        /*
         * Creation of Text Field
         * - Setting Font Style
         * - Setting Border Style
         */

        JTextField task = new JTextField();
        task.setFont(fnt);
        task.setBorder(BorderFactory.createCompoundBorder(border, padding));

        JTextField date = new JTextField();
        date.setFont(fnt);
        date.setBorder(BorderFactory.createCompoundBorder(border, padding));

        JTextField category = new JTextField();
        category.setFont(fnt);
        category.setBorder(BorderFactory.createCompoundBorder(border, padding));

        /*
         * Creation of Check Box
         * - Setting Font Style
         */

        JCheckBox cb = new JCheckBox();
        cb.setFont(fnt);

        /*
         * Creation of Button
         * - Setting Verbage
         * - Setting Font Style
         * - Removing Border
         * - Setting Background Color
         * - Setting Text Color
         */

        JButton btn = new JButton("C R E A T E");
        btn.setFont(fnt);
        btn.setBorder(new LineBorder(backgroundColor, 5));
        btn.setBackground(new Color(97,47,171));
        btn.setForeground(Color.WHITE);

        /*
         * Creation of Labels
         * - Setting Verbage
         * - Setting Font Style
         * - Setting Text Alignment
         */

        JLabel txt_task = new JLabel("T A S K");
        txt_task.setFont(fnt);
        txt_task.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel txt_date = new JLabel("D A T E");
        txt_date.setFont(fnt);
        txt_date.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel txt_category = new JLabel("C A T E G O R Y");
        txt_category.setFont(fnt);
        txt_category.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel txt_priority = new JLabel("P R I O R I T Y");
        txt_priority.setFont(fnt);
        txt_priority.setHorizontalAlignment(SwingConstants.RIGHT);

        /*
         * Creation of Layouts
         * - Layouts: Left Layout, Right Layout, Row Layout
         * - Left Layout: Contains all Input Data and Associated Labels
         * - Right Layout: Contains all Output Data
         * - Row Layout: Puts Right and Left Data Together
         */

        JPanel leftLayout = new JPanel(new GridLayout(6, 2, 16, 16));
        leftLayout.setBackground(backgroundColor);
        leftLayout.setBorder(BorderFactory.createEmptyBorder(24, 24, 24, 24));

        rightLayout = new JList<>(lm);
        rightLayout.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
        rightLayout.setFont(fnt);
        rightLayout.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        Container rowLayout = frm.getContentPane();
        rowLayout.setLayout(new GridLayout(1, 2));

        /*
         * Putting it all Together
         * - Panel: Creating Left Layout
         * - Conatiner: Creating Row Layout For Left and Right Layouts
         */

        leftLayout.add(txt_task);
        leftLayout.add(task);
        leftLayout.add(txt_date);
        leftLayout.add(date);
        leftLayout.add(txt_category);
        leftLayout.add(category);
        leftLayout.add(txt_priority);
        leftLayout.add(cb);
        leftLayout.add(new JLabel());
        leftLayout.add(new JLabel());
        leftLayout.add(new JLabel());
        leftLayout.add(btn);

        rowLayout.add(leftLayout);
        rowLayout.add(rightLayout);

        /*
         * Creating Popup
         * - Input Verification Check: All fields populated
         * - Input Verification Check: Make sure date is formated correctly
         */
        btn.addActionListener(e -> {
            String str_Task = task.getText();
            String str_Date = date.getText();
            String str_Category = category.getText();
            boolean bl_Priority = cb.isSelected();

            if (str_Task.isEmpty() || str_Date.isEmpty() || str_Category.isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Oops! You missed a field");
                return;
            }

            DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");

            try {
                LocalDate due = LocalDate.parse(str_Date, format);
                Task tasks = new Task(str_Task, due, bl_Priority, str_Category);
                
                tm.add(tasks);
                tm.sort();
                lm.clear();
            
                for (Task t : tm.getTasks()) {
                    lm.addElement(t);
                }
            
                task.setText("");
                date.setText("");
                category.setText("");
                cb.setSelected(false);

            } catch (DateTimeParseException ex) {
                JOptionPane.showMessageDialog(frm, "Oops! You formatted the date wrong");
            }
        });

        /*
         * Removing of Tasks After They are Complete
         */
        rightLayout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Task selectedTask = rightLayout.getSelectedValue();

                    if (selectedTask != null) {
                        tm.remove(selectedTask);
                        lm.clear();

                        for (Task t : tm.getTasks()) {
                            lm.addElement(t);
                        }
                    }
                }
            }
        });
    }
}

