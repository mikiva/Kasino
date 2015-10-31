package gui_TEST;


import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data_TEST.Deck;
import data_TEST.Table;

public class TablePanel extends JPanel {

	private ImageList list;
	private Table table;
	private ApplicationLogic appLogic;
	private List<CardLabel> cardLabel;
	private int startingCards;

	public TablePanel(Table table, ApplicationLogic appLogic, int startingCards) {
		list = new ImageList();
		this.table = table;
		this.appLogic = appLogic;
		this.startingCards = startingCards;
		cardLabel = new ArrayList<CardLabel>();
	}
	
	public void addCardToTable(int id) {
		cardLabel.add(new CardLabel(list, appLogic));
		cardLabel.get(cardLabel.size() - 1).setIcon(list.getImage(id));
		cardLabel.get(cardLabel.size() - 1).setID(id);
		cardLabel.get(cardLabel.size() - 1).setOnTable(true);
		add(cardLabel.get(cardLabel.size() - 1));
	}
	
	public void addStartingCards() {
		for (int i = 0; i < startingCards; i++) {
			addCardToTable(table.getTableCards().get(i).getId());
		}
	}
	
	public void removeCardFromTable(int id) {
		cardLabel.remove(list.getImage(id));
	}




}
