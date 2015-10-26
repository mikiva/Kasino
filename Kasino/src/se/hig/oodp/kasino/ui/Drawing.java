package se.hig.oodp.kasino.ui;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import se.hig.oodp.kasino_card_deck.Deck;


public class Drawing extends JPanel implements MouseListener{

	Deck deck;
	Image img;
	int dx;
	
	
	JPanel centerPanel = new JPanel();
	JPanel leftPlayerPanel = new JPanel();
	JPanel rightPlayerPanel = new JPanel();
	JPanel userPlayerPanel = new JPanel();
	JPanel oppositePlayerPanel = new JPanel();
	
	

	public Drawing(Deck deck){

		this.deck = deck; 
		

		addMouseListener(this);
		
		

//		for (int i = 0; i <12; i++){
//
//			img = deck.getImage(i);
//			JLabel label1 = new JLabel(new ImageIcon(img));
//			centerPanel.add(label1);	
//
//		}
//
//
//
//
//		for (int i = 0; i <4; i++){
//
//			img = deck.getImage(i);
//			JLabel label1 = new JLabel(new ImageIcon(img));
//			userPlayerPanel.add(label1);	
//
//		}
//
//
//
//
//		for (int i = 0; i <4; i++){
//
//			img = deck.getImage(i);
//			JLabel label1 = new JLabel(new ImageIcon(img));
//			leftPlayerPanel.add(label1);	
//
//		}
//		for (int i = 0; i <4; i++){
//
//			img = deck.getImage(i);
//			JLabel label1 = new JLabel(new ImageIcon(img));
//			oppositePlayerPanel.add(label1);	
//
//		}
//		for (int i = 0; i <4; i++){
//
//			img = deck.getImage(i);
//			JLabel label1 = new JLabel(new ImageIcon(img));
//			rightPlayerPanel.add(label1);	
//
//		}
//		
//		
//		centerPanel.setBounds(267, 155, 450, 450);
//		getContentPane().add(centerPanel);
//		centerPanel.setLayout(new GridLayout(2, 6, 0, 0));
//
//
//		leftPlayerPanel.setBounds(-62, 93, 150, 600);
//		getContentPane().add(leftPlayerPanel);
//		leftPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));
//
//
//		rightPlayerPanel.setBounds(888, 80, 150, 600);
//		getContentPane().add(rightPlayerPanel);
//		rightPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));
//
//
//		userPlayerPanel.setBounds(267, 679, 450, 157);
//		getContentPane().add(userPlayerPanel);
//		userPlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));
//
//
//		oppositePlayerPanel.setBounds(267, -75, 450, 157);
//		getContentPane().add(oppositePlayerPanel);
//		oppositePlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));
//		
//		
//		
//		
//		
//
//	}

//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);		
//		Graphics2D g2 = (Graphics2D) g;
//
//	
//	//	g2.fillRect(0, 100, 100, 100);
//			
//		g2.drawImage(img, 0,0, null);
//		
//		
//		repaint();
//
//
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
