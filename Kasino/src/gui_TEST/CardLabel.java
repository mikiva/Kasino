package gui_TEST;

import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class CardLabel extends JLabel {

	private int id;
	private boolean isClickable;
	private boolean isOnTable;
	private ImageList list;

	private JPopupMenu menu;
	private JMenuItem menuPlace;
	private JMenuItem menuSelect;
	private JMenuItem menuDeselect;

	public CardLabel(ImageList list, ApplicationLogic appLogic) {
		this.list = list;
		isOnTable = false;
		isClickable = true;
		menu = new JPopupMenu();
		setComponentPopupMenu(menu);

		menuSelect = new JMenuItem("Select");
		menuDeselect = new JMenuItem("Deselect");
		menuPlace = new JMenuItem("Place card");

		menuDeselect.setVisible(false);

		menuSelect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(isClickable)
				{
					if(isOnTable) {
						appLogic.addTableCardID(id);
					}
					else {
						appLogic.setHandCardID(id);
					}
					menuSelect.setVisible(false);
					menuDeselect.setVisible(true);
				}

			}
		});

		menuDeselect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(isOnTable) {
					appLogic.removeTableCardID(id);
				}
				else {
					appLogic.removeHandCardID();
				}
				menuDeselect.setVisible(false);
				menuSelect.setVisible(true);
			}
		});

		menuPlace.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		menu.add(menuSelect);
		menu.add(menuDeselect);
		menu.add(menuPlace);


		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//				if(isClickable)
				//				{
				//					if(!isSelected && !SwingUtilities.isRightMouseButton(e)) {
				//						if(isOnTable) {
				//							appLogic.addTableCardID(id);
				//						}
				//						else {
				//							appLogic.setHandCardID(id);
				//						}
				//						isSelected = true;
				//					}
				//
				//					else if(isSelected && SwingUtilities.isRightMouseButton(e)) {
				//						if(isOnTable) {
				//							appLogic.removeTableCardID(id);
				//						}
				//						else {
				//							appLogic.removeHandCardID();
				//						}
				//							
				//						isSelected = false;
				//					}
				//				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}


	public boolean isOnTable() {
		return isOnTable;
	}

	public void setOnTable(boolean isOnTable) {
		this.isOnTable = isOnTable;

		if(isOnTable)
			menuPlace.setVisible(false);
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}

	public boolean isClickable() {
		return isClickable;
	}

	public void setClickable(boolean isClickable) {
		this.isClickable = isClickable;

		if(!isClickable) {
			menuPlace.setVisible(false);
			menuSelect.setVisible(false);
			menuDeselect.setVisible(false);
		}

	}

}
