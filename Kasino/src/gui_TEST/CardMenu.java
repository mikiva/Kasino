package gui_TEST;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class CardMenu extends JPopupMenu {
	
	JMenuItem btnSelect;
	
	public CardMenu() {
		
		
		btnSelect = new JMenuItem("Select card");
		
		btnSelect.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
	}

}
