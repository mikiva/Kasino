package temp;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;








import javax.swing.ImageIcon;
import javax.swing.JLabel;

import se.hig.oodp.kasino_card_deck.Deck;



public class ImageList {
	
	File folder;
	
	List<ImageIcon> list;
	
	//vart bilderna ska hämtas
	private final static String PATH = "H:/git/Kasino/Kasino/Kasino/CARDS/material";
	
	public ImageList(Deck deck) {
		
		list = new ArrayList<ImageIcon>();
		
		
		folder = new File(PATH);

		
		for(String f : folder.list()) {			//folder.list() är en lista med alla filer/directories som finns i samma directory som sig själv
			try {
				//sparar varje fil som ImageIcon i listan
				list.add(new ImageIcon(f));
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void print() {
		for(ImageIcon l : list) {
			System.out.println(l);
		}
	}


}
