package control_TEST;


import java.io.IOException;





import java.util.List;

import data_TEST.Card;
import data_TEST.Deck;
import data_TEST.Table;

public class GameLogic {

	private GameRules rules;
	private Dealer dealer;

	private Table table;
	private PlayerList playerList;
	private Scoreboard scoreboard;

	public GameLogic(GameRules rules, Dealer dealer, PlayerList playerList){


		this.rules = rules;
		this.dealer = dealer;

	
		this.playerList = playerList;
		this.playerList.setLogicToPlayers(this);
		scoreboard = new Scoreboard(rules.getNbrOfPlayerAI() + rules.getNbrOfPlayerUser());
	}

	public void setRules(GameRules rules) {
		this.rules = rules;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public void setScoreboard(Scoreboard scoreboard) {
		this.scoreboard = scoreboard;
	}

	public boolean cardTaken(List<Integer> onTable, int cardID, int playerID) {
		
		Card[] cardArr = new Card[onTable.size()];
		for (int i = 0; i < cardArr.length; i++) {
			cardArr[i] = table.getCardOnTable(onTable.get(i));
		}
		Card c = playerList.getPlayer(playerID).getCardOnHand(cardID);
		
		if(rules.isLegal(cardArr, c)) {
			try {
				for (int i = 0; i < cardArr.length; i++) {
					scoreboard.incrementScore(playerID);
				}	
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e + " Något har gått fel med spelar-id och scoreboard-id.");
			}
			for (int i = 0; i < cardArr.length; i++) {
				table.removeCardOnTable(cardArr[i].getId());
			}
			return true;
		}
		return false;
	}
	
	public void cardPlaced(Card c) {
		if(!table.isCardOnTable(c)) 
			table.addCardToTable(c);
	}
//
//	public String gameOver() {
//		if(rules.isGameOver(dealer, playerList)) {
//			return scoreboard.getPlayerScores();
//		}
//		return "";
//	}

	public void newGame() { //Återställer kortleken och rensar spelarnas händer

		playerList.clearAllHands();
		dealer.resetDeck();
		dealer.shuffleDeck();
		dealer.dealToPlayers();
		table.clearTable();
		dealer.dealToTable();
	}
}
