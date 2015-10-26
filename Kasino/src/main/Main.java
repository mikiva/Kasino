package main;

import java.awt.Image;
import java.io.IOException;








import javax.swing.JPanel;

import se.hig.oodp.kasino.control.Dealer;
import se.hig.oodp.kasino.control.GameLogic;
import se.hig.oodp.kasino.control.GameRules;
import se.hig.oodp.kasino.ui.MainFrame;
import se.hig.oodp.kasino.ui.Drawing;
import se.hig.oodp.kasino.ui.MainFrame_01;
import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Deck;

public class Main {

	


	public static void main(String[] args) throws IOException {

		
		
		

		
		
		Deck deck = new Deck();
		SpelPlan spelPlan = new SpelPlan(deck);

		deck.print();

		Dealer dealer = new Dealer(deck);
		GameRules rules = new GameRules();
		//GameLogic logic = new GameLogic(rules, dealer/*, nbrOfPlayers*/);



		Drawing draw = new Drawing(deck);


//		System.out.println("Blanda?");
//		System.out.println("Klart vi ska blanda!!");

		//	deck.shuffle();
		deck.print();


		MainFrame_01 frame = new MainFrame_01("hej", deck, draw, spelPlan); 


		frame.setVisible(true);
		frame.repaint();




	}




}
