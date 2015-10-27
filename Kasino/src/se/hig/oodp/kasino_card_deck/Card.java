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
	String path;
	File f;

	public Card(int number, String color, int id) throws IOException {
		this.number = number;
		this.color = color;
		this.id = id;
	
		path = "\"CARDS/material/"+(id)+".png\"";
		
	//	System.out.println(path);

		f = new File("CARDS/material/"+(id)+".png");
		img = ImageIO.read(f); 
	}

	
	public String toString(){
		return id + " " + color + " " + number;
	}
	
	public Image getImage(){
		return img;
	}
	
	public int getId(){
		return id;
	}
	
	

}


