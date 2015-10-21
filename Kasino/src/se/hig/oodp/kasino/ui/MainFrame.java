package se.hig.oodp.kasino.ui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainFrame extends JFrame {
	
	
	
	public MainFrame (String title) throws HeadlessException
	{
		super (title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (800, 600));

		// mainPanel innehÃ¥ller
		// - DrawingPanel - en JPanel dÃ¤r figurerna ritas ut
		// - ControlPanel - en JPanel som innehÃ¥ller styrelementen
		JPanel mainPanel = new JPanel ();
		
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		
		pack();
		setVisible(true);
	}

	
	
	
	public void paintComponent(Graphics g) {
		paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		
		g2.drawLine(100, 100, 500, 500);
	}

	
	
	public void paint(){
		
	
		
		
		
		
	}
	
	
	

}
