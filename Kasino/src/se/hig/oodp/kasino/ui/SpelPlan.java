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
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import se.hig.oodp.kasino.control.GameLogic;
import se.hig.oodp.kasino.control.Player;
import se.hig.oodp.kasino.control.PlayerList;
import se.hig.oodp.kasino.control.Scoreboard;
import se.hig.oodp.kasino_card_deck.Card;
import se.hig.oodp.kasino_card_deck.Deck;
import se.hig.oodp.kasino_card_deck.Table;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;

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
	private JPanel userPlayerPanel_1;
	JPanel centerPanelContainer;
	JPanel oppositePlayerPanel;
	JPanel leftPanelContainer;
	JPanel userPanelContainer;
	JPanel rightPanelContainer;
	JPanel oppositePlayerContainer;
	JLabel[] labels;
	GridBagConstraints gbc;
	ArrayList<Card> playerHand;
	ArrayList<Image> imgs;
	ArrayList<Card> markedCards;
	ArrayList<JLabel> cardLabels;
	PlayerList playerList;
	ArrayList<JLabel> tableCards;
	ArrayList<Integer> marked;
	int picked = -1;
	int x_offset;
	int y_offset;
	Table table;
	JPanel contentPane;
	GameLogic logic;

	JMenuBar menuBar;
	JMenuItem menuItem;
	private JLabel lblNewLabel;
	public SpelPlan(Deck deck) {


		cardLabels = new ArrayList<JLabel>();

		tableCards = new ArrayList<JLabel>();

		marked = new ArrayList<Integer>();
		iconPane = new ArrayList<JPanel>();
		labels = new JLabel[4];
		this.deck = deck;
		imgs = new ArrayList<Image>();
		contentPane = new JPanel();
		//contentPane.setSize(1000, 800);
		contentPane.setLocation(0, 0);
		//contentPane.setLayout(null);
		markedCards = new ArrayList<Card>();
		//setPreferredSize(new Dimension(1000, 800));
		Container content = new JPanel(new GridLayout(3, 3, 0, 0));
		setLayout(new BorderLayout());

		add(contentPane, BorderLayout.CENTER);
		//		for (int i = 0; i <12; i++){
		//
		//
		//			img = deck.getImage(i);
		//			//iconPane = new JPanel(new BoxLayout(arg0, arg1));
		//			label1 = new JLabel(new ImageIcon(img));
		//			label1.addMouseListener(this);
		//			label1.addMouseMotionListener(this);
		//			//centerPanel.add(iconPane.add(label1));	
		//
		//
		//			//						contentPane.add(iconPane.add(label1));
		//			//						contentPane.add(iconPane.add(label1), BorderLayout.LINE_START);
		//			//						add(iconPane.add(label1), BorderLayout.WEST);
		//		}
		gbc = new GridBagConstraints();
		gbc.gridheight = 150;



		userPlayerPanel = new JPanel();
		contentPane.setLayout(new BorderLayout());



		oppositePlayerContainer = new JPanel();
		oppositePlayerPanel = new JPanel();
		oppositePlayerContainer.setBounds(Window.WIDTH/2,0 , 500, 150);
		oppositePlayerContainer.setPreferredSize(new Dimension(MainFrame_01.WIDTH, 150));
		contentPane.add(oppositePlayerContainer, BorderLayout.NORTH);
		oppositePlayerContainer.setLayout(new FlowLayout());
		oppositePlayerContainer.add(oppositePlayerPanel);


		leftPanelContainer = new JPanel();
		leftPlayerPanel = new JPanel();
		leftPlayerPanel.setPreferredSize(new Dimension(150, 500));
		leftPanelContainer.add(leftPlayerPanel);

		rightPanelContainer = new JPanel();
		rightPlayerPanel = new JPanel();
		rightPlayerPanel.setPreferredSize(new Dimension(150, 500));
		rightPanelContainer.add(rightPlayerPanel);


		centerPanel = new JPanel();
		centerPanelContainer = new JPanel();
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		//centerPanelContainer.setLayout(new FlowLayout());
		centerPanel.setPreferredSize(new Dimension(500,500));
		centerPanelContainer.add(centerPanel);
		//userPlayerPanel.setLayout(new GridLayout(1, 4));


		userPanelContainer = new JPanel();
		//userPanelContainer.setBounds(MainFrame_01.WIDTH, 0, 500, 150);
		userPlayerPanel = new JPanel();
		userPlayerPanel.setPreferredSize(new Dimension(500, 150));
		contentPane.add(userPanelContainer, BorderLayout.SOUTH);
		userPlayerPanel.addMouseListener(this);
		userPanelContainer.add(userPlayerPanel);
		//leftPlayerPanel.setLayout(new BoxLayout(leftPlayerPanel, BoxLayout.Y_AXIS));
		//	rightPlayerPanel.setLayout(new BoxLayout(rightPlayerPanel, BoxLayout.Y_AXIS));

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

		//	lblNewLabel = new JLabel("points");

		//rightPanelContainer.add(lblNewLabel);
		rightPlayerPanel.addMouseListener(this);


		//userPlayerPanel.setBounds(30, 0, 10, 0);



		//oppositePlayerPanel.setBounds(120, 0, 234, 122);


		for (int i = 0; i<4; i++)
		{cardLabels.add(new JLabel());
		userPlayerPanel.add(cardLabels.get(i), gbc);
		}


		setVisible(true);
		repaint();




	}

	public void setLogic(GameLogic logic)
	{
		this.logic = logic;
	}

	public void setTable(Table table){

		this.table = table;

	}
	public void setMenuBar(JMenuBar menu)
	{this.menuBar = menu;}


	public void cardsOnTable(PlayerList playerList){

		this.playerList = playerList;


		for (int i = 0; i <4; i++){


			img = playerList.getPlayer(0).getHand().get(i).getImage();
			//img = deck.getImage(i);
			cardLabels.get(i).setIcon(new ImageIcon(img));
			//cardLabels[i] = new JLabel(new ImageIcon());
			cardLabels.get(i).addMouseListener(this);
			cardLabels.get(i).addMouseMotionListener(this);
			//	userPlayerPanel.add(cardLabels[i], gbc);	
			userPlayerPanel.repaint();

		}




		for (int i = 0; i <4; i++){

			//img = deck.getImage(i+3);


			img = table.getCards().get(i).getImage();

			tableCards.add(new JLabel(new ImageIcon(img)));
			tableCards.get(i).addMouseListener(this);
			tableCards.get(i).addMouseMotionListener(this);
			centerPanel.add(tableCards.get(i));	

		}



		for (int i = 0; i <4; i++){

			img = playerList.getPlayer(1).getHand().get(i).getImage();
			//img = deck.getImage(i);
			JLabel label1 = new JLabel(new ImageIcon(img));
			//			label1.addMouseListener(this);
			//			label1.addMouseMotionListener(this);
			leftPlayerPanel.add(label1, gbc);	

		}
		for (int i = 0; i <4; i++){

			img = playerList.getPlayer(2).getHand().get(i).getImage();
			//img = deck.getImage(i);

			label1 = new JLabel(new ImageIcon(img));
			//			label1.addMouseListener(this);
			//			label1.addMouseMotionListener(this);
			oppositePlayerPanel.add(label1, gbc);
			//label1.

		}
		for (int i = 0; i <4; i++){

			img = playerList.getPlayer(3).getHand().get(i).getImage();

			//img = deck.getImage(i+2);
			JLabel label1 = new JLabel(new ImageIcon(img));
			//	label1.addMouseListener(this);
			//label1.addMouseMotionListener(this);
			rightPlayerPanel.add(label1, gbc);	

		}




		System.out.println("hejsan");

		setVisible(true);
		repaint();

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



		if(jc instanceof JLabel)
		{

			//((JLabel) jc).setIcon(null);

			for (int i = 0; i<cardLabels.size(); i++){
				if(cardLabels.get(i).equals(jc)){




					System.out.println(playerList.getPlayer(0).getHand().get(i));

					System.out.println(i);
					//cardLabels.remove(i);

					//playerList.getPlayer(0).ta

					setPickedPlayerCard(i);


				}
			}

			System.out.println(picked);


			for (int i = 0; i < tableCards.size(); i++) {
				if(tableCards.get(i).equals(jc)){
					if(marked.contains(i) != true)
					{
						marked.add(i);
						System.out.println(table.getCards().get(i));
						//System.out.println(i);
						setPickedTableCards(marked);
						System.out.println(marked);
					}

					else
					{
						for (int j = 0; j < marked.size(); j++) 
							if(i == marked.get(j))
								marked.remove(j);


						System.out.println("avmarkerat");
						setPickedTableCards(marked);
					}







				}




			}


			//	System.out.println(cardLabels[2].equals(jc));
		}



		//	markedCards.add(jc);







		e.getSource();

		repaint();

		//	System.out.println((e.getSource().toString()));


	}

	public void setPickedPlayerCard(int i){
		picked = i;
	}
	public int getPlayerCard(){
		System.out.println("Picked player card "+ playerList.getPlayer(0).getHand().get(picked));
		return picked;
	}

	public void setPickedTableCards(ArrayList<Integer> cards){

		this.marked = cards;
	}
	public ArrayList<Integer> getTableCards(){
		System.out.println("Picked from table: " + table.getCards().get(marked.get(0)));
		return marked;
	}

	public void upDatePlan(ArrayList<Integer> k, int j)
	{
		for (int i = 0; i < tableCards.size(); i++) {
			for (int l = 0; l < k.size(); l++) {


				if (i == k.get(l)){
					tableCards.get(i).setIcon(null);
				}
			}
		}

		cardLabels.get(j).setIcon(null);

		setPickedPlayerCard(0);
		marked.clear();
		setPickedTableCards(marked);

	}

	public void putCard(int i){

		tableCards.add(new JLabel(new ImageIcon(playerList.getPlayer(0).getHand().get(i).getImage())));
		cardsOnTable(playerList);
		repaint();
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


