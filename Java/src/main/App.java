/** 
 * Description: The idea behind a final project is to showcase your use 
 * of data structures in a larger program. I have created a to-do list 
 * application. This application will manage indivdual tasks and have 
 * the ability to sort and remove too.
 * @author Seth Huffman
 * @version 1.0
 * @since 1.0
*/
/*  
* OS: MacOs
* IDE: VSCode
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified, nor used generative AI as a final draft. 
* I have not given other fellow student(s) access to my program.
*/
import javax.swing.*;

/*
 * App Class: Setting Up Project
 * - Connecting to Style
 * - Connecting to UI
 */

public class App {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        SwingUtilities.invokeLater(() -> new UI().layout());
    }
}
