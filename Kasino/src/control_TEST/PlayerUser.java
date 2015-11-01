package control_TEST;

import java.util.ArrayList;
import java.util.List;

import data_TEST.Card;

public class PlayerUser implements Player{


	private List<Card> hand;
	private int playerID;
	private GameLogic logic;

	public PlayerUser(int playerID){
		this.logic = logic;
		this.playerID = playerID;
		hand = new ArrayList<Card>();
	}

	@Override
	public int getPlayerId() {
		return playerID;
	}

	@Override
	public void placeCard(int cardID) {
		for (int i = 0; i < hand.size(); i++) {
			if(hand.get(i).getId() == cardID) {
				try {
					Card c = hand.get(i);
					logic.cardPlaced(c);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
				
		}
	}

	@Override
	public boolean takeCard(List<Integer> cardIDList, int cardID, int index) {
		if(logic.cardTaken(cardIDList, cardID, playerID)) {
			hand.remove(index);
			return true;
		}
		return false;
	}

	@Override
	public void addToHand(Card card) {
		hand.add(card);
	}
	
	@Override
	public Card getCardOnHand(int cardID) {
		for (int i = 0; i < hand.size(); i++) {
			if(hand.get(i).getId() == cardID)
				return hand.get(i);
		}
		return hand.get(0);
	}

	public List<Card> getHand(){
		return hand;
	}

	public void clearHand(){
		hand.clear();	
	}

	@Override
	public void removeFromHand(int index) {
		hand.remove(index);

	}

	@Override
	public void setLogic(GameLogic logic) {
		// TODO Auto-generated method stub
		this.logic = logic;
	}


}
