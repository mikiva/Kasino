package se.hig.oodp.kasino.control;

import java.awt.List;
import java.util.Collections;

import se.hig.oodp.kasino_card_deck.Deck;

public class Dealer implements DealerInterface{


	private Deck deck;

	private Player[] playerList;

	public Dealer(Deck deck, int nbr){

		this.deck = deck;




	}


	@Override
	public void shuffleDeck() {


		deck.shuffle();


	}



	@Override
	public void deal(Player[] players) {

		this.playerList = players;




		for (int i = 0; i <playerList.length; i++) //Loopar men varje spelare
		{
			dealToPlayer(i);
		}
		for (int i = 0; i <playerList.length; i++) //Skriver ut varje spelares hand(testsyfte)
			System.out.println(players[i].getHand());




	}

	@Override
	public void dealToPlayer(int playerID) {
		// TODO Auto-generated method stub
		if(!deck.getDeck().isEmpty()) {



			for (int j = 0; j <4; j++)  		//Delar ut fyra kort till respektive spelare
				playerList[playerID].setHand(deck.drawCard());


		}

		else System.out.println("Deck empty");

	}

	public boolean isDeckEmpty() {
		if(deck.getDeck().isEmpty())
			return true;
		return false;
	}
	
	

}
