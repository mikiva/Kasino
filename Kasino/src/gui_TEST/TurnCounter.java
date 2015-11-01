package gui_TEST;

import java.util.ArrayList;
import java.util.List;

public class TurnCounter {

	PlayerPanel[] player;
	
	public TurnCounter(PlayerPanel[] player) {
		this.player = player;

	}
	
	public int getCurrentPlayersTurn() {
		for (int i = 0; i < player.length; i++) {
			if(player[i].isThisPlayersTurn())
				return i;
		}
		return -1;
	}

	public void nextPlayerTurn() {
		player[getCurrentPlayersTurn()].setThisPlayersTurn(false);
		try {
			player[getCurrentPlayersTurn() + 1].setThisPlayersTurn(true);
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			player[0].setThisPlayersTurn(true);
		}
	}

	public void setPlayerTurn(int index) {

	}



}
