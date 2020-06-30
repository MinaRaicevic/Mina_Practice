
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class IntegerTextField {

	private JTextField textField;
	private String s;

	public IntegerTextField(final JTextField textField) {
		this.textField = textField;
		this.textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					e.consume();
					textField.setEditable(true);
				}
			}
		});
	}

	public void changeOfTheInput() {		
		textField.getDocument().addDocumentListener(new DocumentListener() {

			public void removeUpdate(DocumentEvent e) {
				s = textField.getText().toString();
			}

			public void insertUpdate(DocumentEvent e) {
				s = textField.getText().toString();
			}

			public void changedUpdate(DocumentEvent e) {
				s = textField.getText().toString();

			}
		});
	}

	public JTextField getTextField() {
		changeOfTheInput();
		return this.textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
}
