package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Navigation;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Home_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home_GUI frame = new Home_GUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Home_GUI() {
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setBounds(100, 100, 1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 1920, 1080));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener navigate = new Navigation(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitleMng = new JLabel("Quản lý", SwingConstants.CENTER);
		lblTitleMng.setForeground(new Color(250, 255, 0));
		lblTitleMng.setFont(new Font("Tahoma", Font.PLAIN, 75));
		lblTitleMng.setBounds(0, 0, 1540, 267);
		contentPane.add(lblTitleMng);
		
		ImageIcon bgMenu = new ImageIcon("/img/btnMenuBG.png");
		JButton btnMenu = new JButton("Menu", bgMenu);
		btnMenu.setBackground(new Color(255, 255, 255));
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnMenu.setBounds(385, 277, 383, 253);
		btnMenu.setFocusPainted(false);
		btnMenu.setBorderPainted(false);
		btnMenu.addActionListener(navigate);
		contentPane.add(btnMenu);
		
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setBackground(new Color(255, 255, 255));
		btnOrder.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnOrder.setBounds(800, 277, 383, 253);
		btnOrder.setFocusPainted(false);
		btnOrder.setBorderPainted(false);
		btnOrder.addActionListener(navigate);
		contentPane.add(btnOrder);
		
		JButton btnNV = new JButton("Nhân viên");
		btnNV.setBackground(new Color(255, 255, 255));
		btnNV.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNV.setBounds(385, 563, 383, 253);
		btnNV.setFocusPainted(false);
		btnNV.setBorderPainted(false);
		btnNV.addActionListener(navigate);
		contentPane.add(btnNV);
		
		JButton btnThongKe = new JButton("Thống kê");
		btnThongKe.setBackground(new Color(255, 255, 255));
		btnThongKe.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnThongKe.setBounds(800, 563, 383, 253);
		btnThongKe.setFocusPainted(false);
		btnThongKe.setBorderPainted(false);
		btnThongKe.addActionListener(navigate);
		contentPane.add(btnThongKe);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Home_GUI.class.getResource("/img/backgroundHome.png")));
		lblBackground.setBounds(0, 0, 1554, 845);
		contentPane.add(lblBackground);
		
		this.setVisible(true);
	}
}
