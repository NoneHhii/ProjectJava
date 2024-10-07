package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.Home_GUI;
import View.Order_GUI;

public class Navigation implements ActionListener{
	JFrame gui;
	
	public Navigation(JFrame g) {
		this.gui = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		
		if(ac.equals("ĐĂNG NHẬP")) {
			new Home_GUI();
			
		} else if (ac.equals("Order")) {
			new Order_GUI();
		}
		this.gui.dispose();
	}

}
