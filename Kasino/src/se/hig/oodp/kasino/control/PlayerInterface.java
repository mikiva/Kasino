package se.hig.oodp.kasino.control;

import java.awt.List;


public interface PlayerInterface {
	
	public int getPlayerId();
	public void playCard();
	public void takeCard();
	public void setHand(List card);
	
	

}
