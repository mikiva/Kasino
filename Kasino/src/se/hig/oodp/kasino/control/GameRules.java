package se.hig.oodp.kasino.control;

import se.hig.oodp.kasino_card_deck.Card;



public class GameRules {
	
	private Dealer dealer;
	private int cardsOnTable;
	
	public GameRules() {
		cardsOnTable = 4;
	}
	
	public void setCardsOnTable(int cardsOnTable) {
		this.cardsOnTable = cardsOnTable;			// om man vill ändra
	}
	
	public int getCardsOnTable() {
		return cardsOnTable;
	}
	
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	public boolean isLegal(Card[] cardArr, Card c) {

		for (int i = 0; i < cardArr.length; i++) {
			if(c.getValue() < cardArr[i].getValue())
				return false;
		}

		int total = 0;

		for(int i = 0; i < cardArr.length; i++) {
			total += cardArr[i].getValue();
		}

		if(total % c.getValue() == 0)
			return true;

		return false;
	}
	
	public boolean isGameOver() {
		if(dealer.isDeckEmpty()) // och om spelarna har slut på kort i hand) 
			return true;
		return false;
	}
	
	
	

}
