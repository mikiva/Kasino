package se.hig.oodp.kasino.control;

import java.util.Collections;

import se.hig.oodp.kasino_card_deck.Deck;

public class Dealer implements DealerInterface{

	
	Deck deck;
	int nbrOfPlayers;
	
	public Dealer(Deck deck, int nbr){
		
		this.deck = deck;
		
		this.nbrOfPlayers = nbr;
		
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
		if(!deck.getDeck().isEmpty()) {
			
			
			
			
			
		}
		
	}
	
	public boolean isDeckEmpty() {
		if(deck.getDeck().isEmpty())
			return true;
		return false;
	}

}
