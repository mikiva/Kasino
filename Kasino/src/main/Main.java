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
import javax.swing.SwingUtilities;

import se.hig.oodp.kasino.control.Dealer;
import se.hig.oodp.kasino.control.GameLogic;
import se.hig.oodp.kasino.control.GameRules;
import se.hig.oodp.kasino.control.Scoreboard;
import se.hig.oodp.kasino.ui.MainFrame;
import se.hig.oodp.kasino.ui.Drawing;
import se.hig.oodp.kasino.ui.MainFrame_01;
import se.hig.oodp.kasino.ui.MenuBar;
import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;



public class Main {





	public static void main(String[] args) throws IOException {


		Scoreboard score;
		Dealer dealer;
		GameRules rules;
		GameLogic logic;
		Table table;

		JMenuBar menuBar;
		//JMenu menu, submenu;
		JMenuItem menuItem;
		JRadioButtonMenuItem rbMenuItem;
		JCheckBoxMenuItem cbMenuItem;



		int nbrOfPlayers = 4;

		Deck deck = new Deck();
		SpelPlan spelPlan = new SpelPlan(deck);

		//deck.print();

		
		table = new Table();
		rules = new GameRules(4, 0);
		dealer = new Dealer(deck, rules);
		spelPlan.setTable(table);
		
		//	spelPlan.setMenuBar();
		score = new Scoreboard(rules.getNbrOfPlayerUser());
		

		deck.shuffle();

		logic = new GameLogic(rules, dealer, spelPlan);
		MenuBar menu = new MenuBar(logic, spelPlan);
		dealer.setTable(table);
		logic.setTable(table);
		logic.setScore(score);
		Drawing draw = new Drawing(deck);
		spelPlan.setLogic(logic);
		
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

		frame.add(spelPlan);


		frame.setVisible(true);
		spelPlan.setVisible(true);
		frame.repaint();

		//spelPlan.repaint();



	}




}
