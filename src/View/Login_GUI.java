package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controller.Navigation;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;

public class Login_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldPass;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		textFieldPass = new JTextField();
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
		JButton btnLogin = new JButton("ĐĂNG NHẬP");
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
}
