package fr.iutvalence.info.projet.s2.g17.photop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import fr.iutvalence.info.projet.s2.g17.photop.GUI.MenuBar;

public abstract class SetPointerTypeActionListener implements ActionListener
{	
	
	public static ActionListener setActionListener(final MenuBar menuBar, final ShapeType shapeType)
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				menuBar.getDrawPanel().setPointerType(shapeType);				
			}
		};
	}

}
