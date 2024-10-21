package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;

import Controller.Navigation;
import Controller.ctrl_Oder;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Order_GUI extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldSearch;
	public JButton btnAll;
	public JButton btnCoffee;
	public JButton btnFruitTea;
	public JButton btnJuice;
	public JButton btnCake;

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
		setBounds(100, 100, 1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 239, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ActionEvent
		ActionListener navigate = new Navigation(this);
		ActionListener btnSlt = new ctrl_Oder(this);
		
		btnAll = new JButton("Tất cả");
		btnAll.setForeground(new Color(255, 255, 255));
		btnAll.setBackground(new Color(252, 185, 0));
		btnAll.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAll.setBounds(38, 115, 230, 73);
		btnAll.setFocusPainted(false);
		btnAll.setBorderPainted(false);
		btnAll.addActionListener(btnSlt);
		contentPane.add(btnAll);
		
		btnCoffee = new JButton("Coffee");
		btnCoffee.setBackground(new Color(255, 255, 255));
		btnCoffee.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCoffee.setBounds(38, 218, 230, 73);
		btnCoffee.setFocusPainted(false);
		btnCoffee.setBorderPainted(false);
		btnCoffee.addActionListener(btnSlt);
		contentPane.add(btnCoffee);
		
		btnFruitTea = new JButton("Trà trái cây");
		btnFruitTea.setBackground(new Color(255, 255, 255));
		btnFruitTea.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnFruitTea.setBounds(38, 321, 230, 73);
		btnFruitTea.setFocusPainted(false);
		btnFruitTea.setBorderPainted(false);
		btnFruitTea.addActionListener(btnSlt);
		contentPane.add(btnFruitTea);
		
		btnJuice = new JButton("Nước ép");
		btnJuice.setBackground(new Color(255, 255, 255));
		btnJuice.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnJuice.setBounds(38, 424, 230, 73);
		btnJuice.setFocusPainted(false);
		btnJuice.setBorderPainted(false);
		btnJuice.addActionListener(btnSlt);
		contentPane.add(btnJuice);
		
		btnCake = new JButton("Bánh");
		btnCake.setBackground(new Color(255, 255, 255));
		btnCake.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCake.setBounds(38, 527, 230, 73);
		btnCake.setFocusPainted(false);
		btnCake.setBorderPainted(false);
		btnCake.addActionListener(btnSlt);
		contentPane.add(btnCake);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(306, 115, 956, 730);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JPanel item1 = new JPanel();
		item1.setBorder(null);
		item1.setBackground(new Color(255, 255, 255));
		item1.setBounds(new Rectangle(38, 5, 242, 369));
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
		item2.setBounds(356, 5, 242, 369);
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
		
		JPanel panelSearch = new JPanel();
		panelSearch.setBackground(new Color(255, 255, 255));
		panelSearch.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(252, 185, 0)));
		panelSearch.setBounds(10, 25, 238, 45);
		pnlOder.add(panelSearch);
		panelSearch.setLayout(null);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.setIcon(new ImageIcon(Order_GUI.class.getResource("/img/search.png")));
		lblSearch.setBounds(0, 5, 40, 35);
		panelSearch.add(lblSearch);
		
		textFieldSearch = new JTextField("Nhập tên món...");
		textFieldSearch.setBorder(null);
		textFieldSearch.setBounds(40, 5, 188, 35);
		textFieldSearch.setForeground(Color.GRAY);
		textFieldSearch.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(textFieldSearch.getText().isEmpty()) {
					textFieldSearch.setForeground(Color.GRAY);
					textFieldSearch.setText("Nhập tên món...");
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(textFieldSearch.getText().equals("Nhập tên món...")) {
					textFieldSearch.setText("");
					textFieldSearch.setForeground(Color.BLACK);
				}
			}
		});
		
		panelSearch.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton btnPay = new JButton("Thanh toán");
		btnPay.setForeground(new Color(255, 255, 255));
		btnPay.setBackground(new Color(98, 95, 229));
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPay.setBorderPainted(false);
		btnPay.setFocusPainted(false);
		btnPay.setBounds(10, 670, 238, 45);
		btnPay.addActionListener(navigate);
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
		
		JScrollPane scrollOrder = new JScrollPane();
		scrollOrder.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollOrder.getVerticalScrollBar().setUnitIncrement(15);
		scrollOrder.setBounds(0, 108, 258, 492);
		pnlOder.add(scrollOrder);
		
		JPanel jPanelListOrder = new JPanel(new GridLayout(20, 1));
		scrollOrder.setViewportView(jPanelListOrder);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 255));
//		panel_1.setBounds(new Rectangle(0, 0, 258, 30));
		panel_1.setPreferredSize(new Dimension(258, 50));
		panel_1.setMinimumSize(new Dimension(258, 50));
		jPanelListOrder.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1x");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 26, 50);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cà phê đá");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(26, 0, 109, 50);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("29 000Đ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(135, 0, 73, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(Order_GUI.class.getResource("/img/trash.png")));
		lblNewLabel_4.setBounds(208, 0, 30, 50);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(255, 255, 255));
//		panel_2.setBounds(new Rectangle(0, 0, 258, 30));
		panel_2.setPreferredSize(new Dimension(258, 50));
		panel_2.setMinimumSize(new Dimension(258, 50));
		jPanelListOrder.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("1x");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(0, 0, 26, 50);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cà phê đá");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(26, 0, 109, 50);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("29 000Đ");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(135, 0, 73, 50);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(Order_GUI.class.getResource("/img/trash.png")));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(208, 0, 30, 50);
		panel_2.add(lblNewLabel_4_1);
		
		this.setVisible(true);
	}
	
	public void setBtnSelect(JButton jButton, int flat) { 
		
		jButton.setForeground(new Color(255, 255, 255));
		jButton.setBackground(new Color(252, 185, 0));
		jButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		if(flat == 1) {
			resetBtn(btnAll);
		}else if(flat == 2) {
			resetBtn(btnCoffee);
		}else if(flat == 3) {
			resetBtn(btnFruitTea);
		}else if(flat == 4) {
			resetBtn(btnJuice);
		}else if(flat == 5) {
			resetBtn(btnCake);
		}
	}
	
	public void resetBtn(JButton jButton) {
		jButton.setForeground(new Color(0, 0, 0));
		jButton.setBackground(new Color(255, 255, 255));
		jButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
	}
}
