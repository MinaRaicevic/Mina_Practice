import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons extends JPanel {

	private JButton cancel;
	private JButton next;
	private PanelClass panel;
	
	public Buttons() {
		setCancel(new JButton("Cancel"));
		setNext(new JButton("Next"));
		
		setLayout(new FlowLayout());
		
		add(getNext()); 
		add(getCancel());	
	}

	public JButton getCancel() {
		return cancel;
	}

	public void setCancel(JButton cancel) {
		this.cancel = cancel;
	}

	public JButton getNext() {
		return next;
	}

	public void setNext(JButton next) {
		this.next = next;
	}
}