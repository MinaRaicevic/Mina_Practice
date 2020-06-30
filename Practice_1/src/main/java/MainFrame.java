import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class MainFrame extends JFrame{
 
	private PanelClass panelClass;
	private Buttons buttons;
	private Descriptions descriptions;
	private FormLayout formLayout;
	private JPanel formPanel;
	private CellConstraints c;
	
	public MainFrame() {	
		super("Test Application");
		panelClass = new PanelClass();
		buttons = new Buttons();
		descriptions = new Descriptions();
		
		formLayout = new FormLayout("60dlu, 3dlu, pref:grow, 3dlu", "pref, 3dlu, pref, 3dlu, pref, 3dlu:grow");
		formPanel = new JPanel();
		formPanel.setLayout(formLayout);
		c = new CellConstraints();
				
		formPanel.add(descriptions, c.xy(1, 1));
		formPanel.add(panelClass, c.xy(3, 1));
		formPanel.add(buttons, c.xy(3, 3));

				
		setSize(600, 500);
		setDefaultCloseOperation(2);
		add(formPanel);
		pack();
		setVisible(true); 
	}
}
