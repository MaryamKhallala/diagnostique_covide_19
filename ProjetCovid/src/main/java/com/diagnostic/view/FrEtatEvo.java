package com.diagnostic.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrEtatEvo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrEtatEvo frame = new FrEtatEvo();
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
	public FrEtatEvo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(370, 100, 687, 448);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 204, 153));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Information Covid");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Item");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrInfoCovid().setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(255, 204, 153));
		comboBox.setFont(new Font("Samsung Sans", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tanger-T\u00E9touan-Al Hoce\u00EFma", "L'Oriental", "F\u00E8s-Mekn\u00E8s", "Rabat-Sal\u00E9-K\u00E9nitra", "B\u00E9ni Mellal-Kh\u00E9nifra", "Casablanca-Settat", "Marrakech-Safi", "Dr\u00E2a-Tafilalet", "Souss-Massa", "Guelmim-Oued Noun", "La\u00E2youne-Sakia El Hamra", "Dakhla-Oued Ed-Dahab"}));
		comboBox.setBounds(195, 46, 202, 33);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		panel.setBorder(new LineBorder(SystemColor.textHighlight));
		panel.setBounds(22, 114, 168, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gu\u00E9ris");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Samsung Sans", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 67, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\azerty\\Downloads\\icons8-green-heart-40.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(115, 47, 43, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1145120");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Samsung Sans", Font.BOLD, 20));
		lblNewLabel_2.setBounds(20, 47, 98, 31);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 153));
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight));
		panel_1.setBounds(216, 114, 168, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCasConfirms = new JLabel("Cas Confirm\u00E9s");
		lblCasConfirms.setForeground(Color.WHITE);
		lblCasConfirms.setFont(new Font("Samsung Sans", Font.BOLD, 18));
		lblCasConfirms.setBounds(10, 11, 148, 25);
		panel_1.add(lblCasConfirms);
		
		JLabel lblNewLabel_2_1 = new JLabel("1177120");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Samsung Sans", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(20, 47, 98, 31);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\azerty\\Downloads\\icons8-mourir-au-lit-40.png"));
		lblNewLabel_3.setBounds(120, 38, 48, 40);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 204));
		panel_2.setBorder(new LineBorder(SystemColor.textHighlight));
		panel_2.setBounds(405, 114, 168, 89);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDcs = new JLabel("D\u00E9c\u00E8s");
		lblDcs.setForeground(Color.WHITE);
		lblDcs.setFont(new Font("Samsung Sans", Font.BOLD, 18));
		lblDcs.setBounds(10, 11, 67, 25);
		panel_2.add(lblDcs);
		
		JLabel lblNewLabel_2_2 = new JLabel("16036");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Samsung Sans", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(20, 47, 98, 31);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\azerty\\Downloads\\icons8-cr\u00E2ne-48.png"));
		lblNewLabel_4.setBounds(112, 30, 46, 48);
		panel_2.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Effectuer Diagnostic");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(216, 245, 150, 40);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		FLoginTest fl = new FLoginTest();
	    		fl.setVisible(true);
	    	}
	    });
		
		JLabel lblNewLabel_5 = new JLabel("Information Region");
		lblNewLabel_5.setFont(new Font("Forte", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(227, 11, 139, 14);
		contentPane.add(lblNewLabel_5);
	}
}
