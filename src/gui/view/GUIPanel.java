package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		
		setupPanel();
	}
	
	/**
	 * Used to add all the components to the subclass of JPanel
	 * This installs them into the panel so they are seen in the GUI.
	 */
	
	private void setupPanel()
	{
		this.add(firstButton);
		
	}
	
	/**
	 * This is used to hold all the layout and arrangement code for SpringLayout
	 */
	private void setupLayout()
	{
		
	}
	
	
	/**
	 * This helper method is used to link any GUI components to the associated listener
	 */
	private void setupListeners()
	{
		
	}
}
