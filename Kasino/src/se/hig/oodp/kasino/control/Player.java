package se.hig.oodp.kasino.control;


import java.util.ArrayList;
import java.util.List;

import se.hig.oodp.kasino_card_deck.Card;


public interface Player {
	
	public int getPlayerId();
	public void placeCard(Card card);
	public void takeCard(Card[] cardArr, Card card);
	public void addToHand(Card card);
	public void clearHand();
	public List<Card> getHand();
	
	

}
