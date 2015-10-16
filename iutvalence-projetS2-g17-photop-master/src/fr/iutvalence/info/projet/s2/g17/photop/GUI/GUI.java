package fr.iutvalence.info.projet.s2.g17.photop.GUI;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import fr.iutvalence.info.projet.s2.g17.photop.Application;

/**
 * The classGUIPhotop where we create the GUI
 */
public class GUI implements Runnable
{

	private JFrame applicationWindow;
	
	private Application photop;

	private DrawPanel drawPanel;

	private MenuBar menuBar;
	

	public GUI (Application photop)
	{
		this.photop = photop;
	}
	
	private void GUICreator()
	{
		this.applicationWindow = new JFrame();
		this.applicationWindow.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.applicationWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.applicationWindow.setLocationRelativeTo(null);
		
		/**
		 * reaching the icon through the path of the package
		 */
		ImageIcon icon = new ImageIcon(getClass().getResource("/fr/iutvalence/info/projet/s2/g17/photop/GUI/123.png"));
		this.applicationWindow.setIconImage(icon.getImage());
		this.applicationWindow.setTitle("Photop'");
	
		this.drawPanel = new DrawPanel(null);

		this.menuBar = new MenuBar(this.drawPanel);
		this.menuBar.initMenu(this.applicationWindow);
		this.applicationWindow.getContentPane().add(drawPanel);
		this.applicationWindow.setVisible(true);
	}

	@Override
	public void run()
	{
		this.GUICreator();
	}

}

