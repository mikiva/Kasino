package se.hig.oodp.kasino.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import se.hig.oodp.kasino.control.Player;
import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;

import java.awt.FlowLayout;

public class SpelPlan extends JPanel implements MouseListener, MouseMotionListener{

	/**
	 * Create the panel.
	 */
	int xLoc;
	int yLoc;
	Deck deck;
	Image img;
	Image img2;
	MouseHandler handler;
	JLabel label1;
	boolean drag = false;
	ArrayList<JPanel> iconPane;
	JLabel draggy;
	JPanel centerPanel;
	JPanel leftPlayerPanel;
	JPanel rightPlayerPanel;
	JPanel userPlayerPanel;
	JPanel centerPanelContainer;

	JPanel oppositePlayerContainer;
	JLabel[] labels;
	ArrayList<Card> playerHand;
	ArrayList<Image> imgs;


	int x_offset;
	int y_offset;

	JPanel contentPane;
	public SpelPlan(Deck deck) {

		iconPane = new ArrayList<JPanel>();
		labels = new JLabel[4];
		this.deck = deck;
		imgs = new ArrayList<Image>();
		contentPane = new JPanel();
		//contentPane.setSize(1000, 800);
		contentPane.setLocation(0, 0);
		//contentPane.setLayout(null);

		//setPreferredSize(new Dimension(1000, 800));
		Container content = new JPanel(new GridLayout(3, 3, 0, 0));
		setLayout(new BorderLayout());

		add(contentPane, BorderLayout.CENTER);
		for (int i = 0; i <12; i++){


			img = deck.getImage(i);
			//iconPane = new JPanel(new BoxLayout(arg0, arg1));
			label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			//centerPanel.add(iconPane.add(label1));	


			//						contentPane.add(iconPane.add(label1));
			//						contentPane.add(iconPane.add(label1), BorderLayout.LINE_START);
			//						add(iconPane.add(label1), BorderLayout.WEST);
		}
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridheight = 150;



		userPlayerPanel = new JPanel();
		contentPane.setLayout(new BorderLayout());



		oppositePlayerContainer = new JPanel();
		JPanel oppositePlayerPanel = new JPanel();
		oppositePlayerContainer.setBounds(Window.WIDTH/2,0 , 500, 150);
		oppositePlayerContainer.setPreferredSize(new Dimension(MainFrame_01.WIDTH, 150));
		contentPane.add(oppositePlayerContainer, BorderLayout.NORTH);
		oppositePlayerContainer.setLayout(new FlowLayout());
		oppositePlayerContainer.add(oppositePlayerPanel);


		JPanel leftPanelContainer = new JPanel();
		leftPlayerPanel = new JPanel();
		leftPlayerPanel.setPreferredSize(new Dimension(150, 500));
		leftPanelContainer.add(leftPlayerPanel);

		JPanel rightPanelContainer = new JPanel();
		rightPlayerPanel = new JPanel();
		rightPlayerPanel.setPreferredSize(new Dimension(150, 500));
		rightPanelContainer.add(rightPlayerPanel);


		centerPanel = new JPanel();
		centerPanelContainer = new JPanel();
		centerPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		//centerPanelContainer.setLayout(new FlowLayout());
		centerPanel.setPreferredSize(new Dimension(500,500));
		centerPanelContainer.add(centerPanel);
		//userPlayerPanel.setLayout(new GridLayout(1, 4));

		
		JPanel userPanelContainer = new JPanel();
		//userPanelContainer.setBounds(MainFrame_01.WIDTH, 0, 500, 150);
		userPlayerPanel = new JPanel();
		userPlayerPanel.setPreferredSize(new Dimension(500, 150));
		contentPane.add(userPanelContainer, BorderLayout.SOUTH);
		userPlayerPanel.addMouseListener(this);
		userPanelContainer.add(userPlayerPanel);
		//leftPlayerPanel.setLayout(new BoxLayout(leftPlayerPanel, BoxLayout.Y_AXIS));
		rightPlayerPanel.setLayout(new BoxLayout(rightPlayerPanel, BoxLayout.Y_AXIS));

		//contentPane.setPreferredSize (new Dimension (1000, 800));

		//add(contentPane);

		//gbc.weighty = 150;

		//centerPanel.setBounds(0, 0, 10, 0);
		//contentPane.add(centerPanel, BorderLayout.CENTER);
		FlowLayout fl_centerPanel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		fl_centerPanel.setAlignOnBaseline(true);

		//centerPanel.addMouseListener(this);

		contentPane.add(centerPanelContainer, BorderLayout.CENTER);

		contentPane.add(leftPanelContainer, BorderLayout.WEST);
		leftPlayerPanel.addMouseListener(this);

		//leftPlayerPanel.setBounds(0,111, 150, 800);

		//rightPlayerPanel.setBounds(20, 0, 10, 0);
		contentPane.add(rightPanelContainer, BorderLayout.EAST);
		rightPlayerPanel.addMouseListener(this);


		//userPlayerPanel.setBounds(30, 0, 10, 0);



		//oppositePlayerPanel.setBounds(120, 0, 234, 122);







		for (int i = 0; i <4; i++){

			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			userPlayerPanel.add(label1, gbc);	

		}




		for (int i = 0; i <4; i++){

			img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			leftPlayerPanel.add(label1, gbc);	

		}
		for (int i = 0; i <4; i++){

			img = deck.getImage(i+1);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			oppositePlayerPanel.add(label1, gbc);	

		}
		for (int i = 0; i <4; i++){

			img = deck.getImage(i+2);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			rightPlayerPanel.add(label1, gbc);	

		}



		for (int i = 0; i <10; i++){

			img = deck.getImage(i+3);
			JLabel label1 = new JLabel(new ImageIcon(img));
			label1.addMouseListener(this);
			label1.addMouseMotionListener(this);
			centerPanel.add(label1);	

		}


		System.out.println("hejsan");




		setVisible(true);
		repaint();
	}


