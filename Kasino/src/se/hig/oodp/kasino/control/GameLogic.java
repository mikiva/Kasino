package se.hig.oodp.kasino.control;


import java.util.List;
import java.io.IOException;





import se.hig.oodp.kasino.ui.SpelPlan;
import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;

public class GameLogic {

	private GameRules rules;
	private Dealer dealer;
	private SpelPlan spelPlan;

	private Table table;
	private PlayerList playerList;
	private Scoreboard scoreboard;
	
	private Card[] cArr;

	public GameLogic(GameRules rules, Dealer dealer, SpelPlan plan){


		this.rules = rules;
		this.dealer = dealer;
		this.spelPlan = plan;
	

		playerList = new PlayerList(rules.getNbrOfPlayerUser(), rules.getNbrOfPlayerAI());
	}

	public void setRules(GameRules rules) {
		this.rules = rules;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public void setScore(Scoreboard scoreboard) {
		this.scoreboard = scoreboard;
	}

	public boolean cardTaken(List<Integer> onTable, int playerCard, int id) {
		
		cArr = new Card[onTable.size()];
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = table.getCards().get(onTable.get(i));
			System.out.println(cArr[0]);
		}
		Card c = playerList.getPlayer(id).getHand().get(playerCard);
		
		
		if(rules.isLegal(cArr, c)) {
			try {
				System.out.println("jajamän!");
				scoreboard.incrementScore(id);
				return true;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e + " Något har gått fel med spelar-id och scoreboard-id.");
			}
			
			playerList.getPlayer(0).removeFromHand(playerCard);
			
			
			
			
			
			
			}
		else if (!rules.isLegal(cArr, c))
		{
			System.out.println("nope!");
			

		}
		return false;
	}
	
	
	public Scoreboard getScore(){
		
		return scoreboard;
		
	}
	
	public void cardPlaced(int i) {
		if(!table.isCardOnTable(table.getCards().get(i))) 
		{	table.setCard(playerList.getPlayer(0).getHand().get(i));
		playerList.getPlayer(0).removeFromHand(i);
		}
		
	}

	public String gameOver() {
		if(rules.isGameOver(dealer, playerList)) {
			return scoreboard.getPlayerScores();
		}
		return "";
	}

	public void newGame() throws IOException { //Återställer kortleken och rensar spelarnas händer

		for (int i = 0; i < playerList.getNumberOfPlayers(); i++)
		{
			try {
				playerList.getPlayer(i).clearHand();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		dealer.resetDeck();
		dealer.setPlayerList(playerList);
		dealer.dealToPlayers();
		dealer.dealToTable();
		
		spelPlan.cardsOnTable(playerList);
		
	
		

		
		spelPlan.repaint();
		
	}
}
