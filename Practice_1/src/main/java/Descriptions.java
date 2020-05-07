import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Descriptions extends JPanel{

	private JLabel label1; 
	private JLabel label2; 
	private JLabel label3; 
	private JLabel label4;
	
	public Descriptions() {
	label1 = new JLabel("Number of cells x");
	label2 = new JLabel("Number of cells y");
	label3 = new JLabel("Width of the cells");		
	label4 = new JLabel("Height of the cells");
	
	setLayout(new FlowLayout());
	
	add(label1);
	add(label2);
	add(label3);
	add(label4);
	}
}
