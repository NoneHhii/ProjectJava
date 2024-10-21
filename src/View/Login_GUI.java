package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controller.Navigation;
import Model.User;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;

public class Login_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JPasswordField textFieldPass;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_GUI() {
		setBounds(100, 100, 930, 980);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(190, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ActionListener ac = new Navigation(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Login_GUI.class.getResource("/img/logo.png")));
		lblLogo.setBounds(30, 44, 224, 156);
		contentPane.add(lblLogo);
		
		JLabel lblPhoneCall = new JLabel("");
		lblPhoneCall.setIcon(new ImageIcon(Login_GUI.class.getResource("/img/PhoneCall.png")));
		lblPhoneCall.setBounds(613, 54, 261, 68);
		contentPane.add(lblPhoneCall);
		
		JPanel panelInputName = new JPanel();
		panelInputName.setBackground(new Color(190, 127, 80));
		panelInputName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		panelInputName.setBounds(59, 330, 838, 59);
		contentPane.add(panelInputName);
		panelInputName.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIconName = new JLabel("");
		lblIconName.setIcon(new ImageIcon(Login_GUI.class.getResource("/img/User.png")));
		lblIconName.setBounds(new Rectangle(5, 0, 50, 50));
		lblIconName.setBackground(new Color(190, 127, 80));
		panelInputName.add(lblIconName, BorderLayout.WEST);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setBorder(null);
		panelInputName.add(textFieldName, BorderLayout.CENTER);
		textFieldName.setBackground(new Color(190, 127, 80));
		textFieldName.setColumns(10);
		
		JPanel panelInputPass = new JPanel();
		panelInputPass.setBackground(new Color(190, 127, 80));
		panelInputPass.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		panelInputPass.setBounds(59, 470, 838, 59);
		contentPane.add(panelInputPass);
		panelInputPass.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIconLock = new JLabel("");
		lblIconLock.setBackground(new Color(190, 127, 80));
		lblIconLock.setIcon(new ImageIcon(Login_GUI.class.getResource("/img/lockColor.png")));
		lblIconLock.setBounds(new Rectangle(5, 0, 50, 40));
		panelInputPass.add(lblIconLock, BorderLayout.WEST);
		
		textFieldPass = new JPasswordField();
		textFieldPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPass.setBorder(null);
		textFieldPass.setBackground(new Color(190, 127, 80));
		panelInputPass.add(textFieldPass, BorderLayout.CENTER);
		textFieldPass.setColumns(10);
		
		JLabel lblIconHide = new JLabel("");
		lblIconHide.setBounds(new Rectangle(5, 0, 50, 50));
		lblIconHide.setIcon(new ImageIcon(Login_GUI.class.getResource("/img/Eye_off.png")));
		panelInputPass.add(lblIconHide, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("   Quên mật khẩu?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(641, 572, 265, 37);
		contentPane.add(lblNewLabel);
		btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.setForeground(new Color(255, 0, 0));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setOpaque(true);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnLogin.setBounds(103, 728, 721, 83);
		btnLogin.setFocusPainted(false);
		btnLogin.setBorderPainted(false);
		btnLogin.addActionListener(ac);
		contentPane.add(btnLogin);
	}
	
	public void readFile(ArrayList<User> listUser) {
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(new File("user.txt"));
		    ois = new ObjectInputStream(fis);
		    
		} catch (Exception ex) {
		    ex.printStackTrace();
		} finally {
		    if(ois != null){
		        try {
		        	ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    } 
		}
	}
	
	public boolean checkAccount() {
		if(textFieldName.equals("") && textFieldPass.equals("")) {
			JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập đầy đủ thông tin");
		}
		return true;
	}
	
	
}
