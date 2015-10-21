package se.hig.oodp.kasino_card_deck;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	List<Card> deck;
	String[] s = {"Clubs", "Spades", "Hearts", "Diamonds"};

	public Deck() {

		deck = new ArrayList<Card>();

		for(int i = 0; i < 4; i++) {
			for(int n = 0; n < 13; n++) 
				deck.add(new Card(n+1, s[i]));
		}
		
	}
	
	public void print() {
		for(Card c : deck) {
			System.out.println(c);
		}
		System.out.println(deck.size());
	}
}
