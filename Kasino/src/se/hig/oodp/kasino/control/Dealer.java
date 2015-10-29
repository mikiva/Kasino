package se.hig.oodp.kasino.control;

import java.awt.List;
import java.io.IOException;
import java.util.Collections;

import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;

public class Dealer implements DealerInterface{


	private Deck deck;
	private Player[] playerList;
	private GameLogic logic;

	private GameRules rules;
	private Table table;

	public Dealer(Deck deck, GameRules rules){
		this.deck = deck;
		this.rules = rules;
	}

	@Override
	public void shuffleDeck() {
		deck.shuffle();
	}

	public void dealToTable() {
		for (int i = 0; i < rules.getCardsOnTable(); i++) {
			table.setCard(deck.drawCard());
		}
	}


	public void dealToPlayers() {
		if(!isDeckEmpty()) {

			shuffleDeck();
			for (int i = 0; i < playerList.length; i++) {
				for (int n = 0; n < rules.getCardsToDeal() ; n++) 
					playerList[n].addToHand(deck.drawCard());
			}
		}
		else System.out.println("Deck empty");

	}

	public void resetDeck() throws IOException {
		deck = new Deck();
	}

	public boolean isDeckEmpty() {
		if(deck.getDeck().isEmpty())
			return true;
		return false;
	}
	public void setPlayerList(Player[] playerList) {


		this.playerList = playerList;
	}

	public void setLogic(GameLogic logic) {
		this.logic = logic;
	}

	public void setRules(GameRules rules) {
		this.rules = rules;
	}

	public void setTable(Table table) {
		this.table = table;
	}


}
