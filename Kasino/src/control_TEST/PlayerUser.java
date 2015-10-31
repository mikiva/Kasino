package control_TEST;

import java.util.ArrayList;
import java.util.List;

import data_TEST.Card;

public class PlayerUser implements Player{


	private List<Card> cards;
	private int playerID;
	private GameLogic logic;

	public PlayerUser(int playerID){

		this.playerID = playerID;
		cards = new ArrayList<Card>();
	}

	@Override
	public int getPlayerId() {
		return playerID;
	}

	@Override
	public void placeCard(Card card) {
		logic.cardPlaced(card);

	}

	@Override
	public void takeCard(List<Integer> cardIDList, int cardID, int index) {
		if(logic.cardTaken(cardIDList, cardID, playerID))
			cards.remove(index);
	}

	@Override
	public void addToHand(Card card) {
		cards.add(card);
	}

	public List<Card> getHand(){
		return cards;
	}

	public void clearHand(){
		cards.clear();	
	}

	@Override
	public void removeFromHand(int index) {
		cards.remove(index);

	}


}
