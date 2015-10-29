package main;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;












import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

import se.hig.oodp.kasino.control.Dealer;
import se.hig.oodp.kasino.control.GameLogic;
import se.hig.oodp.kasino.control.GameRules;
import se.hig.oodp.kasino.ui.MainFrame;
import se.hig.oodp.kasino.ui.Drawing;
import se.hig.oodp.kasino.ui.MainFrame_01;
import se.hig.oodp.kasino.ui.MenuBar;
import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Deck;



public class Main {





	public static void main(String[] args) throws IOException {

		
		Dealer dealer;
		GameRules rules;
		GameLogic logic;
		
		JMenuBar menuBar;
		//JMenu menu, submenu;
		JMenuItem menuItem;
		JRadioButtonMenuItem rbMenuItem;
		JCheckBoxMenuItem cbMenuItem;



		int nbrOfPlayers = 4;

		Deck deck = new Deck();
		SpelPlan spelPlan = new SpelPlan(deck);

		//deck.print();

		dealer = new Dealer(deck, nbrOfPlayers);
		rules = new GameRules();


		deck.shuffle();

		logic = new GameLogic(rules, dealer, spelPlan);
		MenuBar menu = new MenuBar(logic);

		Drawing draw = new Drawing(deck);


		//		System.out.println("Blanda?");
		//		System.out.println("Klart vi ska blanda!!");


		//deck.print();


		MainFrame_01 frame = new MainFrame_01("hej", deck, draw, spelPlan); 

		frame.setJMenuBar(menu.getMenuBar());

		//	menuBar = new JMenuBar();
		//menu = new JMenu("Meny");
		//menu.setMnemonic(KeyEvent.VK_A);


		//menuBar.add(menu);
		//frame.setJMenuBar(menuBar);
		frame.repaint();
		frame.add(spelPlan);
		spelPlan.setVisible(true);
		
		frame.setVisible(true);

		spelPlan.repaint();



	}




}
