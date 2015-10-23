package se.hig.oodp.kasino.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;

import se.hig.oodp.kasino_card_deck.Deck;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;

public class MainFrame_01 extends JFrame{

	private JPanel centerPanel;

	/**
	 * Launch the application.
	 */

	Drawing draw;
	Deck deck;
	Image img;
	Image img2;


	Drawing[] playerDrawing;

	Scanner sc = new Scanner(System.in);

	/**
	 * Create the frame.
	 */
	public MainFrame_01(String title, Deck deck, Drawing draw) throws HeadlessException
	{
		super (title);
		this.deck = deck;
		playerDrawing = new Drawing[4];

		centerPanel = new JPanel();
		centerPanel.setBounds(267, 155, 450, 450);
		JPanel leftPlayerPanel = new JPanel();
		leftPlayerPanel.setBounds(-62, 93, 150, 600);
		JPanel rightPlayerPanel = new JPanel();
		rightPlayerPanel.setBounds(888, 80, 150, 600);
		JPanel userPlayerPanel = new JPanel();
		userPlayerPanel.setBounds(267, 679, 450, 157);
		JPanel oppositePlayerPanel = new JPanel();
		oppositePlayerPanel.setBounds(267, -75, 450, 157);
		
		
		


		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (1000, 800));

		this.draw = draw;
		img = deck.getImage(12);


		//add(draw);


		for(int i = 10; i <14; i++){

			


			
			//draw.add(label1);
		//	playerDrawing[3].add(label1);

		}
		
		
		for (int i = 0; i <12; i++){
			
			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			centerPanel.add(label1);	
			
		}
		


		
		for (int i = 0; i <4; i++){
			
			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			userPlayerPanel.add(label1);	
			
		}
		
		
		
		
		for (int i = 0; i <4; i++){
			
			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			leftPlayerPanel.add(label1);	
			
		}
		for (int i = 0; i <4; i++){
			
			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			oppositePlayerPanel.add(label1);	
			
		}
		for (int i = 0; i <4; i++){
			
			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			rightPlayerPanel.add(label1);	
			
		}
		getContentPane().setLayout(null);
		getContentPane().add(centerPanel);
		centerPanel.setLayout(new GridLayout(2, 6, 0, 0));
		getContentPane().add(leftPlayerPanel);
		leftPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));
		getContentPane().add(rightPlayerPanel);
		rightPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));
		getContentPane().add(userPlayerPanel);
		userPlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));
		getContentPane().add(oppositePlayerPanel);
		oppositePlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));
		//mainPanel.setLayout(new BorderLayout(0, 0));


		//playerDrawing[0].setImage(img);








		pack();

	}
	

	
	


}
