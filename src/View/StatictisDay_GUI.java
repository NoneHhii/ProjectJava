package View;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StatictisDay_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StatictisDay_GUI frame = new StatictisDay_GUI();
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
	public StatictisDay_GUI() {
		
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
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 0, 1540, 835);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getVerticalScrollBar().setUnitIncrement(15);
		tabbedPane.addTab("Tổng quan", null, scrollPane, null);
		
		JPanel panelOverView = new JPanel();
		panelOverView.setPreferredSize(new Dimension(1640, 1200));
		panelOverView.setMinimumSize(new Dimension(1640, 1200));
		scrollPane.setViewportView(panelOverView);
		panelOverView.setLayout(null);
		
		JLabel lblStatTotal = new JLabel("Tổng doanh thu", SwingConstants.CENTER);
		lblStatTotal.setBackground(new Color(99, 143, 109));
		lblStatTotal.setOpaque(true);
		lblStatTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStatTotal.setForeground(new Color(255, 255, 255));
		lblStatTotal.setBounds(0, 40, 1533, 61);
		panelOverView.add(lblStatTotal);
		
		JPanel panelRevenue = new JPanel();
		panelRevenue.setBackground(new Color(123, 141, 239));
		panelRevenue.setBounds(127, 208, 300, 200);
		panelOverView.add(panelRevenue);
		panelRevenue.setLayout(null);
		
		JLabel lblRevenue = new JLabel("Doanh thu:", SwingConstants.CENTER);
		lblRevenue.setForeground(new Color(255, 255, 255));
		lblRevenue.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRevenue.setBounds(0, 69, 300, 30);
		panelRevenue.add(lblRevenue);
		
		JLabel lblRevenueCost = new JLabel("0 ", SwingConstants.CENTER);
		lblRevenueCost.setForeground(new Color(255, 255, 255));
		lblRevenueCost.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRevenueCost.setBounds(0, 98, 300, 30);
		panelRevenue.add(lblRevenueCost);
		
		JPanel panelSpending = new JPanel();
		panelSpending.setBackground(new Color(245, 70, 70));
		panelSpending.setBounds(630, 208, 300, 200);
		panelOverView.add(panelSpending);
		panelSpending.setLayout(null);
		
		JLabel lblSpending = new JLabel("Chi trả:", SwingConstants.CENTER);
		lblSpending.setForeground(new Color(255, 255, 255));
		lblSpending.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSpending.setBounds(0, 69, 300, 30);
		panelSpending.add(lblSpending);
		
		JLabel lblSpendingCost = new JLabel("0", SwingConstants.CENTER);
		lblSpendingCost.setForeground(new Color(255, 255, 255));
		lblSpendingCost.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSpendingCost.setBounds(0, 98, 300, 30);
		panelSpending.add(lblSpendingCost);
		
		JPanel panelProfit = new JPanel();
		panelProfit.setBackground(new Color(142, 135, 135));
		panelProfit.setBounds(1133, 208, 300, 200);
		panelOverView.add(panelProfit);
		panelProfit.setLayout(null);
		
		JLabel lblProfit = new JLabel("Lợi nhuận:");
		lblProfit.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfit.setForeground(new Color(255, 255, 255));
		lblProfit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProfit.setBounds(0, 69, 300, 30);
		panelProfit.add(lblProfit);
		
		JLabel lblProfitCost = new JLabel("0");
		lblProfitCost.setForeground(new Color(255, 255, 255));
		lblProfitCost.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProfitCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfitCost.setBounds(0, 98, 300, 30);
		panelProfit.add(lblProfitCost);
		
		JLabel lblShiftStatTotal = new JLabel("Doanh thu theo ca làm", SwingConstants.CENTER);
		lblShiftStatTotal.setOpaque(true);
		lblShiftStatTotal.setForeground(Color.WHITE);
		lblShiftStatTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblShiftStatTotal.setBackground(new Color(99, 143, 109));
		lblShiftStatTotal.setBounds(0, 520, 1533, 61);
		panelOverView.add(lblShiftStatTotal);
		
		JLabel lblIconHome = new JLabel("");
		lblIconHome.setIcon(new ImageIcon(StatictisDay_GUI.class.getResource("/img/Home.png")));
		lblIconHome.setBounds(1485, 0, 38, 40);
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
		panelOverView.add(lblIconHome);
		
		JLabel lblCircle1 = new JLabel("");
		lblCircle1.setIcon(new ImageIcon(StatictisDay_GUI.class.getResource("/img/Ellipse1.png")));
		lblCircle1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircle1.setBounds(25, 617, 30, 30);
		panelOverView.add(lblCircle1);
		
		JLabel lblNote1 = new JLabel("Ca sáng");
		lblNote1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNote1.setBounds(78, 623, 70, 18);
		panelOverView.add(lblNote1);
		
		JLabel lblCircle2 = new JLabel("");
		lblCircle2.setIcon(new ImageIcon(StatictisDay_GUI.class.getResource("/img/Ellipse2.png")));
		lblCircle2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircle2.setBounds(25, 662, 30, 30);
		panelOverView.add(lblCircle2);
		
		JLabel lblNote2 = new JLabel("Ca trưa");
		lblNote2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNote2.setBounds(78, 668, 70, 18);
		panelOverView.add(lblNote2);
		
		JLabel lblCircle3 = new JLabel("");
		lblCircle3.setIcon(new ImageIcon(StatictisDay_GUI.class.getResource("/img/Ellipse3.png")));
		lblCircle3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircle3.setBounds(25, 707, 30, 30);
		panelOverView.add(lblCircle3);
		
		JLabel lblNote3 = new JLabel("Ca tối");
		lblNote3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNote3.setBounds(78, 713, 70, 18);
		panelOverView.add(lblNote3);
	
		JPanel panelDetail = new JPanel();
		tabbedPane.addTab("Chi tiết", null, panelDetail, null);
		panelDetail.setLayout(null);
		
		JPanel panelTimeLineBar = new JPanel();
		panelTimeLineBar.setBackground(new Color(217, 217, 217));
		panelTimeLineBar.setBounds(0, 755, 1535, 53);
		panelDetail.add(panelTimeLineBar);
		panelTimeLineBar.setLayout(null);
		
		JLabel lblToday = new JLabel("Hôm nay");
		lblToday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblToday.setHorizontalAlignment(SwingConstants.CENTER);
		lblToday.setOpaque(true);
		lblToday.setBackground(new Color(255, 255, 255));
		lblToday.setBounds(140, 14, 103, 26);
		panelTimeLineBar.add(lblToday);
		
		JLabel lblYesterday = new JLabel("Hôm qua");
		lblYesterday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYesterday.setHorizontalAlignment(SwingConstants.CENTER);
		lblYesterday.setOpaque(true);
		lblYesterday.setBackground(Color.WHITE);
		lblYesterday.setBounds(523, 14, 103, 26);
		panelTimeLineBar.add(lblYesterday);
		
		JLabel lblSV_Later = new JLabel("7 ngày trước");
		lblSV_Later.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSV_Later.setHorizontalAlignment(SwingConstants.CENTER);
		lblSV_Later.setOpaque(true);
		lblSV_Later.setBackground(Color.WHITE);
		lblSV_Later.setBounds(906, 14, 103, 26);
		panelTimeLineBar.add(lblSV_Later);
		
		JLabel lblOtherOption = new JLabel("Lựa chọn khác");
		lblOtherOption.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOtherOption.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtherOption.setOpaque(true);
		lblOtherOption.setBackground(Color.WHITE);
		lblOtherOption.setBounds(1289, 14, 103, 26);
		panelTimeLineBar.add(lblOtherOption);
		
		JLabel lblTitleStat = new JLabel("Tổng kết cuối ngày");
		lblTitleStat.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleStat.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitleStat.setBounds(617, 30, 300, 35);
		panelDetail.add(lblTitleStat);
		
		LocalDate dateStat = LocalDate.now();
		LocalTime timeStat = LocalTime.now();
		String dateToString = dateStat.format(dtf);
		DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("HH:mm");
		String dateTitleStat = dateToString + " 00:00 - " + dateToString + " " + timeStat.format(hourFormat);
		JLabel lblTimeStat = new JLabel("");
		lblTimeStat.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeStat.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimeStat.setText(dateTitleStat);
		lblTimeStat.setBounds(567, 75, 400, 16);
		panelDetail.add(lblTimeStat);
		
		JScrollPane scrollPaneDetail = new JScrollPane();
		scrollPaneDetail.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneDetail.setBounds(384, 135, 768, 589);
		panelDetail.add(scrollPaneDetail);
		
		JPanel panelContent = new JPanel();
		panelContent.setBackground(new Color(255, 255, 255));
		scrollPaneDetail.setViewportView(panelContent);
		
		setVisible(true);
	}
}
