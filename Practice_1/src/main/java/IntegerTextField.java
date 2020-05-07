import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class IntegerTextField {
	
	private JTextField textField;
	private Label label;
	
	public IntegerTextField() {
		setTextField(new JTextField(10));
		getTextField().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			String value = getTextField().getText();
			int l = value.length();
			if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
				getTextField().setEditable(true);
			} else {
				getTextField().setEditable(false);
				label.setText(" Enter only numeric digits ( 0 - 9 ) ");
			}
			}
		});
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
}
