package se.hig.oodp.kasino_card_deck;

public class Card {

	int number;
	String color;
	int id;
	
	String cardName;

	public Card(int number, String color, int id) {
		this.number = number;
		this.color = color;
		this.id = id;

	}

	
	public String toString(){
		cardName = id + " " + color + " " + number;
		
		
		return cardName;
	}

}


