package se.hig.oodp.kasino.control;

import java.awt.List;

public class GameLogic {


	GameRules rules;
	Dealer dealer;



	public GameLogic(GameRules rules, Dealer dealer, int nbr){


		this.rules = rules;
		this.dealer = dealer;
		Player[] player = new Player[nbr];

//		player[0] = new PlayerUser();
//		for (int i = 1; i< player.length; i++)
//			player[i] = new PlayerAI();


	}

	public void deal(){

		dealer.deal();

	}
	
	public void gameOver() {
		if(rules.isGameOver()) {
			//gör något som avslutar spelet
		}
	}






}
