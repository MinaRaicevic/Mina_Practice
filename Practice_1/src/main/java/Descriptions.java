import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Descriptions extends JPanel {

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;

	public JLabel getLabel1() {
		return label1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public void setLabel2(JLabel label2) {
		this.label2 = label2;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public void setLabel3(JLabel label3) {
		this.label3 = label3;
	}

	public JLabel getLabel4() {
		return label4;
	}

	public void setLabel4(JLabel label4) {
		this.label4 = label4;
	}

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
