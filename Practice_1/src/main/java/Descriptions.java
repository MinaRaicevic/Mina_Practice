import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class Descriptions extends JPanel {

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private FormLayout formLayout;
	private CellConstraints c;

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
		formLayout = new FormLayout("60dlu","10dlu, 3dlu, 10dlu, 3dlu, 10dlu, 3dlu, 10dlu, 3dlu:grow");
		setLayout(formLayout);
		c = new CellConstraints();
		
		label1 = new JLabel("Number of cells x");
		label2 = new JLabel("Number of cells y");
		label3 = new JLabel("Width of the cells");
		label4 = new JLabel("Height of the cells");

		add(label1, c.xy(1, 1));
		add(label2, c.xy(1, 3));
		add(label3, c.xy(1, 5));
		add(label4, c.xy(1, 7));
	}
}
