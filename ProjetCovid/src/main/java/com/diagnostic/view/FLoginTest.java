package com.diagnostic.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;

public class FLoginTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLoginTest frame = new FLoginTest();
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
	public FLoginTest() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(370, 100, 687, 448);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login ");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\img\\4.png"));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 204, 204));
		lblNewLabel.setBounds(255, 31, 92, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(139, 159, 64, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(239, 159, 166, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(139, 214, 64, 23);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(239, 214, 166, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Create new Account");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setBounds(108, 342, 172, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FSignUp fs = new FSignUp();
				fs.setVisible(true);
				}
			}
			);
		
		JButton btnNewButton_1 = new JButton("Login In");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1.setBounds(381, 342, 115, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				new clientControlleur().VeriferPatient(textField.getText(),textField_1.getText());
				}
			}
			);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.controlDkShadow, SystemColor.controlDkShadow, SystemColor.scrollbar, SystemColor.scrollbar));
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(88, 105, 447, 192);
		contentPane.add(panel);
	}
}
