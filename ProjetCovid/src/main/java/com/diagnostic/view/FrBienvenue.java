package com.diagnostic.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class FrBienvenue extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrBienvenue frame = new FrBienvenue();
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
	public FrBienvenue() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\COVID-19.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(370, 100, 687, 448);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("About");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Record");
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Search Record");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Close");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("help 1");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1.add(separator_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("help 2");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon img = new ImageIcon("C:\\Users\\azerty\\Downloads\\pexels-cdc-3992933.jpg");
		Image image = img.getImage();
		Image newImg = image.getScaledInstance(250, 150, Image.SCALE_DEFAULT);
		img = new ImageIcon(newImg);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(0, 0, 214, 387);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\1.png"));
		ImageIcon img1 = new ImageIcon("C:\\Users\\azerty\\Downloads\\istockphoto-1224154940-612x612-1.jpg");
		Image image1 = img1.getImage();
		Image newImg1 = image1.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		img1 = new ImageIcon(newImg1);
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 194, 187);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Effectuer Diagnostic");
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(30, 295, 150, 40);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		FLoginTest fl = new FLoginTest();
	    		fl.setVisible(true);
	    	}
	    });
		ImageIcon img2 = new ImageIcon("C:\\Users\\azerty\\Downloads\\covid.PNG");
		Image image2 = img2.getImage();
		Image newImg2 = image2.getScaledInstance(300, 140, Image.SCALE_DEFAULT);
		img2 = new ImageIcon(newImg2);
		
		JLabel lblNewLabel_2 = new JLabel("Bienvenue sur notre plateforme d'information");
		lblNewLabel_2.setFont(new Font("Samsung Sans", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(248, 134, 363, 65);
		contentPane.add(lblNewLabel_2);
		
		JButton btnConsulterInformation = new JButton("Consulter Etat Evolution");
		btnConsulterInformation.setBackground(new Color(255, 204, 153));
		btnConsulterInformation.setForeground(new Color(255, 255, 255));
		btnConsulterInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new FrEtatEvo().setVisible(true);
			}
		});
		btnConsulterInformation.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsulterInformation.setBounds(355, 295, 178, 40);
		contentPane.add(btnConsulterInformation);
		
		JLabel lblNewLabel_3 = new JLabel("Diagnostic Covid 19 ");
		lblNewLabel_3.setFont(new Font("Forte", Font.PLAIN, 16));
		lblNewLabel_3.setForeground(SystemColor.desktop);
		lblNewLabel_3.setBounds(354, 66, 144, 47);
		contentPane.add(lblNewLabel_3);
	}
}
