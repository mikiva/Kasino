package control_TEST;


import java.util.ArrayList;
import java.util.List;

import data_TEST.Card;


public interface Player {
	
	public int getPlayerId();
	public void placeCard(int cardID);
	public boolean takeCard(List<Integer> cardIDList, int cardID, int index);
	public void addToHand(Card card);
	public void removeFromHand(int index);
	public void clearHand();
	public Card getCardOnHand(int cardID);
	public List<Card> getHand();
	public void setLogic(GameLogic logic);
	
	

}
