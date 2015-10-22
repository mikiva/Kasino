package se.hig.oodp.kasino.ui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.hig.oodp.kasino_card_deck.Deck;



public class MainFrame extends JFrame {
	
	Drawing draw;
	Deck deck;
	Image img;
	
	public MainFrame (String title, Deck deck) throws HeadlessException
	{
		super (title);
		this.deck = deck;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (800, 600));

		// mainPanel innehÃ¥ller
		// - DrawingPanel - en JPanel dÃ¤r figurerna ritas ut
		// - ControlPanel - en JPanel som innehÃ¥ller styrelementen
		JPanel mainPanel = new JPanel ();
		draw= new Drawing(deck);
		setLayout(new BorderLayout());
		
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		mainPanel.add(draw, BorderLayout.CENTER);
		img = deck.getImage(3);
		JLabel label = new JLabel(new ImageIcon(img));
		add(label);
		
		
		pack();
		
	}

	
	
	
	
	
	
	public void paint(){
		
	
	
		
		
		
		
	}
	
	
	

}
