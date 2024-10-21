package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import View.Bill_GUI;
import View.EmployeeManage;
import View.Home_GUI;
import View.Order_GUI;
import View.Pay_GUI;
import View.ProductManage;
import View.StatictisDay_GUI;

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
		} else if(ac.equals("Nhân viên")) {
			new EmployeeManage();
		} else if(ac.equals("Thống kê")) {
			new StatictisDay_GUI();
		}else if(ac.equals("Thanh toán")) {
			new Pay_GUI();
		}else if(ac.equals("Menu")) {
			new ProductManage();
		}else if(ac.equals("THANH TOÁN")) {
//			new Bill_GUI();
			new Home_GUI();
		}
		this.gui.dispose();
	}

}
