import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class PanelClass extends JPanel {

	private IntegerTextField tf1;
	private IntegerTextField tf2;
	private IntegerTextField tf3;
	private IntegerTextField tf4;

	public PanelClass() {
		FormLayout formLayout = new FormLayout("pref:grow", "pref, 3dlu, pref, 3dlu, pref, 3dlu, pref, 3dlu:grow");
		setLayout(formLayout);
		CellConstraints c = new CellConstraints();

		tf1 = new IntegerTextField(new JTextField(15));
		tf2 = new IntegerTextField(new JTextField(15));
		tf3 = new IntegerTextField(new JTextField(15));
		tf4 = new IntegerTextField(new JTextField(15));

		add(tf1.getTextField(), c.xy(1, 1));
		add(tf2.getTextField(), c.xy(1, 3));
		add(tf3.getTextField(), c.xy(1, 5));
		add(tf4.getTextField(), c.xy(1, 7));
	}

	public void appendText(Boolean appendText) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Test");
				Font font = new Font("Serif", Font.BOLD, 20);
				FormLayout popUpLayout = new FormLayout("200dlu:grow", "200dlu:grow");
				CellConstraints c = new CellConstraints();
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setSize(400, 400);
				frame.setVisible(true);

				JPanel panel2 = new JPanel();
				panel2.setLayout(popUpLayout);

				JTextArea textArea = new JTextArea();
				textArea.setEditable(false);
				textArea.setFont(font);
				textArea.setLineWrap(true);
				textArea.setWrapStyleWord(true);
				panel2.add(textArea, c.xy(1, 1));

				textArea.append("x: " + tf1.getTextField().getText().toString() + "\n" + "y: "
						+ tf2.getTextField().getText().toString() + "\n" + "Width: "
						+ tf3.getTextField().getText().toString() + "\n" + "Height: "
						+ tf4.getTextField().getText().toString());

				frame.getContentPane().add(BorderLayout.CENTER, panel2);
			}
		});
	}
}