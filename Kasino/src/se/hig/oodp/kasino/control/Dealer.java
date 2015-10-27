package se.hig.oodp.kasino.control;

import java.awt.List;
import java.util.Collections;

import se.hig.oodp.kasino_card_deck.Deck;

public class Dealer implements DealerInterface{


	private Deck deck;
	private Player[] playerList;
	
	private static int CARDS_TO_DEAL = 4;

	public Dealer(Deck deck, int nbr){
		this.deck = deck;
	}

	public void setPlayerList(Player[] playerList) {
		this.playerList = playerList;
	}

	@Override
	public void shuffleDeck() {
		deck.shuffle();
	}
	
	/*
	 * kan vi inte kombinera deal() och dealToPlayer()?
	 * 
	 * public void dealToPlayers() {
	 * if(!isDeckEmpty()) {
	 * 
	 * 	for (int i = 0; i < playerList.length; i++) {
				for (int n = 0; n < CARDS_TO_DEAL ; n++) 
					playerList[n].addToHand(deck.drawCard());
				}
			}
		else System.out.println("Deck empty");
		
		}
	 */

	@Override
	public void deal(Player[] players) {

		for (int i = 0; i <playerList.length; i++) //Loopar men varje spelare
		{
			dealToPlayer(i);
		}
		for (int i = 0; i <playerList.length; i++) //Skriver ut varje spelares hand(testsyfte)
			System.out.println(players[i].getHand());
	}

	@Override
	public void dealToPlayer(int playerID) {

		if(!deck.getDeck().isEmpty()) {

			for (int j = 0; j <4; j++)  		//Delar ut fyra kort till respektive spelare
				playerList[playerID].addToHand(deck.drawCard());

		}

		else System.out.println("Deck empty");

	}

	public boolean isDeckEmpty() {
		if(deck.getDeck().isEmpty())
			return true;
		return false;
	}



}
