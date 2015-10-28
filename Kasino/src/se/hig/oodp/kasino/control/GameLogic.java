package se.hig.oodp.kasino.control;

import java.awt.List;
import java.io.IOException;




import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;

public class GameLogic {

	Deck deck;
	GameRules rules;
	Dealer dealer;
	int nbrOfPlayers;
	Player[] playerList;
	SpelPlan spelPlan;

	private Table table;



	public GameLogic(GameRules rules, Dealer dealer, int nbr, Deck deck, SpelPlan plan){


		this.rules = rules;
		this.dealer = dealer;
		playerList = new Player[nbr];
		this.nbrOfPlayers = nbr;
		this.deck = deck;
		this.spelPlan = plan;

		playerList[0] = new Player(1);
		for (int i = 1; i< playerList.length; i++)
			playerList[i] = new Player(i);

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

		dealer.dealToPlayers();
		
		spelPlan.cardsOnTable(playerList);
		spelPlan.repaint();
		
		deck = new Deck();

		for (int i = 0; i < playerList.length; i++)
		{
			playerList[i].clearHand();
		}

	}
}
