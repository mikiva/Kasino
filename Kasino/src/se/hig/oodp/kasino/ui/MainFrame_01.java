package se.hig.oodp.kasino.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;
import javax.swing.Icon;

import se.hig.oodp.kasino_card_deck.Deck;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Box;

public class MainFrame_01 extends JFrame {

	private JPanel centerPanel;
	private JPanel mainPanel;


	/**
	 * Launch the application.
	 */

	Drawing draw;
	Deck deck;
	Image img;
	Image img2;


	private SpelPlan spelPlan;




	Drawing[] playerDrawing;

	Scanner sc = new Scanner(System.in);

	/**
	 * Create the frame.
	 */
	public MainFrame_01(String title, Deck deck, Drawing draw, SpelPlan spelplan) throws HeadlessException
	{
		super (title);
		getContentPane().setEnabled(false);
		this.deck = deck;
		playerDrawing = new Drawing[4];

		mainPanel = new JPanel();

		//				centerPanel = new JPanel();
		//				JPanel leftPlayerPanel = new JPanel();
		//				JPanel rightPlayerPanel = new JPanel();
		//				JPanel userPlayerPanel = new JPanel();
		//				JPanel oppositePlayerPanel = new JPanel();



		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (1000, 900));

		this.draw = draw;
		this.spelPlan = spelplan;
		//	getContentPane().setLayout(null);
		//img = deck.getImage(12);

		pack();
		//add(draw);
		getContentPane().add(spelPlan);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));


		//	for(int i = 10; i <14; i++){

		spelPlan.repaint();
		setVisible(true);


		//draw.add(label1);
		//	playerDrawing[3].add(label1);

	}

	//
	//		for (int i = 0; i <12; i++){
	//
	//			img = deck.getImage(i);
	//			JLabel label1 = new JLabel(new ImageIcon(img));
	//			centerPanel.add(label1);	
	//
	//		}
	//
	//
	//
	//
	//		for (int i = 0; i <4; i++){
	//
	//			img = deck.getImage(i);
	//			JLabel label1 = new JLabel(new ImageIcon(img));
	//			userPlayerPanel.add(label1);	
	//
	//		}
	//
	//
	//
	//
	//		for (int i = 0; i <4; i++){
	//
	//			img = deck.getImage(i);
	//			JLabel label1 = new JLabel(new ImageIcon(img));
	//			leftPlayerPanel.add(label1);	
	//
	//		}
	//		for (int i = 0; i <4; i++){
	//
	//			img = deck.getImage(i);
	//			JLabel label1 = new JLabel(new ImageIcon(img));
	//			oppositePlayerPanel.add(label1);	
	//
	//		}
	//		for (int i = 0; i <4; i++){
	//
	//			img = deck.getImage(i);
	//			JLabel label1 = new JLabel(new ImageIcon(img));
	//			rightPlayerPanel.add(label1);	
	//
	//		}














	//centerPanel.setBounds(267, 155, 450, 450);
	//getContentPane().add(centerPanel);
	//centerPanel.setLayout(new GridLayout(2, 6, 0, 0));
	//
	//
	//leftPlayerPanel.setBounds(-62, 93, 150, 600);
	//getContentPane().add(leftPlayerPanel);
	//leftPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));
	//
	//
	//rightPlayerPanel.setBounds(888, 80, 150, 600);
	//getContentPane().add(rightPlayerPanel);
	//rightPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));
	//
	//
	//userPlayerPanel.setBounds(267, 679, 450, 157);
	//getContentPane().add(userPlayerPanel);
	//userPlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));
	//
	//
	//oppositePlayerPanel.setBounds(267, -75, 450, 157);
	//getContentPane().add(oppositePlayerPanel);
	//oppositePlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));
	////mainPanel.setLayout(new BorderLayout(0, 0));


	//playerDrawing[0].setImage(img);










}