	public void cardsOnTable(Player[] players){

		xLoc = 100;
		yLoc = 100;

		try {
			for (int i = 0; i < players.length; i++){

				for (int j = 0; j < labels.length; j++)
				{	


					imgs.add(players[i].getHand().get(j).getImage());
					labels[j] = new JLabel(new ImageIcon(img));
					iconPane.add(new JPanel(new BoxLayout(labels[j], BoxLayout.X_AXIS)));
					contentPane.add(iconPane.get(j), BorderLayout.EAST);
					labels[i].setLocation(i+ 20, 30);
					contentPane.add(labels[i]);
					add(labels[i]);
					img = deck.getImage(i);

					img = players[i].getHand().get(j).getImage();
					labels[j] = new JLabel(new ImageIcon(img));
					//iconPane.add(new JPanel(new BoxLayout(labels[j], BoxLayout.X_AXIS)));
					//contentPane.add(iconPane.get(j), BorderLayout.EAST);
					//	labels[i].setLocation(i+ 20, 30);
					//contentPane.add(labels[i]);
					//add(labels[i]);
					//img = deck.getImage(i);
					repaint();



					xLoc += 10;

				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Korten slut!");

			e.printStackTrace();
		}

		repaint();

		//img = players[0].getHand().get(0).getImage();
		//repaint();



		//	paint(graphic);



	}


	//		@Override
	//		public void paintComponent(Graphics g) {
	//			super.paintComponent(g);
	//			Graphics2D g2 = (Graphics2D) g;
	//
	//			for (int i = 0; i < imgs.size(); i++)
	//			{g2.drawImage(imgs.get(i), (i *100), 100, null);}
	//			//g2.drawLine(100, 100, 300, 300);
	//
	//
	//		}



	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.drawImage(img, xLoc, 100, null);


		g2.drawLine(100, 100, 300, 300);


	}



	@Override
	public void mouseDragged(MouseEvent e) {


		if (draggy != null){
			draggy.setLocation(e.getX() , e.getY());
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


		System.out.println("remove");

		JComponent jc = (JComponent)e.getSource();



		if (jc instanceof JLabel)
			jc.setVisible(false);


		e.getSource();

		repaint();

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

		//JComponent jc = (JComponent)e.getSource();
		//	Component child = jc.findComponentAt(e.getPoint());
		//		if (child instanceof JLabel)
		//		{
		//
		//			x_offset = e.getX() - child.getX();
		//			y_offset = e.getY() - child.getY();
		//
		//			draggy = (JLabel)child;
		//			draggy.setSize(draggy.getPreferredSize());
		//
		//		}



		//	jc.repaint();




	}
	@Override
	public void mouseReleased(MouseEvent e) {
		drag=false;

		if (draggy != null) {

			draggy.setSize(draggy.getPreferredSize());
			draggy = null;
		}

		//setLayout(null);
		//		centerPanel.setLayout(null);
		//		leftPlayerPanel.setLayout(null);
		//		rightPlayerPanel.setLayout(null);
		//		oppositePlayerPanel.setLayout(null);
		//		userPlayerPanel.setLayout(null);



		// TODO Auto-generated method stub

	}
}


