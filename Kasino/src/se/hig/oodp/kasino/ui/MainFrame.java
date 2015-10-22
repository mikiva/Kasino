package se.hig.oodp.kasino.ui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.hig.oodp.kasino_card_deck.Deck;



public class MainFrame extends JFrame {
	
	Drawing draw;
	Deck deck;
	Image img;
	Image img2;
	

	
	Scanner sc = new Scanner(System.in);
	public MainFrame (String title, Deck deck, Drawing draw) throws HeadlessException
	{
		super (title);
		this.deck = deck;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (800, 600));

		// mainPanel innehÃ¥ller
		// - DrawingPanel - en JPanel dÃ¤r figurerna ritas ut
		// - ControlPanel - en JPanel som innehÃ¥ller styrelementen
		JPanel mainPanel = new JPanel ();
		this.draw = draw;
		setLayout(new BorderLayout());
		add(mainPanel);
		
		
		
		GridLayout testGrid = new GridLayout(2, 2); //Delar upp
	
		draw.setLayout(testGrid);
		//System.out.println("Vilket kort vill du mata ut?");
		//int id = sc.nextInt(); //Mata in vilket ID som ska matas ut.
		
		
		//setLayout(testGrid);
//		img = deck.getImage(id);
//		img2 = deck.getImage(id+4);
		
		mainPanel.add(draw);
		
		add(draw);
		
		
//		for(int i = 0; i <4; i++){
//			
//			
//			
//			
//			
//			
//			JLabel label1 = new JLabel(new ImageIcon(img));
//			add(label1);
//		}
//		
	
		img = deck.getImage(23);
		draw.setImage(img);
		
		mainPanel.setLayout(new BorderLayout());
		
		
		
		
		
		
		//JLabel label2 = new JLabel(new ImageIcon(img));
//		add(label1);
//		add(label2);
		
		
		//mainPanel.add(draw, BorderLayout.CENTER);
		
	

		
		
		pack();
		
	}

	
	
	
	
	
	
	public void paint(){
		
	
	
		
		
		
		
	}
	
	
	

}
