package se.hig.oodp.kasino.control;

import java.awt.List;
import java.util.ArrayList;

import se.hig.oodp.kasino_card_deck.Card;

public class Player implements PlayerInterface{

	
	private ArrayList<Card> cards;
	private int playerID;
	
	public Player(int id){
		
		this.playerID = id;
		cards = new ArrayList<Card>();
		
	}
	
	
	@Override
	public int getPlayerId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void playCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHand(Card card) {


		cards.add(card);

	}
	
	public ArrayList<Card> getHand(){
		
		
		return cards;
	}
	
	public void clearHand(){
		
		cards.clear();
		
	}
	

}
