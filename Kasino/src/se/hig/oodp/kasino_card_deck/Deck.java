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

		for(int i = 0; i < 4; i++) {
			for(int n = 0; n < 13; i++) 
				deck.add(new Card(i, s[i]));
		}
	}
	
	public void print() {
		for(Card c : deck) {
			System.out.println(c);
		}
	}
}
