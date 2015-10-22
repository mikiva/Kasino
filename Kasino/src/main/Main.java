package main;

import java.io.IOException;

import se.hig.oodp.kasino.ui.MainFrame;
import se.hig.oodp.kasino_card_deck.Deck;

public class Main {

	public static void main(String[] args) throws IOException {
		Deck deck = new Deck();
		
		deck.print();
		
		
		
		
		
		
		
		
		System.out.println("Blanda?");
		System.out.println("Klart vi ska blanda!!");
		
		deck.shuffle();
		deck.print();
		
		
		MainFrame frame = new MainFrame("hej", deck);
		
		
		frame.setVisible(true);
		frame.repaint();
		
		
		

	}
	
	


}
