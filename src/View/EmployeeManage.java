package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;

public class EmployeeManage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSalary;
	private JTextField textFieldDateStart;
	private JTextField textFieldPhoneCall;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EmployeeManage frame = new EmployeeManage();
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
	public EmployeeManage() {
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setBounds(100, 100, 1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 1920, 1080));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(98, 95, 229));
		panelTitle.setBounds(0, 0, 1535, 50);
		contentPane.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblTitle = new JLabel("Quản lý nhân viên");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitle.setBounds(652, 10, 230, 30);
		panelTitle.add(lblTitle);
		
		JLabel lblIconHome = new JLabel("New label");
		lblIconHome.setIcon(new ImageIcon(ProductManage.class.getResource("/img/icon_home_white.png")));
		lblIconHome.setBounds(10, 13, 24, 24);
		lblIconHome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				new Home_GUI();
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
		panelTitle.add(lblIconHome);
		
		JPanel panelForm = new JPanel();
		panelForm.setBounds(45, 60, 1445, 340);
		contentPane.add(panelForm);
		panelForm.setLayout(null);
		
		JLabel lblNameEmp = new JLabel("Tên nhân viên:");
		lblNameEmp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNameEmp.setBounds(20, 30, 150, 25);
		panelForm.add(lblNameEmp);
		
		JTextField textFieldNameEmp = new JTextField();
		textFieldNameEmp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNameEmp.setBounds(181, 26, 280, 35);
		panelForm.add(textFieldNameEmp);
		textFieldNameEmp.setColumns(10);
		
		JLabel lblPermit = new JLabel("Chức vụ:");
		lblPermit.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPermit.setBounds(501, 30, 150, 25);
		panelForm.add(lblPermit);
		
		JComboBox comboBoxPermit = new JComboBox();
		comboBoxPermit.setBounds(662, 28, 280, 35);
		panelForm.add(comboBoxPermit);
		
		JLabel lblPassword = new JLabel("Mật khẩu:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(20, 119, 150, 25);
		panelForm.add(lblPassword);
		
		JTextField textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(181, 115, 280, 35);
		panelForm.add(textFieldPassword);
		
		JLabel lblDateStart = new JLabel("Ngày vào làm:");
		lblDateStart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDateStart.setBounds(501, 119, 150, 25);
		panelForm.add(lblDateStart);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(252, 185, 0));
		btnAdd.setBorderPainted(false);
		btnAdd.setFocusPainted(false);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(100, 280, 161, 40);
		panelForm.add(btnAdd);
		
		JButton btnUpdate = new JButton("Sửa");
		btnUpdate.setBackground(new Color(142, 135, 135));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBounds(461, 280, 161, 40);
		panelForm.add(btnUpdate);
		
		JButton btnDelete = new JButton("Xoá");
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setBorderPainted(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(822, 280, 161, 40);
		panelForm.add(btnDelete);
		
		JButton btnReset = new JButton("Làm mới");
		btnReset.setBackground(new Color(123, 141, 239));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFocusPainted(false);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(1183, 280, 161, 40);
		panelForm.add(btnReset);
		
		JLabel lblSalary = new JLabel("Lương:");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSalary.setBounds(982, 119, 150, 25);
		panelForm.add(lblSalary);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(1143, 115, 280, 35);
		panelForm.add(textFieldSalary);
		
		textFieldDateStart = new JTextField();
		textFieldDateStart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldDateStart.setColumns(10);
		textFieldDateStart.setBounds(662, 115, 280, 35);
		panelForm.add(textFieldDateStart);
		
		JLabel lblPhoneNumber = new JLabel("Số điện thoại:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNumber.setBounds(982, 30, 150, 25);
		panelForm.add(lblPhoneNumber);
		
		textFieldPhoneCall = new JTextField();
		textFieldPhoneCall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPhoneCall.setColumns(10);
		textFieldPhoneCall.setBounds(1143, 28, 280, 35);
		panelForm.add(textFieldPhoneCall);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(45, 454, 1445, 391);
		contentPane.add(scrollPane);
		String[] colHeader = {"Mã nhân viên", "Tên nhân viên", "Chức vụ", "Số điện thoại", "Mật khẩu", "Ngày vào làm", "Lương"};
		DefaultTableModel modelProduct = new DefaultTableModel(colHeader, 0);
		JTable table = new JTable(modelProduct);
		scrollPane.setViewportView(table);
		setVisible(true);
	}
}
