package se.hig.oodp.kasino.control;

import java.awt.List;
import java.io.IOException;




import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;

public class GameLogic {

	private GameRules rules;
	private Dealer dealer;
	private SpelPlan spelPlan;

	private Table table;
	private PlayerList playerList;
	private Scoreboard scoreboard;

	public GameLogic(GameRules rules, Dealer dealer, SpelPlan plan){


		this.rules = rules;
		this.dealer = dealer;
		this.spelPlan = plan;

		playerList = new PlayerList(rules.getNbrOfPlayerUser(), rules.getNbrOfPlayerAI());
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

	public void cardTaken(Card[] onTable, Card playerCard, int id) {
		if(rules.isLegal(onTable, playerCard)) {
			try {
				scoreboard.incrementScore(id);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e + " Något har gått fel med spelar-id och scoreboard-id.");
			}

		}
	}
	public void cardPlaced(Card c) {
		if(!table.isCardOnTable(c)) 
			table.setCard(c);
	}

	public String gameOver() {
		if(rules.isGameOver(dealer, playerList)) {
			return scoreboard.getPlayerScores();
		}
		return "";
	}

	public void newGame() throws IOException { //Återställer kortleken och rensar spelarnas händer

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
		dealer.dealToPlayers();

		spelPlan.cardsOnTable(playerList.getPlayerList());
		spelPlan.repaint();
	}
}
