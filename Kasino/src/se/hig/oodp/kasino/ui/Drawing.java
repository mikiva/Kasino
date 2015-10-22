package se.hig.oodp.kasino.ui;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import se.hig.oodp.kasino_card_deck.Deck;


public class Drawing extends JPanel implements MouseListener{

	Deck deck;
	Image img;
	int dx;
	

	public Drawing(Deck deck){

		this.deck = deck;
		

		addMouseListener(this);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);		
		Graphics2D g2 = (Graphics2D) g;

	
			
		g2.drawImage(img, 0, 0, null);
		
		
		repaint();


	}

	public void setImage(Image img){

		this.img = img;
		repaint();

	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
