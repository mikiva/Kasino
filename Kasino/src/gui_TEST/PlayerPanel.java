package gui_TEST;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import control_TEST.Player;
import data_TEST.Deck;

public class PlayerPanel extends JPanel {

	private ImageList list;
	private Player player;
	private CardLabel[] cardLabel;
	private boolean isThisPlayersTurn;
	private ApplicationLogic appLogic;

	public PlayerPanel(Player player, ApplicationLogic appLogic) {
		list = new ImageList();
		this.player = player;
		cardLabel = new CardLabel[4];
		this.appLogic = appLogic;

		isThisPlayersTurn = false;

		for (int i = 0; i < cardLabel.length; i++) {
			try {
				cardLabel[i] = new CardLabel(list, appLogic);
				this.add(cardLabel[i]);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setAllToSelectable() {
		for (int i = 0; i < cardLabel.length; i++) {
			cardLabel[i].setSelectable(true);
			}
	}

	public void setHandCards() {
		int temp;
		for (int i = 0; i < cardLabel.length; i++) {
			temp = player.getHand().get(i).getId();
			cardLabel[i].setIcon(list.getImage(temp));
			cardLabel[i].setID(temp);
		}	

	}

	public void emptyCardLabels() {
		for (int i = 0; i < cardLabel.length; i++) {
			if(cardLabel[i].getIcon() != null)
				cardLabel[i].setIcon(null);
		}
	}

	public void setFaceDownCards() {
		for (int i = 0; i < cardLabel.length; i++) {
			cardLabel[i].setIcon(list.getFaceDownImage());
			cardLabel[i].setClickable(false);
		}
	}
	
	public void removeCardFromHand(int id) {
		for (int i = 0; i < cardLabel.length; i++) {
			if(cardLabel[i].getID() == id) {
				cardLabel[i].setIcon(null);
			}
		}
	}

	public boolean isThisPlayersTurn() {
		return isThisPlayersTurn;
	}

	public void setThisPlayersTurn(boolean isThisPlayersTurn) {
		this.isThisPlayersTurn = isThisPlayersTurn;
	}

	public CardLabel getCardLabel(int index) {
		return cardLabel[index];
	}

	public Player getPlayer() {
		return player;
	}

}
