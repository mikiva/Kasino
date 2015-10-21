package main;

import se.hig.oodp.kasino.ui.MainFrame;
import se.hig.oodp.kasino_card_deck.Deck;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.print();
		
		
		
		
		
		
		
		
		System.out.println("Blanda?");
		
		deck.shuffle();
		deck.print();
		
		
		MainFrame frame = new MainFrame("hej");
		
		frame.repaint();
		
		
		

	}
	
	


}
