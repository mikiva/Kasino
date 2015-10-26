package se.hig.oodp.kasino.ui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;

public class SpelPlan extends JPanel implements MouseListener, MouseMotionListener{

	/**
	 * Create the panel.
	 */

	Deck deck;
	Image img;
	Image img2;
	MouseHandler handler;
	JLabel label1;
	boolean drag = false;
	JLayeredPane iconPane;
	JLabel draggy;
	JPanel centerPanel;
	JPanel leftPlayerPanel;
	JPanel rightPlayerPanel;
	JPanel userPlayerPanel;
	JPanel oppositePlayerPanel;
	
	
	ArrayList<Card> playerHand = new ArrayList<Card>();


	int x_offset;
	int y_offset;

	JPanel contentPane;
	public SpelPlan(Deck deck) {



		this.deck = deck;

		contentPane = new JPanel();

		centerPanel = new JPanel();
		leftPlayerPanel = new JPanel();
		rightPlayerPanel = new JPanel();
		userPlayerPanel = new JPanel();
		oppositePlayerPanel = new JPanel();

		setPreferredSize (new Dimension (1000, 800));
		centerPanel.setLayout(null);


		setLayout(null);
		for (int i = 0; i <12; i++){

			
			img = deck.getImage(i);
			iconPane = new JLayeredPane();
			label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			centerPanel.add(iconPane.add(label1));	

		}




		for (int i = 0; i <4; i++){

			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			userPlayerPanel.add(label1);	

		}




		for (int i = 0; i <4; i++){

			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			leftPlayerPanel.add(label1);	

		}
		for (int i = 0; i <4; i++){

			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			oppositePlayerPanel.add(label1);	

		}
		for (int i = 0; i <4; i++){

			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			rightPlayerPanel.add(label1);	

		}


		centerPanel.setBounds(267, 155, 450, 450);
		//centerPanel.addMouseListener(this);
		add(centerPanel);

		centerPanel.setLayout(new GridLayout(2, 6, 0, 0));


		leftPlayerPanel.setBounds(-62, 93, 150, 600);
		//leftPlayerPanel.addMouseListener(this);
		add(leftPlayerPanel);
		leftPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));


		rightPlayerPanel.setBounds(888, 80, 150, 600);
		//rightPlayerPanel.addMouseListener(this);
		add(rightPlayerPanel);
		rightPlayerPanel.setLayout(new GridLayout(4, 1, 0, 0));


		userPlayerPanel.setBounds(267, 679, 450, 157);
		//userPlayerPanel.addMouseListener(this);
		add(userPlayerPanel);
		userPlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));


		oppositePlayerPanel.setBounds(267, -75, 450, 157);
		//oppositePlayerPanel.addMouseListener(this);
		add(oppositePlayerPanel);
		oppositePlayerPanel.setLayout(new GridLayout(0, 4, 0, 0));



		//setVisible(true);



	}
	@Override
	public void mouseDragged(MouseEvent e) {


		if (draggy != null){
			draggy.setLocation(e.getX()-x_offset , e.getY()-y_offset);
		}


		System.out.println("Drag");



	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("move");




	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//	System.out.println("klick");

		//	System.out.println((e.getSource().toString()));


	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("entered");

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//	System.out.println("exited");

 
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
		drag=true;

		JComponent jc = (JComponent)e.getSource();
		Component child = jc.findComponentAt(e.getPoint());
		if (child instanceof JLabel)
		{

			x_offset = e.getX() - child.getX();
			y_offset = e.getY() - child.getY();

			draggy = (JLabel) child;
			draggy.setSize(draggy.getPreferredSize());

		}



		jc.repaint();




	}
	@Override
	public void mouseReleased(MouseEvent e) {
		drag=false;

        if (draggy != null) {
            
            draggy.setSize(draggy.getPreferredSize());
            draggy = null;
        }
		
		setLayout(null);
		centerPanel.setLayout(null);
		leftPlayerPanel.setLayout(null);
		rightPlayerPanel.setLayout(null);
		oppositePlayerPanel.setLayout(null);
		userPlayerPanel.setLayout(null);
		
		

		// TODO Auto-generated method stub

	}






}


