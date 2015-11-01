package control_TEST;

import data_TEST.Card;



public class GameRules {
	
	private int cardsOnTable;
	private int cardsToDeal;
	private int nbrOfPlayerUser;
	private int nbrOfPlayerAI;

	public GameRules(int nbrOfPlayerUser, int nbrOfPlayerAI) {
		this.nbrOfPlayerUser = nbrOfPlayerUser;
		this.nbrOfPlayerAI = nbrOfPlayerAI;
		cardsOnTable = 4;
		cardsToDeal = 4;
	}
	
	public boolean isLegal(Card[] cardsOnTable, Card cardOnHand) {

		for (int i = 0; i < cardsOnTable.length; i++) {
			if(cardOnHand.getValue() < cardsOnTable[i].getValue())
				return false;
		}

		int total = 0;

		for(int i = 0; i < cardsOnTable.length; i++) {
			total += cardsOnTable[i].getValue();
		}

		if(total % cardOnHand.getValue() == 0)
			return true;

		return false;
	}
	
	public boolean isGameOver(Dealer dealer, PlayerList playerList) {
		if(dealer.isDeckEmpty() && playerList.isAllPlayerHandEmpty()) 
			return true;
		return false;
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
