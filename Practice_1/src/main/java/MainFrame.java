import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
 
	private PanelClass panel;
	private Buttons buttons;
	private Descriptions descriptions;
	
	private double inputX;
	private double inputY;
	private double inputWidth;
	
	public MainFrame() {	
		super("Test Application");

		
		panel = new PanelClass();
		buttons = new Buttons();
		descriptions = new Descriptions();
		
		setLayout(new BorderLayout());
		
		add(panel, BorderLayout.CENTER);
		add(descriptions, BorderLayout.NORTH);
		add(buttons, BorderLayout.SOUTH);
		
		buttons.next.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				panel.appendText(true);
			}
		});
		
		buttons.cancel.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				setVisible(false);
				dispose();
			}
		});
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
	}
}
