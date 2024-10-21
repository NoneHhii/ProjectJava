package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Order_GUI;

public class ctrl_Oder implements ActionListener{
	Order_GUI gui;
	int flat= 1;
	
	public ctrl_Oder(Order_GUI od) {
		gui = od;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ac = e.getSource();
		
		if(ac.equals(gui.btnAll)) {
			gui.setBtnSelect(gui.btnAll, flat);
			flat = 1;
		}else if(ac.equals(gui.btnCoffee)) {
			gui.setBtnSelect(gui.btnCoffee, flat);
			flat = 2;
		}else if(ac.equals(gui.btnFruitTea)) {
			gui.setBtnSelect(gui.btnFruitTea, flat);
			flat = 3;
		}else if(ac.equals(gui.btnJuice)) {
			gui.setBtnSelect(gui.btnJuice, flat);
			flat = 4;
		}else if(ac.equals(gui.btnCake)) {
			gui.setBtnSelect(gui.btnCake, flat);
			flat = 5;
		}
		
	}

}
