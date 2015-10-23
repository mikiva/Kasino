package se.hig.oodp.kasino.control;

import java.util.Collections;

import se.hig.oodp.kasino_card_deck.Deck;

public class Dealer implements DealerInterface{

	
	Deck deck;
	
	public Dealer(Deck deck){
		
		this.deck = deck;
		
		
		
	}
	
	
	@Override
	public void shuffleDeck() {
		
		
		deck.shuffle();
		
		
	}
		
	

	@Override
	public void deal() {
		
		
		
		
		
	}

	@Override
	public void dealToPlayer(int playerID) {
		// TODO Auto-generated method stub
		
	}

}
