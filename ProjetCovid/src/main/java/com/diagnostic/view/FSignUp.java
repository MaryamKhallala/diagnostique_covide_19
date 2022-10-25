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
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.border.BevelBorder;
import org.jdesktop.swingx.JXDatePicker;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FSignUp frame = new FSignUp();
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
	public FSignUp() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(370, 100, 687, 448);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBounds(253, 276, 157, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setBounds(253, 24, 96, 28);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\img\\4.png"));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(75, 126, 46, 14);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setBounds(75, 151, 60, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Region");
		lblNewLabel_3.setBounds(75, 176, 46, 14);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date Naissance");
		lblNewLabel_4.setBounds(75, 201, 127, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tel");
		lblNewLabel_5.setBounds(75, 226, 46, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Login");
		lblNewLabel_6.setBounds(75, 251, 46, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setBounds(75, 276, 60, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(253, 126, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(253, 151, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JComboBox();
		textField_2.setModel(new DefaultComboBoxModel(new String[] {"Tanger-T\u00E9touan-Al Hoce\u00EFma", "L'Oriental", "F\u00E8s-Mekn\u00E8s", "Rabat-Sal\u00E9-K\u00E9nitra", "B\u00E9ni Mellal-Kh\u00E9nifra", "Casablanca-Settat", "Marrakech-Safi", "Dr\u00E2a-Tafilalet", "Souss-Massa", "Guelmim-Oued Noun", "La\u00E2youne-Sakia El Hamra", "Dakhla-Oued Ed-Dahab"}));
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(253, 176, 157, 20);
		contentPane.add(textField_2);
		
		JXDatePicker picker = new JXDatePicker();
		picker.setBounds(253, 201, 157, 20);
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
//        UtilDateModel model = new UtilDateModel();
//        JDatePanelImpl datePanel = new JDatePanelImpl(model);
//        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        contentPane.add(picker);
		
		textField_4 = new JTextField();
		textField_4.setBounds(253, 226, 157, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(253, 251, 157, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setBounds(453, 348, 157, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setForeground(new Color(255, 204, 153));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clientControlleur().AjouterPatient(textField.getText(), textField_1.getText(),picker.getDate() ,textField_4.getText(),textField_5.getText(),passwordField.getText());
				}
			}
			);

		JPanel panel = new JPanel();
		panel.setBounds(39, 80, 457, 232);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 102), new Color(0, 0, 102), SystemColor.scrollbar, SystemColor.scrollbar));
		panel.setBackground(new Color(255, 204, 153));
		contentPane.add(panel);
	}
}
