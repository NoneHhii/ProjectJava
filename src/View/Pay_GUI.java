package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.MatteBorder;

import Controller.Navigation;
import Controller.ctrl_Pay;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Pay_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public JButton btnCash;
	public JButton btnBank;
	public JButton btnMomo;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Pay_GUI frame = new Pay_GUI();
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
	public Pay_GUI() {
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setBounds(100, 100, 1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 1920, 1080));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Action Event
		ActionListener navigate = new Navigation(this);
		ActionListener actionEV = new ctrl_Pay(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(252, 185, 0));
		panelTitle.setBounds(0, 0, 1550, 50);
		contentPane.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(Pay_GUI.class.getResource("/img/icon_back.png")));
		lblBack.setBounds(10, 10, 37, 30);
		panelTitle.add(lblBack);
		lblBack.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				new Order_GUI();
				dispose();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblTitlePay = new JLabel("Thanh toán");
		lblTitlePay.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTitlePay.setForeground(new Color(255, 255, 255));
		lblTitlePay.setBounds(131, 10, 132, 30);
		panelTitle.add(lblTitlePay);
		
		JPanel panelMain = new JPanel();
		panelMain.setBackground(new Color(255, 255, 255));
		panelMain.setBounds(0, 51, 1540, 784);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBackground(new Color(255, 255, 255));
		panelInfo.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panelInfo.setBounds(0, 0, 770, 784);
		panelMain.add(panelInfo);
		panelInfo.setLayout(null);
		
		JPanel panelDiscount_1 = new JPanel();
		panelDiscount_1.setBounds(0, 0, 769, 130);
		panelDiscount_1.setLayout(null);
		panelDiscount_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelDiscount_1.setBackground(Color.WHITE);
		panelInfo.add(panelDiscount_1);
		
		JPanel panelHandle = new JPanel();
		panelHandle.setBackground(new Color(255, 255, 255));
		panelHandle.setBounds(770, 0, 770, 784);
		panelMain.add(panelHandle);
		panelHandle.setLayout(null);
		
		JPanel panelDiscount = new JPanel();
		panelDiscount.setBackground(new Color(255, 255, 255));
		panelDiscount.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelDiscount.setBounds(0, 0, 770, 130);
		panelHandle.add(panelDiscount);
		panelDiscount.setLayout(null);
		
		JLabel lblDiscount = new JLabel("Giảm giá:");
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDiscount.setBounds(79, 55, 100, 20);
		panelDiscount.add(lblDiscount);
		
		JComboBox cbbxDiscount = new JComboBox();
		cbbxDiscount.setBounds(414, 55, 240, 26);
		panelDiscount.add(cbbxDiscount);
		
		JPanel panelSurcharge = new JPanel();
		panelSurcharge.setBackground(new Color(255, 255, 255));
		panelSurcharge.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panelSurcharge.setLayout(null);
		panelSurcharge.setBounds(0, 130, 770, 130);
		panelHandle.add(panelSurcharge);
		
		JLabel lblSurcharge = new JLabel("Phụ thu:");
		lblSurcharge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSurcharge.setBounds(79, 55, 100, 20);
		panelSurcharge.add(lblSurcharge);
		
		JComboBox cbbxSurcharge = new JComboBox();
		cbbxSurcharge.setBounds(414, 55, 240, 26);
		panelSurcharge.add(cbbxSurcharge);
		
		JPanel panelProvisional = new JPanel();
		panelProvisional.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelProvisional.setBackground(new Color(255, 255, 255));
		panelProvisional.setBounds(0, 260, 770, 60);
		panelHandle.add(panelProvisional);
		panelProvisional.setLayout(null);
		
		JLabel lblProvisional = new JLabel("Tạm tính:");
		lblProvisional.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProvisional.setBounds(79, 25, 150, 18);
		panelProvisional.add(lblProvisional);
		
		JLabel lblProvisionalCost = new JLabel("0 Đ");
		lblProvisionalCost.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProvisionalCost.setBounds(691, 25, 45, 18);
		panelProvisional.add(lblProvisionalCost);
		
		JPanel panelMofCus = new JPanel();
		panelMofCus.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelMofCus.setBackground(new Color(255, 255, 255));
		panelMofCus.setLayout(null);
		panelMofCus.setBounds(0, 500, 770, 60);
		panelHandle.add(panelMofCus);
		
		JLabel lblMofCus = new JLabel("Tiền khách đưa:");
		lblMofCus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMofCus.setBounds(79, 25, 150, 18);
		panelMofCus.add(lblMofCus);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(550, 8, 150, 36);
		panelMofCus.add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel = new JLabel("Đ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(705, 10, 11, 33);
		panelMofCus.add(lblNewLabel);
		
		JPanel panelTotalDiscount = new JPanel();
		panelTotalDiscount.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelTotalDiscount.setBackground(new Color(255, 255, 255));
		panelTotalDiscount.setLayout(null);
		panelTotalDiscount.setBounds(0, 320, 770, 60);
		panelHandle.add(panelTotalDiscount);
		
		JLabel lblTotalDiscount = new JLabel("Giảm giá:");
		lblTotalDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalDiscount.setBounds(79, 25, 150, 18);
		panelTotalDiscount.add(lblTotalDiscount);
		
		JLabel lblTotalCostDiscount = new JLabel("0 Đ");
		lblTotalCostDiscount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalCostDiscount.setBounds(691, 25, 45, 18);
		panelTotalDiscount.add(lblTotalCostDiscount);
		
		JPanel panelTotalSurcharge = new JPanel();
		panelTotalSurcharge.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelTotalSurcharge.setBackground(new Color(255, 255, 255));
		panelTotalSurcharge.setLayout(null);
		panelTotalSurcharge.setBounds(0, 380, 770, 60);
		panelHandle.add(panelTotalSurcharge);
		
		JLabel lblTotalSurcharge = new JLabel("Phụ thu:");
		lblTotalSurcharge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalSurcharge.setBounds(79, 25, 150, 18);
		panelTotalSurcharge.add(lblTotalSurcharge);
		
		JLabel lblTotalCostSurcharge = new JLabel("0 Đ");
		lblTotalCostSurcharge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalCostSurcharge.setBounds(691, 25, 45, 18);
		panelTotalSurcharge.add(lblTotalCostSurcharge);
		
		JPanel panelTotal = new JPanel();
		panelTotal.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelTotal.setBackground(new Color(255, 255, 255));
		panelTotal.setLayout(null);
		panelTotal.setBounds(0, 440, 770, 60);
		panelHandle.add(panelTotal);
		
		JLabel lblTotal = new JLabel("Tổng cộng:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(79, 25, 150, 18);
		panelTotal.add(lblTotal);
		
		JLabel lblTotalPrice = new JLabel("0 Đ");
		lblTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalPrice.setBounds(691, 25, 45, 18);
		panelTotal.add(lblTotalPrice);
		
		JPanel panelMoneyChange = new JPanel();
		panelMoneyChange.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panelMoneyChange.setBackground(new Color(255, 255, 255));
		panelMoneyChange.setLayout(null);
		panelMoneyChange.setBounds(0, 560, 770, 60);
		panelHandle.add(panelMoneyChange);
		
		JLabel lblMoneyChange = new JLabel("Tiền thừa:");
		lblMoneyChange.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMoneyChange.setBounds(79, 25, 150, 18);
		panelMoneyChange.add(lblMoneyChange);
		
		JLabel lblCostChange = new JLabel("0 Đ");
		lblCostChange.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCostChange.setBounds(691, 25, 45, 18);
		panelMoneyChange.add(lblCostChange);
		
		btnCash = new JButton("Tiền mặt");
		btnCash.setFocusPainted(false);
		btnCash.setForeground(new Color(255, 255, 255));
		btnCash.setBackground(new Color(252, 185, 0));
		btnCash.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCash.setBounds(85, 640, 140, 75);
		btnCash.addActionListener(actionEV);
		panelHandle.add(btnCash);
		
		btnBank = new JButton("Ngân hàng");
		btnBank.setFocusPainted(false);
		btnBank.setOpaque(true);
		btnBank.setForeground(new Color(0, 0, 0));
		btnBank.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBank.setBackground(new Color(255, 255, 255));
		btnBank.setBounds(329, 640, 140, 75);
		btnBank.addActionListener(actionEV);
		panelHandle.add(btnBank);
		
		btnMomo = new JButton("MoMo");
		btnMomo.setFocusPainted(false);
		btnMomo.setOpaque(true);
		btnMomo.setForeground(new Color(0, 0, 0));
		btnMomo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMomo.setBackground(new Color(255, 255, 255));
		btnMomo.setBounds(563, 640, 140, 75);
		btnMomo.addActionListener(actionEV);
		panelHandle.add(btnMomo);
		
		JButton btnPay = new JButton("THANH TOÁN");
		btnPay.setForeground(new Color(255, 255, 255));
		btnPay.setBorderPainted(false);
		btnPay.setFocusPainted(false);
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPay.setBackground(new Color(98, 95, 229));
		btnPay.setBounds(0, 736, 770, 48);
		panelHandle.add(btnPay);
		btnPay.addActionListener(navigate);
		
		this.setVisible(true);
	}
	
	public void setBtnSelect(JButton jButton, int flat) { 
		
		jButton.setForeground(new Color(255, 255, 255));
		jButton.setBackground(new Color(252, 185, 0));
		if(flat == 1) {
			resetBtn(btnCash);
		}else if(flat == 2) {
			resetBtn(btnBank);
		}else if(flat == 3) {
			resetBtn(btnMomo);
		}
	}
	
	public void resetBtn(JButton jButton) {
		jButton.setForeground(new Color(0, 0, 0));
		jButton.setBackground(new Color(255, 255, 255));
		jButton.setFont(new Font("Tahoma", Font.BOLD, 18));
	}
}
