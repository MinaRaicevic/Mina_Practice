import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class Buttons extends JPanel {
	private JButton cancel;
	private JButton next;
	private PanelClass panelClass;

	public Buttons() {
		next = new JButton("Next");
		cancel = new JButton("Cancel");
		panelClass = new PanelClass();
		
		FormLayout formLayout = new FormLayout("3dlu, pref, 10dlu, pref", "pref, 3dlu");
		setLayout(formLayout);
		
		CellConstraints c = new CellConstraints();

		add(next, c.xy(2, 1));
		add(cancel, c.xy(4, 1));
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				panelClass.appendText(true);
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				setVisible(false);
			}
		});
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