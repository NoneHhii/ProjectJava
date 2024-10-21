package View;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class ProductManage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNamePD;
	private JTextField textFieldPrice;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ProductManage frame = new ProductManage();
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
	public ProductManage() {
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
		
		JLabel lblTitle = new JLabel("Quản lý sản phẩm");
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
		
		JLabel lblNamePD = new JLabel("Tên sản phẩm:");
		lblNamePD.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNamePD.setBounds(32, 30, 150, 25);
		panelForm.add(lblNamePD);
		
		JLabel lbIImgProduct = new JLabel("");
		lbIImgProduct.setIcon(new ImageIcon(ProductManage.class.getResource("/img/itemImgDefault.png")));
		lbIImgProduct.setBounds(1152, 10, 240, 310);
		panelForm.add(lbIImgProduct);
		
		textFieldNamePD = new JTextField();
		textFieldNamePD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNamePD.setBounds(193, 26, 280, 35);
		panelForm.add(textFieldNamePD);
		textFieldNamePD.setColumns(10);
		
		JLabel lblTypePD = new JLabel("Loại sản phẩm:");
		lblTypePD.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTypePD.setBounds(584, 30, 150, 25);
		panelForm.add(lblTypePD);
		
		String[] type = {"Coffee", "Trà trái cây", "Nước ép", "Bánh"};
		
		JComboBox comboBoxTypePD = new JComboBox();
		comboBoxTypePD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxTypePD.setBounds(745, 26, 280, 35);
		comboBoxTypePD.addItem("");
		for (String string : type) {
			comboBoxTypePD.addItem(string);
		}
		panelForm.add(comboBoxTypePD);
		
		JLabel lblPrice = new JLabel("Đơn giá:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(32, 119, 150, 25);
		panelForm.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(193, 115, 280, 35);
		panelForm.add(textFieldPrice);
		
		JLabel lblChooseImg = new JLabel("Hình ảnh:");
		lblChooseImg.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChooseImg.setBounds(584, 119, 150, 25);
		panelForm.add(lblChooseImg);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(745, 115, 280, 35);
		panelForm.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(ProductManage.class.getResource("/img/fileIcon.png")));
		lblNewLabel.setBounds(235, 0, 45, 35);
		panel.add(lblNewLabel);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(252, 185, 0));
		btnAdd.setBorderPainted(false);
		btnAdd.setFocusPainted(false);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(65, 280, 126, 40);
		panelForm.add(btnAdd);
		
		JButton btnUpdate = new JButton("Sửa");
		btnUpdate.setBackground(new Color(142, 135, 135));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFocusPainted(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBounds(321, 280, 126, 40);
		panelForm.add(btnUpdate);
		
		JButton btnDelete = new JButton("Xoá");
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setBorderPainted(false);
		btnDelete.setFocusPainted(false);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(577, 280, 126, 40);
		panelForm.add(btnDelete);
		
		JButton btnReset = new JButton("Làm mới");
		btnReset.setBackground(new Color(123, 141, 239));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFocusPainted(false);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(833, 280, 126, 40);
		panelForm.add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(45, 454, 1445, 391);
		contentPane.add(scrollPane);
		String[] colHeader = {"Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Đơn giá", "Hình ảnh"};
		DefaultTableModel modelProduct = new DefaultTableModel(colHeader, 0);
		table = new JTable(modelProduct);
		scrollPane.setViewportView(table);
		setVisible(true);
	}
}
