package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Pay_GUI;

public class ctrl_Pay implements ActionListener{
	Pay_GUI gui;
	int flat = 1;
	
	public ctrl_Pay(Pay_GUI pg) {
		gui = pg;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ac = e.getSource();
			
		if(ac.equals(gui.btnCash)) {
			gui.setBtnSelect(gui.btnCash, flat);
			flat = 1;
		}else if(ac.equals(gui.btnBank)) {
			gui.setBtnSelect(gui.btnBank, flat);
			flat = 2;
		}else if(ac.equals(gui.btnMomo)) {
			gui.setBtnSelect(gui.btnMomo, flat);
			flat = 3;
		}
		
	}
	
	
}
