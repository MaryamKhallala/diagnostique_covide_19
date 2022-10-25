package com.diagnostic.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.diagnostic.model.bo.Patient;
import com.diagnostic.model.bo.Symptome;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.ListModel;

import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class FDiagnostic extends JFrame  implements ActionListener{

	private Patient p = null;
	private JPanel contentPane;
	private String[] val = new String[] {};
	JList list = new JList();
	JList<String> list_1 = new JList();
	JButton btnNewButton_3_1 = new JButton(">");
	JButton btnNewButton_3 = new JButton("<");
	JButton btnNewButton_4 = new JButton("Analyser");
	JSpinner spinner = new JSpinner();
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Diabetique");
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hypertendu");
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Cardiaque");
	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Oui");
	JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Non");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FDiagnostic frame = new FDiagnostic(null);
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
	public FDiagnostic(Patient p) {
		this.p = p;
		setBounds(370, 100, 687, 448);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 46, 133, 197);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane);
		
		JList list = new JList(new AbstractListModel() {
			String[] values = new String[] {"fievre", "toux s\u00E8che", "fatigue", "congestion nasal", "\u00E9coulement nasal", "maux de gorge", "diarrh\u00E9", "dyspn\u00E9e", "frissons", "douleurs musculaires", "maux de tete", "gorge s\u00E8che", "perte de go\u00FBt", "essouflement", "confusion", "vomissement","nausee", "conjonctivite", "tremblement_r\u00E9p\u00E9t\u00E9"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.controlDkShadow, SystemColor.controlDkShadow, SystemColor.scrollbar, SystemColor.controlShadow));
		scrollPane.setViewportView(list);
		list.setBackground(new Color(255, 204, 153));
		list.setForeground(Color.BLACK);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(147, 74, 1, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diagnostic");
		lblNewLabel.setBounds(180, 5, 78, 14);
		panel_1.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(404, 46, 120, 197);
		contentPane.add(scrollPane_1);
		scrollPane_1.setViewportView(list_1);
		list_1.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.controlDkShadow, SystemColor.controlDkShadow, SystemColor.scrollbar, SystemColor.scrollbar));
		list_1.setBackground(new Color(255, 204, 153));
		
		
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setForeground(SystemColor.controlLtHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_1.setModel(new AbstractListModel() {
					String[] values = new String[] {"fievre", "toux s\u00E8che", "fatigue", "congestion nasal", "\u00E9coulement nasal", "maux de gorge", "diarrh\u00E9", "dyspn\u00E9e", "frissons", "douleurs musculaires", "maux de tete", "gorge s\u00E8che", "perte de go\u00FBt", "essouflement", "confusion", "vomissement","nausee", "conjonctivite", "tremblement_r\u00E9p\u00E9t\u00E9"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
			}
		});
		btnNewButton.setBounds(267, 74, 49, 23);
		contentPane.add(btnNewButton);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(255, 204, 153));
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_1.setModel(List_remove_model(list_1));
			}
		});
		btnNewButton_3.setBounds(267, 208, 49, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("<<");
		btnNewButton_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_1.setModel(new AbstractListModel() {
					String[] values = new String[] {};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
			}
		});
		btnNewButton_1.setBounds(267, 163, 49, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Maladie Chronique");
		lblNewLabel_1.setBounds(51, 281, 88, 14);
		contentPane.add(lblNewLabel_1);
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		
		rdbtnNewRadioButton.setBounds(281, 277, 88, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton_1.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		
		rdbtnNewRadioButton_1.setBounds(401, 277, 96, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(255, 204, 153));
		
		rdbtnNewRadioButton_2.setBounds(169, 277, 88, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Temperature");
		lblNewLabel_2.setBounds(51, 314, 62, 14);
		contentPane.add(lblNewLabel_2);
		spinner.setBackground(new Color(255, 204, 153));
		spinner.setForeground(new Color(255, 204, 153));
		
		spinner.setBounds(168, 311, 30, 20);
		contentPane.add(spinner);
		btnNewButton_4.setBackground(new Color(0, 0, 153));
		btnNewButton_4.setForeground(new Color(255, 204, 153));
		
		
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(573, 375, 88, 23);
		contentPane.add(btnNewButton_4);
		
		
		DefaultListModel d = new DefaultListModel();		
		btnNewButton_3_1.setBackground(new Color(255, 204, 153));
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_1.setModel(List_add_model(list,list_1));
			}
		});
		btnNewButton_3_1.setBounds(267, 119, 49, 23);
		contentPane.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Diagnostic");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\university\\projet d'integration\\ProjetCovid\\image\\anti-virus-old-school-icon.png"));
		lblNewLabel_3.setFont(new Font("Forte", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(186, 11, 96, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact Covid 19");
		lblNewLabel_4.setBounds(51, 351, 97, 14);
		contentPane.add(lblNewLabel_4);
		
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton_3.setBounds(169, 347, 88, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_4.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton_4.setBounds(281, 347, 88, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(rdbtnNewRadioButton_3);bg.add(rdbtnNewRadioButton_4);  
	}
	
	public  int Mesure() {
		return (int) spinner.getValue();	
	}
	
	public  Vector<String> get_list_maladie(){
		Vector<String> maladies = new Vector<String>();
		if(rdbtnNewRadioButton.isSelected()){    
			   maladies.add(rdbtnNewRadioButton.getText());
			} 
		if(rdbtnNewRadioButton_1.isSelected()){    
			   maladies.add(rdbtnNewRadioButton_1.getText());
			} 
		if(rdbtnNewRadioButton_2.isSelected()){    
			   maladies.add(rdbtnNewRadioButton_2.getText());
			} 
		return maladies;
	}
	
	public  Vector<String> get_list_symptomes(){
		Vector<String> symptomes = new Vector<String>();
		 for(int i = 0; i< list_1.getModel().getSize();i++){
	           symptomes.add(list_1.getModel().getElementAt(i).toString());
	        }
		return symptomes;
	}
	public DefaultListModel List_add_model(JList list,JList list1){
		DefaultListModel d = new DefaultListModel();
		 for(int i = 0; i< list1.getModel().getSize();i++){
	            d.addElement(list1.getModel().getElementAt(i));
	        }
		for (Object object : list.getSelectedValues()) {
			if(!d.contains(object.toString()))
				d.addElement(object.toString());
		}
		return d;
	}
	
	
	public DefaultListModel<String> List_remove_model(JList list1){
		DefaultListModel d = new DefaultListModel();
		 for(int i = 0; i< list1.getModel().getSize();i++){
	            d.addElement(list1.getModel().getElementAt(i));
	        }
		for (Object object : list1.getSelectedValues()) {
				d.removeElement(object.toString());
		}
		return d;
	}
	
	public boolean getContactCovid() {
		if(rdbtnNewRadioButton_3.isSelected()){    
			return true;    
			}    
		if(rdbtnNewRadioButton_4.isSelected()){    
			return false;  
			} 
		return false;
	}
	public static DefaultListModel<String> initialze_list_contact(){
        DefaultListModel<String> s = new DefaultListModel<String>();   
        s.addElement("fievre");
    	s.addElement("toux sèche");
    	s.addElement("fatigue");
    	s.addElement("congestion nasal");
    	s.addElement("écoulement nasal");
    	s.addElement("maux de gorge");
    	s.addElement("diarrhé");
    	s.addElement("dyspnée");
    	s.addElement("frissons");
    	s.addElement("douleurs musculaires");
    	s.addElement("maux de tete");
    	s.addElement("gorge sèche");
    	s.addElement("perte de goût");
    	s.addElement("essouflement");
    	s.addElement("confusion");
    	s.addElement("vomissement");
    	s.addElement("conjonctivite");
    	s.addElement("tremblement_répété");
		return s;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton_4) {
			try {
				new ClientApp().getDegre(this);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
		}
	}
	public Patient getPatient() {
		return this.p;
	}
}
