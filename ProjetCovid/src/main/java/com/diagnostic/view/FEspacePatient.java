package com.diagnostic.view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.diagnostic.model.bo.Patient;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class FEspacePatient extends JFrame {

	private JPanel contentPane;
	private JButton  btnNewButton_1,btnNewButton_2,
	                btnNewButton_1_1_1,btnNewButton_1_2,btnNewButton_1_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private Patient p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FEspacePatient frame = new FEspacePatient(new Patient());
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
	public FEspacePatient(Patient p) {
		this.p = p;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\COVID-19.png"));
		setTitle("Espace Patient\r\n\r\n");
		//setSize(700,700);
		setBounds(370, 100, 700, 700);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Bienvenu
		JLabel lblNewLabel = new JLabel("Bienvenue cher patient , votre sant\u00E9 est notre priorit\u00E9 !\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\10185-man-health-worker-light-skin-tone-icon.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(51, 31, 537, 64);
		
		contentPane.add(lblNewLabel);
		
		//consultation région
		btnNewButton_1 = new JButton("Classification des r\u00E9gions\r\n");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\chart-icon.png"));
		btnNewButton_1.setBackground(new Color(255, 204, 153));
	
		btnNewButton_1.setBounds(375, 206, 233, 57);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrEtatEvo fs = new	FrEtatEvo();
				fs.setVisible(true);
				}
			}
			);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1_1 = new JButton(" Fiche personnelle\r\n");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\User-Files-icon.png"));
		
		btnNewButton_1_1.setBounds(375, 307, 233, 57);
		contentPane.add(btnNewButton_1_1);
		
		JFrame f = this;
		//effectuer diagnostic
	    btnNewButton_1_1_1 = new JButton(" Effectuer diagnostic ");
	    btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\Tests-icon.png"));
		btnNewButton_1_1_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1_1_1.setBounds(375, 411, 233, 57);
		contentPane.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FDiagnostic fs = new FDiagnostic(getPatient());
				fs.setVisible(true);
				}
			}
			);
		
		//btn deconnecter
	    btnNewButton_2 = new JButton("se d\u00E9connecter\r\n");
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		f.dispose();
	    		FLoginTest fl = new FLoginTest();
	    		fl.setVisible(true);
	    	}
	    });
	    btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 204, 153));
		btnNewButton_2.setBounds(413, 527, 144, 40);
		contentPane.add(btnNewButton_2);
		
		//consulter information
		btnNewButton_1_2 = new JButton("Informations sur covide19\r\n");
		btnNewButton_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2.setBackground(new Color(255, 204, 153));
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\personal-information-icon.png"));
		
		btnNewButton_1_2.setBounds(375, 120, 233, 57);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrInfoCovid fs = new	FrInfoCovid();
				fs.setVisible(true);
				}
			}
			);
		contentPane.add(btnNewButton_1_2);
		
		//image label
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\COVID-19.png"));
	   
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(20, 110, 318, 480);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Espace Patient");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\Documents-icon.png"));
		lblNewLabel_2.setFont(new Font("Forte", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(273, 11, 129, 23);
		contentPane.add(lblNewLabel_2);
		
	}
	public Patient getPatient() {
		return this.p;
	}
}
