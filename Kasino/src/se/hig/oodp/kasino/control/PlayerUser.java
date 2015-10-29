package se.hig.oodp.kasino.control;

import java.util.ArrayList;
import java.util.List;

import se.hig.oodp.kasino_card_deck.Card;

public class PlayerUser implements Player{

	
	private List<Card> cards;
	private int playerID;
	private GameLogic logic;
	
	public PlayerUser(int playerID){
		
		this.playerID = playerID;
		cards = new ArrayList<Card>();
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
		logic.cardTaken(cardArr, card, playerID);
	}

	@Override
	public void addToHand(Card card) {
		cards.add(card);
	}
	
	public List<Card> getHand(){
		return cards;
	}
	
	public void clearHand(){
		cards.clear();	
	}
	

}
