import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelClass extends JPanel{
	
	private JFormattedTextField textField1;
	private JFormattedTextField textField2;
	private JFormattedTextField textField3;
	private JFormattedTextField textField4;

	private IntegerTextField tf1;
	private IntegerTextField tf2;
	private IntegerTextField tf3;
	private IntegerTextField tf4;
	
	public PanelClass() {
		this.setLayout(new FlowLayout());

		tf1 = new IntegerTextField();
		tf2 = new IntegerTextField();
		tf3 = new IntegerTextField();
		tf4 = new IntegerTextField();
		
		add(tf1.getTextField());
		add(tf2.getTextField());
		add(tf3.getTextField());
		add(tf4.getTextField());
	}
	public void appendText(Boolean appendText) {

		EventQueue.invokeLater(new Runnable() {
		public void run() {
			JFrame frame = new JFrame("Test");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(400, 400);
			frame.setVisible(true);

			JPanel panel2 = new JPanel();
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			panel2.setOpaque(true);
			
			JTextArea textArea = new JTextArea();
			textArea.setEditable(false);

			textArea.append("x: " + tf1.getTextField().getText().toString() + "\n" + "y: " + tf2.getTextField().getText().toString() + "\n" + "Width: " + tf3.getTextField().getText().toString() +"\n" + "Height: " + tf4.getTextField().getText().toString());
			panel2.add(textArea);
			frame.getContentPane().add(BorderLayout.CENTER, panel2);
		}
	});
	}
}