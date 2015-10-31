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

	public boolean cardTaken(List<Integer> onTable, int playerCard, int id) {
		
		Card[] cArr = new Card[onTable.size()];
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = table.getTableCards().get(onTable.get(i));
			System.out.println(cArr[0]);
		}
		Card c = playerList.getPlayer(id).getHand().get(playerCard);
		
		if(rules.isLegal(cArr, c)) {
			try {
				for (int i = 0; i < cArr.length; i++) {
					scoreboard.incrementScore(id);
				}	
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e + " Något har gått fel med spelar-id och scoreboard-id.");
			}
			for (int i = 0; i < cArr.length; i++) {
				table.removeCard(i);
			}
			return true;
		}
		return false;
	}
	
	public void cardPlaced(Card c) {
		if(!table.isCardOnTable(c)) 
			table.addCardToTable(c);
	}

	public String gameOver() {
		if(rules.isGameOver(dealer, playerList)) {
			return scoreboard.getPlayerScores();
		}
		return "";
	}

	public void newGame() { //Återställer kortleken och rensar spelarnas händer

		for (int i = 0; i < playerList.getNumberOfPlayers(); i++)
		{
			try {
				playerList.getPlayer(i).clearHand();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		dealer.resetDeck();
		dealer.shuffleDeck();
		dealer.dealToPlayers();

	}
}
