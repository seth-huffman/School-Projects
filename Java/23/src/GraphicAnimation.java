import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class GraphicAnimation extends JFrame implements ActionListener {
		
		public static final long serialVersionUID = 1L;
		
		private JFrame jframe;
		private JPanel jpanel;
		private JButton jbutCycle;
		private TrafficPanel trafficPanel;
		
		public GraphicAnimation() {
			jframe = new JFrame ("GraphicAnimation_Huffman");
			jpanel = new JPanel ();
			jbutCycle = new JButton("Cycle");
		}
		
		public void launchApp() {
			jframe.setSize(300,500);
			
			jpanel.add(jbutCycle);
			
			jbutCycle.addActionListener(this);
			
			trafficPanel = new TrafficPanel();
			jframe.getContentPane().add(trafficPanel);
			
			jframe.getContentPane().add(jpanel, BorderLayout.SOUTH);
			
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jframe.setVisible(true);
		
		}
		
		public static void main (String args[]) {
			GraphicAnimation_Huffman GraphicAnimation_Huffman = new GraphicAnimation_Huffman ();
			GraphicAnimation_Huffman.launchApp();
		}
			
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbutCycle) {
				trafficPanel.changeColor();
			}
		}

//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
}
