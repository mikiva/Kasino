package se.hig.oodp.kasino.control;

import java.util.List;

import se.hig.oodp.kasino_card_deck.Card;

public class PlayerAI implements Player {
	
	int id;
	
	public PlayerAI(int id) {
		this.id = id;
	}

	@Override
	public int getPlayerId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void placeCard(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeCard(Card[] cardArr, Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToHand(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearHand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Card> getHand() {
		// TODO Auto-generated method stub
		return null;
	}

}
