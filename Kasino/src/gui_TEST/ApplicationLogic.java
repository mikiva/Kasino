package gui_TEST;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import control_TEST.GameLogic;
import data_TEST.Card;

public class ApplicationLogic {

	private List<Integer> tableCardList;
	private Integer handCardID;

	public ApplicationLogic() {
		tableCardList = new ArrayList<Integer>();
		handCardID = null;
	}
	
	public void placeCard(int id, PlayerPanel playerPanel, TablePanel tablePanel) {
		
	}
	
	public void addTableCardID(int cardID) {
		tableCardList.add(cardID);
		System.out.println("Kortet du valt har ID: " + cardID);
	}
	
	public void removeTableCardID(int cardID) {
		if(tableCardList.contains(cardID)) {
			tableCardList.remove(tableCardList.indexOf(cardID));
			System.out.println("Du tog bort kortet med ID: " + cardID);
		}
	}
	
	public void setHandCardID(int handCardID) {
		this.handCardID = handCardID;
		System.out.println("Kortet du valt har ID: " + handCardID);
	}
	
	public void removeHandCardID() {
		handCardID = null;
		System.out.println("Du tog bort kortet.");
	}

}
