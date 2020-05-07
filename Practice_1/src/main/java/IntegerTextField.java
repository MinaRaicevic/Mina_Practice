import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class IntegerTextField {
	
	public JTextField textField;
	public Label label;
	
	public IntegerTextField() {
		textField = new JTextField(10);
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			String value = textField.getText();
			int l = value.length();
			if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
				textField.setEditable(true);
			} else {
				textField.setEditable(false);
				label.setText(" Enter only numeric digits ( 0 - 9 ) ");
			}
			}
		});
	}
}
