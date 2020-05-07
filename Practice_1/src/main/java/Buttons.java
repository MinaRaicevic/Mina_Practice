import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons extends JPanel {

	public JButton cancel;
	public JButton next;
	private PanelClass panel;
	
	public Buttons() {
		cancel = new JButton("Cancel");
		next = new JButton("Next");
		
		setLayout(new FlowLayout());
		add(next); 
		add(cancel);
		
	}
}