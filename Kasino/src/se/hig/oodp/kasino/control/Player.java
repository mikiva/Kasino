package se.hig.oodp.kasino.control;

import java.awt.List;
import java.util.ArrayList;

import se.hig.oodp.kasino_card_deck.Card;


public interface Player {
	
	public int getPlayerId();
	public void placeCard();
	public void takeCard(Card[] cardArr, Card card);
	public void addToHand(Card card);
	public void clearHand();
	
	

}
