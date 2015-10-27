package se.hig.oodp.kasino.control;

import java.awt.List;
import java.util.ArrayList;

import se.hig.oodp.kasino_card_deck.Card;


public interface PlayerInterface {
	
	public int getPlayerId();
	public void placeCard();
	public void takeCard();
	public void addToHand(Card card);
	
	

}
