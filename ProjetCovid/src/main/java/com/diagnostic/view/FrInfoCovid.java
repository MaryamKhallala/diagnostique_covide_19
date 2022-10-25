package com.diagnostic.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class FrInfoCovid extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrInfoCovid frame = new FrInfoCovid();
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
	public FrInfoCovid() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(370, 100, 687, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(0, 0, 218, 409);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 204, 153));
		lblNewLabel_2.setBackground(new Color(255, 204, 153));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon("C:\\Users\\azerty\\Downloads\\pexels-photo-4167544.jpeg");
		Image image = img.getImage();
		Image newImg = image.getScaledInstance(215, 335, Image.SCALE_DEFAULT);
		img = new ImageIcon(newImg);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\R.jpg"));
		lblNewLabel_2.setBounds(0, 0, 218, 410);
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.info);
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panel_2.setBounds(218, 0, 453, 110);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setForeground(SystemColor.info);
		lblNewLabel.setBounds(0, 0, 453, 110);
		panel_2.add(lblNewLabel);
		ImageIcon img1 = new ImageIcon("C:\\Users\\azerty\\Downloads\\image-header.jpg");
		Image image1 = img1.getImage();
		Image newImg1 = image1.getScaledInstance(400, 155, Image.SCALE_DEFAULT);
		img1 = new ImageIcon(newImg1);
		lblNewLabel.setIcon(img1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Information Covid 19");
		lblNewLabel_3.setFont(new Font("Forte", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(79, 34, 183, 23);
		panel_2.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(218, 113, 453, 296);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 451, 294);
		panel_1.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 13));
		textArea.setText("\nQu’est-ce qu’un « nouveau » coronavirus ?\r\n"
				+ "\nUn nouveau coronavirus (CoV) est une nouvelle souche de coronavirus.\r\n"
				+ "\r\n"
				+ "D’abord appelée « nouveau coronavirus 2019 » ou « nCoV-2019 », la maladie provoquée par le nouveau coronavirus identifiée pour la première fois à Wuhan, en Chine, a été rebaptisée « maladie à coronavirus 2019 » (COVID-19) – « CO » pour corona, « VI » pour virus et « D » pour maladie en anglais.Comment se propage le COVID-19 ?\r\n"
				+ "Le virus se transmet par contact direct avec les gouttelettes respiratoires produites par une personne infectée (lorsqu’elle tousse ou éternue) et au contact de surfaces contaminées par le virus. Quels sont les symptômes du coronavirus ?\r\n"
				+ "Les symptômes peuvent inclure de la fièvre, de la toux et un essoufflement. Dans les cas les plus graves, l’infection peut provoquer une pneumonie ou des difficultés respiratoires. Plus rarement, la maladie peut être mortelle. Comment éviter les risques d’infection ?\r\n"
				+ "Voici quatre précautions que votre famille et vous pouvez prendre pour éviter l’infection :\r\n"
				+ "\r\n"
				+ "Lavez-vous fréquemment les mains avec de l’eau et du savon ou avec un désinfectant pour les mains à base d’alcool\r\n"
				+ "Couvrez-vous la bouche et le nez avec le pli du coude ou un mouchoir lorsque vous toussez ou éternuez\r\n"
				+ "Évitez tout contact rapproché avec des personnes présentant des symptômes comparables à ceux d’un rhume ou de la grippe\r\n"
				+ "Consultez un médecin en cas de fièvre, de toux ou de difficultés à respirer");
		textArea.setEditable(false);

	}
}
