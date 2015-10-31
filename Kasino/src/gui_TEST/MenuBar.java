package gui_TEST;

import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control_TEST.GameLogic;

public class MenuBar extends JMenuBar {

	private JButton btnNewGame;
	private JButton btnTakeCard;
	private JButton btnPlaceCard;

	public MenuBar(GameLogic logic, PlayerPanel[] playerPanel, TablePanel tablePanel) {
		super();

		btnNewGame = new JButton("New Game");
		btnTakeCard = new JButton("Take Card(s)");
		btnPlaceCard = new JButton("Place Card");

		btnNewGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				logic.newGame();
				tablePanel.addStartingCards();
				playerPanel[0].setThisPlayersTurn(true);

				for (int i = 0; i < playerPanel.length; i++) {
					if(playerPanel[i].isThisPlayersTurn()) {
						playerPanel[i].setHandCards();
					}
					else 
						playerPanel[i].setFaceDownCards();
				}

				for (int j = 0; j < 4; j++) {

				}
			}

		});

		btnPlaceCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});




		add(btnNewGame);
		add(btnTakeCard);
		add(btnPlaceCard);
	}

}
