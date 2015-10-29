package se.hig.oodp.kasino.control;

import java.util.List;
import java.util.Random;

import se.hig.oodp.kasino_card_deck.Card;

public class PlayerAI implements Player {
	
	private List<Card> cards;
	private int playerID;
	private GameLogic logic;
	
	public PlayerAI(int playerID) {
		this.playerID = playerID;
	}

	@Override
	public int getPlayerId() {
		return playerID;
	}

	@Override
	public void placeCard(Card card) {
		
		logic.cardPlaced(card);
		
	}

	@Override
	public void takeCard(Card[] cardArr, Card card) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 0; i < cards.size(); i++) {
			
		}
		placeCard(card);
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
