package se.hig.oodp.kasino.control;

public class GameRules {
	
	Dealer dealer;
	
	public GameRules() {
		
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	public boolean isGameOver() {
		if(dealer.isDeckEmpty()) // och om spelarna har slut på kort i hand) 
			return true;
		return false;
	}
	
	
	

}
