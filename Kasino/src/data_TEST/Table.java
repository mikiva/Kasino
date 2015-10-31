package data_TEST;

import java.util.ArrayList;
import java.util.List;

public class Table {

	List<Card> onTable;

	public Table() {
		onTable = new ArrayList<Card>();
	}

	public void addCardToTable(Card card) {
		onTable.add(card);
	}

	public void removeCard(int index) {
		onTable.remove(index);
	}

	public boolean isCardOnTable(Card card) {
		for (int j = 0; j < onTable.size(); j++) {

			if(card.equals(onTable.get(j)))
				return true;
		}
		return false;
	}
	
	public List<Card> getTableCards() {
		return onTable;
	}

}
