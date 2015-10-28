package se.hig.oodp.kasino.control;

import java.awt.List;
import java.io.IOException;




import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;

public class GameLogic {

	GameRules rules;
	Dealer dealer;
	SpelPlan spelPlan;

	private Table table;

	private PlayerList playerList;
	
	int nbrOfPlayerUsers;
	int nbrOfPlayerAI;


	public GameLogic(GameRules rules, Dealer dealer, SpelPlan plan){


		this.rules = rules;
		this.dealer = dealer;
		this.spelPlan = plan;
		
		playerList = new PlayerList(nbrOfPlayerUsers, nbrOfPlayerAI);
//		playerList[0] = new PlayerUser(1);
//		for (int i = 1; i< playerList.length; i++)
//			playerList[i] = new PlayerUser(i+1);

	}
	
	public void setRules(GameRules rules) {
		this.rules = rules;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public void cardTaken(Card[] onTable, Card playerCard, int id) {
		if(rules.isLegal(onTable, playerCard)) {
			//ge spelaren poäng (baserat på id kanske?)

		}
		else {
			//???

		}
	}
	public void cardPlaced(Card c) {
		if(!table.isCardOnTable(c)) 
			table.setCard(c);
	}

	public void gameOver() {
		if(rules.isGameOver()) {
			//gör något som avslutar spelet
		}
	}

	public void newGame() throws IOException{ //Återställer kortleken och rensar spelarnas händer
		
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
