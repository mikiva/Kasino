package se.hig.oodp.kasino.ui;

import java.awt.Component;
import java.awt.MenuComponent;
import java.awt.MenuContainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.accessibility.Accessible;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import se.hig.oodp.kasino.control.Dealer;
import se.hig.oodp.kasino.control.GameLogic;

public class MenuBar extends MenuComponent implements MenuContainer, Serializable, Accessible{


	JMenuBar menuBar;

	SpelPlan spelPlan;
	JMenu menu, submenu;
	JMenuItem menuItemDeal;
	JMenuItem menuItemNew;
	JMenuItem go;
	JMenuItem putCard;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	ArrayList<Integer> cards;
	GameLogic logic;

	public MenuBar(GameLogic logic, SpelPlan plan){

		cards = new ArrayList<Integer>();
		this.logic = logic;
		menuBar = new JMenuBar();
		this.spelPlan = plan;
		menu = new JMenu("deal");
		menu.setMnemonic(KeyEvent.VK_A);

		menuBar.add(menu);

		putCard = new JMenuItem("Put Card");
		go = new JMenuItem("Go");
		menu.add(go);
		menu.add(putCard);
		menuItemDeal = new JMenuItem("deal");
		menu.add(menuItemDeal);
		menuItemNew = new JMenuItem("New Deck");
		menu.add(menuItemNew);
		menuItemNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logic.newGame();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		menuItemDeal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				try {
					logic.newGame();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} //anropar spellogiken som delar ut kort till varje spelare
			}
		});
		//menuItem.addActionListener(deal);

		go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//logic.cardTaken(onTable, playerCard, id);

				//	logic.setPlayerPickedCard(spelPlan.getPlayerPicked());
				try{
					logic.cardTaken(spelPlan.getTableCards(), spelPlan.getPlayerCard(), 0);


					if(logic.cardTaken(spelPlan.getTableCards(), spelPlan.getPlayerCard(), 0))
					{spelPlan.upDatePlan(spelPlan.getTableCards(), spelPlan.getPlayerCard());

					}
				}
				catch(IndexOutOfBoundsException e2)
				{

					System.out.println("Välj kort");
				}


			}
		});

		putCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				logic.cardPlaced(spelPlan.getPlayerCard());
				spelPlan.putCard(spelPlan.getPlayerCard());

			}
		});

	}

	@Override
	public void remove(MenuComponent comp) {
		// TODO Auto-generated method stub

	}



	public JMenuBar getMenuBar(){

		return menuBar;
	}




}
