package se.hig.oodp.kasino_card_deck;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	List<Card> deck;
	String[] s = new String[4];
	
	
	public Deck() {
		
		s[0] = "Clubs";
		s[1] = "Spades";
		s[2] = "Hearts";
		s[3] = "Diamonds";
		
		deck = new ArrayList<Card>();
	
		for(int i = 0; i < 13; i++) {
			
		}
	}

}
