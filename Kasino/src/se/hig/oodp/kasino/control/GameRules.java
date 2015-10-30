package se.hig.oodp.kasino.control;

import se.hig.oodp.kasino_card_deck.Card;



public class GameRules {
	
	private int cardsOnTable;
	private int cardsToDeal;
	private int nbrOfPlayerUser;
	private int nbrOfPlayerAI;
	
	private static final int MININUM_PLAYERS = 2;
	private static final int MAXIMUM_PLAYERS = 4;
	
	public GameRules(int nbrOfPlayerUser, int nbrOfPlayerAI) {
		this.nbrOfPlayerUser = nbrOfPlayerUser;
		this.nbrOfPlayerAI = nbrOfPlayerAI;
		cardsOnTable = 4;
		cardsToDeal = 4;
		
		
		
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
		
		if(c.getValue() == total)
			return true;

		if(total % c.getValue() == 0)
			return true;

		else
			return false;
	}
	
	public boolean isGameOver(Dealer dealer, PlayerList playerList) {
		if(dealer.isDeckEmpty() && playerList.isAllPlayerHandEmpty()) 
			return true;
		return false;
	}
	
	public boolean isEnoughPlayers(int nbrOfPlayers) {
		if(nbrOfPlayers < MININUM_PLAYERS) 
			return false;
		if(nbrOfPlayers > MAXIMUM_PLAYERS)
			return false;
		return true;
	}
	
	public int getCardsOnTable() {
		return cardsOnTable;
	}
	
	public int getCardsToDeal() {
		return cardsToDeal;
	}
	
	public int getNbrOfPlayerUser() {
		return nbrOfPlayerUser;
	}
	
	public void setNbrOfPlayerUser(int nbrOfPlayerUser) {
		this.nbrOfPlayerUser = nbrOfPlayerUser;
	}
	
	public int getNbrOfPlayerAI() {
		return nbrOfPlayerAI;
	}
	
	public void setNbrOfPlayerAI(int nbrOfPlayerAI) {
		this.nbrOfPlayerAI = nbrOfPlayerAI;
	}
	
	
	

}
