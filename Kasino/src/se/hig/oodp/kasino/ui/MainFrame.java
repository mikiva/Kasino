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

	Drawing[] playerDrawing;

	Scanner sc = new Scanner(System.in);
	public MainFrame (String title, Deck deck, Drawing draw) throws HeadlessException
	{
		super (title);
		this.deck = deck;
		playerDrawing = new Drawing[4];


		GridLayout playerGridVert = new GridLayout(1, 4);
		GridLayout playerGridHori = new GridLayout(4, 1);

		GridLayout testGrid = new GridLayout(2, 2); //Delar upp

		for (int i = 0; i<2; i++){

			playerDrawing[i] = draw;
			playerDrawing[i].setLayout(playerGridVert);
			add(playerDrawing[i]);

		}


		for (int i = 2; i<4; i++){

			playerDrawing[i] = draw;
			playerDrawing[i].setLayout(playerGridHori);
			add(playerDrawing[i]);

		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize (new Dimension (800, 600));

		// mainPanel innehÃ¥ller
		// - DrawingPanel - en JPanel dÃ¤r figurerna ritas ut
		// - ControlPanel - en JPanel som innehÃ¥ller styrelementen
		JPanel mainPanel = new JPanel ();
		this.draw = draw;
		//	setLayout(new BorderLayout());
		add(mainPanel);




		draw.setLayout(testGrid);
		//		System.out.println("Vilket kort vill du mata ut?");
		//		int id = sc.nextInt(); //Mata in vilket ID som ska matas ut.


		setLayout(testGrid);
		//		img = deck.getImage(id);
		//		img2 = deck.getImage(id+4);

		//mainPanel.add(draw);

		add(draw);


		draw.setImage(img);
		for(int i = 0; i <4; i++){

			img = deck.getImage(i);


			JLabel label1 = new JLabel(new ImageIcon(img));
			draw.add(label1);
		}




		mainPanel.setLayout(new BorderLayout());






		//JLabel label2 = new JLabel(new ImageIcon(img));
		//		add(label1);
		//		add(label2);


		mainPanel.add(draw, BorderLayout.CENTER);
		mainPanel.add(playerDrawing[0], BorderLayout.NORTH);
		mainPanel.add(playerDrawing[1], BorderLayout.SOUTH);
		mainPanel.add(playerDrawing[2], BorderLayout.WEST);
		mainPanel.add(playerDrawing[3], BorderLayout.EAST);




		pack();

	}







	public void paint(){







	}




}
