package se.hig.oodp.kasino_card_deck;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card {

	int number;
	String color;
	int id;
	BufferedImage img;
	
	String cardName;

	public Card(int number, String color, int id) throws IOException {
		this.number = number;
		this.color = color;
		this.id = id;
		
		img = ImageIO.read(new File("/KASINO/CARDS/material/" + id +".png"));

	}

	
	public String toString(){
		cardName = id + " " + color + " " + number;
		
		
	
		return cardName;
	}
	
	public Image getImage(){
		
		
		return img;
		
		
	}
	
	

}


