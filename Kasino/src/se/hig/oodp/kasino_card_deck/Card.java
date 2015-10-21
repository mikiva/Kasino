package se.hig.oodp.kasino_card_deck;

public class Card {

	int number;
	String color;
	
	String cardName;

	public Card(int number, String color) {
		this.number = number;
		this.color = color;

	}
	
	public String toString(){
		cardName = color + " " + number;
		
		
		return cardName;
	}

}


