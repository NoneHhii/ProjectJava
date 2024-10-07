package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;

public class Order_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Order_GUI frame = new Order_GUI();
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
	public Order_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 239, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAll = new JButton("Tất cả");
		btnAll.setForeground(new Color(255, 255, 255));
		btnAll.setBackground(new Color(252, 185, 0));
		btnAll.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAll.setBounds(38, 115, 230, 73);
		btnAll.setFocusPainted(false);
		btnAll.setBorderPainted(false);
		contentPane.add(btnAll);
		
		JButton btnCoffee = new JButton("Coffee");
		btnCoffee.setBackground(new Color(255, 255, 255));
		btnCoffee.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCoffee.setBounds(38, 218, 230, 73);
		btnCoffee.setFocusPainted(false);
		btnCoffee.setBorderPainted(false);
		contentPane.add(btnCoffee);
		
		JButton btnFruitTea = new JButton("Trà trái cây");
		btnFruitTea.setBackground(new Color(255, 255, 255));
		btnFruitTea.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnFruitTea.setBounds(38, 321, 230, 73);
		btnFruitTea.setFocusPainted(false);
		btnFruitTea.setBorderPainted(false);
		contentPane.add(btnFruitTea);
		
		JButton btnJuice = new JButton("Nước ép");
		btnJuice.setBackground(new Color(255, 255, 255));
		btnJuice.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnJuice.setBounds(38, 424, 230, 73);
		btnJuice.setFocusPainted(false);
		btnJuice.setBorderPainted(false);
		contentPane.add(btnJuice);
		
		JButton btnCake = new JButton("Bánh");
		btnCake.setBackground(new Color(255, 255, 255));
		btnCake.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCake.setBounds(38, 527, 230, 73);
		btnCake.setFocusPainted(false);
		btnCake.setBorderPainted(false);
		contentPane.add(btnCake);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(306, 115, 956, 730);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel item1 = new JPanel();
		item1.setBorder(null);
		item1.setBackground(new Color(255, 255, 255));
		item1.setBounds(new Rectangle(0, 0, 240, 380));
		panel.add(item1);
		item1.setLayout(new BoxLayout(item1, BoxLayout.Y_AXIS));
		
		JLabel lblImg1 = new JLabel("");
		lblImg1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblImg1.setIcon(new ImageIcon(Order_GUI.class.getResource("/img/item16.png")));
		item1.add(lblImg1);
		
		JLabel lblItemName = new JLabel("Cà phê đá", SwingConstants.CENTER);
		lblItemName.setBorder(null);
		lblItemName.setMaximumSize(new Dimension(240, 30));
		lblItemName.setPreferredSize(new Dimension(240, 30));
		lblItemName.setFont(new Font("Tahoma", Font.PLAIN, 26));
		item1.add(lblItemName);
		
		JLabel lblNewLabel_2 = new JLabel("29000", SwingConstants.CENTER);
		lblNewLabel_2.setMaximumSize(new Dimension(240, 24));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		item1.add(lblNewLabel_2);
		
		JPanel item2 = new JPanel();
		item2.setBackground(new Color(255, 255, 255));
		panel.add(item2);
		item2.setLayout(new BoxLayout(item2, BoxLayout.Y_AXIS));
		
		JLabel lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(Order_GUI.class.getResource("/img/item12.png")));
		lblImg2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		item2.add(lblImg2);
		
		JLabel lblItemName2 = new JLabel("Cà phê sữa đá", SwingConstants.CENTER);
		lblItemName2.setPreferredSize(new Dimension(240, 30));
		lblItemName2.setMaximumSize(new Dimension(240, 30));
		lblItemName2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblItemName2.setBorder(null);
		item2.add(lblItemName2);
		
		JLabel lblNewLabel2 = new JLabel("29000", SwingConstants.CENTER);
		lblNewLabel2.setMaximumSize(new Dimension(240, 24));
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		item2.add(lblNewLabel2);
		
		JPanel pnlOder = new JPanel();
		pnlOder.setBackground(new Color(255, 255, 255));
		pnlOder.setBounds(1272, 115, 258, 730);
		contentPane.add(pnlOder);
		pnlOder.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(252, 185, 0)));
		panel_1.setBounds(10, 25, 238, 45);
		pnlOder.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Order_GUI.class.getResource("/img/search.png")));
		lblNewLabel.setBounds(0, 5, 40, 35);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBounds(40, 5, 188, 35);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnPay = new JButton("Thanh toán");
		btnPay.setForeground(new Color(255, 255, 255));
		btnPay.setBackground(new Color(98, 95, 229));
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPay.setBorderPainted(false);
		btnPay.setFocusPainted(false);
		btnPay.setBounds(10, 670, 238, 45);
		pnlOder.add(btnPay);
		
		JPanel panelTongTien = new JPanel();
		panelTongTien.setBackground(new Color(255, 255, 255));
		panelTongTien.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelTongTien.setBounds(0, 600, 258, 50);
		pnlOder.add(panelTongTien);
		panelTongTien.setLayout(null);
		
		JLabel lblTTTitle = new JLabel(" Tổng tiền:");
		lblTTTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTTTitle.setBounds(0, 0, 88, 50);
		panelTongTien.add(lblTTTitle);
		
		JLabel lblTTCost = new JLabel("0 Đ ", SwingConstants.RIGHT);
		lblTTCost.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTTCost.setBounds(98, 0, 160, 50);
		panelTongTien.add(lblTTCost);
		
		this.setVisible(true);
	}
}
