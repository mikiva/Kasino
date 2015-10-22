package se.hig.oodp.kasino_card_deck;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	List<Card> deck;
	String[] s = {"Clubs", "Spades", "Hearts", "Diamonds"};

	public Deck() throws IOException {

		deck = new ArrayList<Card>();

		for(int n = 14; n > 1; n--){
			for(int i = 0; i < 4; i++) 			 
				deck.add(new Card(n, s[i], deck.size()));
		}



	}

	public void print() { 
		for(Card c : deck) {
			System.out.println(c);
		}
		System.out.println("Lekstorlek: "+ deck.size());
	}

	public void shuffle(){


		Collections.shuffle(deck);

	}
	
	public Image getImage(int id){
		
		
		return deck.get(id).img;
		
	}


}
