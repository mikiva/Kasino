package main;

import java.awt.Image;
import java.io.IOException;



import se.hig.oodp.kasino.ui.MainFrame;
import se.hig.oodp.kasino.ui.Drawing;
import se.hig.oodp.kasino.ui.MainFrame_01;
import se.hig.oodp.kasino_card_deck.Deck;

public class Main {
	

	

	public static void main(String[] args) throws IOException {
		
		Deck deck = new Deck();
		
		deck.print();
		

	
		
		
		Drawing draw = new Drawing(deck);
		
		
		System.out.println("Blanda?");
		System.out.println("Klart vi ska blanda!!");
		
	//	deck.shuffle();
		deck.print();
		
		
		MainFrame_01 frame = new MainFrame_01("hej", deck, draw);
		
		
		frame.setVisible(true);
		frame.repaint();
		
		
		

	}
	
	


}
