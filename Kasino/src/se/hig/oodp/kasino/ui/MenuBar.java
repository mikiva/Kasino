package se.hig.oodp.kasino.ui;

import java.awt.Component;
import java.awt.MenuComponent;
import java.awt.MenuContainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.Serializable;

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
	
	
	JMenu menu, submenu;
	JMenuItem menuItemDeal;
	JMenuItem menuItemNew;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	
	GameLogic logic;
	
	public MenuBar(GameLogic logic){
		
		this.logic = logic;
		menuBar = new JMenuBar();
		
		menu = new JMenu("deal");
		menu.setMnemonic(KeyEvent.VK_A);
		
		menuBar.add(menu);
		
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
				
				logic.deal(); //anropar spellogiken som delar ut kort till varje spelare
			}
		});
		//menuItem.addActionListener(deal);
		
		
	}

	@Override
	public void remove(MenuComponent comp) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public JMenuBar getMenuBar(){
		
		return menuBar;
	}
	
	
	

}
