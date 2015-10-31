package control_TEST;

import java.util.List;
import java.util.Random;

import data_TEST.Card;

public class PlayerAI implements Player {
	
	private List<Card> cards;
	private int playerID;
	private GameLogic logic;
	
	public PlayerAI(int playerID) {
		this.playerID = playerID;
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
	public void addToHand(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearHand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Card> getHand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeCard(List<Integer> cardIDList, int cardID, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromHand(int index) {
		// TODO Auto-generated method stub
		
	}

}
