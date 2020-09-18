import java.awt.EventQueue;

import java.lang.String;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;

public class First implements ActionListener{

	private JFrame frame;
	private JTextField lblID1;
	private JTextField lblPrenom1;
	private JTextField lblNom1;
	private JTextField lblDatenaissance1;
	private JTextField lblEtatCivil1;
	private JTextField lblEmail1;
	private JTextField lblTel1;
	private JTextField lblAdresse1;
	private JTextField lblNumCIN1;
	private JTextField lblGrade1;
	private JTextField lblDateEntree1;
	private JTextField lblFonction1;
	private JTextField lblResidence1;
	private JTextField lblIdentifiantUnique1;
	private JTextField lblDateRec1;
	private JTextField lblLieu1;
	JButton b;

	
	

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
					window.getFrame().setVisible(true);
					new First();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public First() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(new Color(0, 98, 157));
		getFrame().setBounds(0, 0, 800, 800);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/hp/Desktop/Stage TT/Webp.net-resizeimage.jpg"));
		lblNewLabel.setBounds(0, 0, 148, 106);
		getFrame().getContentPane().add(lblNewLabel);
		
		JLabel lblID = new JLabel("ID");
		lblID.setForeground(Color.WHITE);
		lblID.setBounds(12, 160, 85, 27);
		getFrame().getContentPane().add(lblID);
		
		lblID1 = new JTextField();
		lblID1.setBounds(140, 160, 114, 27);
		getFrame().getContentPane().add(lblID1);
		lblID1.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prénom");
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setBounds(12, 230, 70, 15);
		getFrame().getContentPane().add(lblPrenom);
		
		lblPrenom1 = new JTextField();
		lblPrenom1.setBounds(140, 230, 114, 27);
		getFrame().getContentPane().add(lblPrenom1);
		lblPrenom1.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(Color.WHITE);
		lblNom.setBounds(12, 300, 70, 15);
		getFrame().getContentPane().add(lblNom);
		
		lblNom1 = new JTextField();
		lblNom1.setBounds(140, 300, 114, 27);
		getFrame().getContentPane().add(lblNom1);
		lblNom1.setColumns(10);
		
		JLabel lblDatenaissance = new JLabel("Date de naissance");
		lblDatenaissance.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDatenaissance.setForeground(Color.WHITE);
		lblDatenaissance.setBounds(12, 370, 132, 27);
		getFrame().getContentPane().add(lblDatenaissance);
		
		JLabel lblEtatCivil = new JLabel("Etat civil");
		lblEtatCivil.setForeground(Color.WHITE);
		lblEtatCivil.setBounds(12, 440, 70, 15);
		getFrame().getContentPane().add(lblEtatCivil);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(12, 510, 70, 15);
		getFrame().getContentPane().add(lblEmail);
		
		JLabel lblTel = new JLabel("Téléphone");
		lblTel.setForeground(Color.WHITE);
		lblTel.setBounds(12, 580, 110, 15);
		getFrame().getContentPane().add(lblTel);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setBounds(12, 650, 70, 15);
		getFrame().getContentPane().add(lblAdresse);
		
		lblDatenaissance1 = new JTextField();
		lblDatenaissance1.setBounds(140, 370, 114, 27);
		getFrame().getContentPane().add(lblDatenaissance1);
		lblDatenaissance1.setColumns(10);
		
		lblEtatCivil1 = new JTextField();
		lblEtatCivil1.setColumns(10);
		lblEtatCivil1.setBounds(140, 440, 114, 27);
		getFrame().getContentPane().add(lblEtatCivil1);
		
		lblEmail1 = new JTextField();
		lblEmail1.setColumns(10);
		lblEmail1.setBounds(140, 510, 114, 27);
		getFrame().getContentPane().add(lblEmail1);
		
		lblTel1 = new JTextField();
		lblTel1.setColumns(10);
		lblTel1.setBounds(140, 580, 114, 27);
		getFrame().getContentPane().add(lblTel1);
		
		lblAdresse1 = new JTextField();
		lblAdresse1.setColumns(10);
		lblAdresse1.setBounds(140, 650, 114, 27);
		getFrame().getContentPane().add(lblAdresse1);
		
		JLabel lblNumCIN = new JLabel("Num CIN");
		lblNumCIN.setForeground(Color.WHITE);
		lblNumCIN.setBounds(301, 166, 70, 15);
		getFrame().getContentPane().add(lblNumCIN);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setBounds(301, 230, 70, 15);
		getFrame().getContentPane().add(lblGrade);
		
		JLabel lblDateEntree = new JLabel("Date d'entrée");
		lblDateEntree.setForeground(Color.WHITE);
		lblDateEntree.setBounds(301, 300, 110, 15);
		getFrame().getContentPane().add(lblDateEntree);
		
		JLabel lblFonction = new JLabel("Fonction");
		lblFonction.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFonction.setForeground(Color.WHITE);
		lblFonction.setBounds(301, 375, 70, 15);
		getFrame().getContentPane().add(lblFonction);
		
		JLabel lblResidence = new JLabel("Résidence Administrative");
		lblResidence.setFont(new Font("Dialog", Font.BOLD, 11));
		lblResidence.setForeground(Color.WHITE);
		lblResidence.setBounds(301, 429, 167, 52);
		getFrame().getContentPane().add(lblResidence);
		
		JLabel lblIdentifiantUnique = new JLabel("Identifiant Unique");
		lblIdentifiantUnique.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIdentifiantUnique.setForeground(Color.WHITE);
		lblIdentifiantUnique.setBounds(301, 510, 132, 15);
		getFrame().getContentPane().add(lblIdentifiantUnique);
		
		JLabel lblDateRec = new JLabel("Date de Récrutement");
		lblDateRec.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDateRec.setForeground(Color.WHITE);
		lblDateRec.setBounds(301, 581, 150, 15);
		getFrame().getContentPane().add(lblDateRec);
		
		JLabel lblLieu = new JLabel("Lieu");
		lblLieu.setForeground(Color.WHITE);
		lblLieu.setBounds(301, 650, 70, 15);
		getFrame().getContentPane().add(lblLieu);
		
		lblNumCIN1 = new JTextField();
		lblNumCIN1.setColumns(10);
		lblNumCIN1.setBounds(468, 160, 114, 27);
		getFrame().getContentPane().add(lblNumCIN1);
		
		lblGrade1 = new JTextField();
		lblGrade1.setColumns(10);
		lblGrade1.setBounds(468, 230, 114, 27);
		getFrame().getContentPane().add(lblGrade1);
		
		lblDateEntree1 = new JTextField();
		lblDateEntree1.setColumns(10);
		lblDateEntree1.setBounds(468, 300, 114, 27);
		getFrame().getContentPane().add(lblDateEntree1);
		
		lblFonction1 = new JTextField();
		lblFonction1.setColumns(10);
		lblFonction1.setBounds(468, 370, 114, 27);
		getFrame().getContentPane().add(lblFonction1);
		
		lblResidence1 = new JTextField();
		lblResidence1.setColumns(10);
		lblResidence1.setBounds(468, 440, 114, 27);
		getFrame().getContentPane().add(lblResidence1);
		
		lblIdentifiantUnique1 = new JTextField();
		lblIdentifiantUnique1.setColumns(10);
		lblIdentifiantUnique1.setBounds(468, 510, 114, 27);
		getFrame().getContentPane().add(lblIdentifiantUnique1);
		
		lblDateRec1 = new JTextField();
		lblDateRec1.setColumns(10);
		lblDateRec1.setBounds(468, 580, 114, 27);
		getFrame().getContentPane().add(lblDateRec1);
		
		lblLieu1 = new JTextField();
		lblLieu1.setColumns(10);
		lblLieu1.setBounds(468, 650, 114, 27);
		getFrame().getContentPane().add(lblLieu1);
		
		b=new JButton("Ajouter");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.valueOf(lblID1.getText().toString());
				String bb = lblPrenom1.getText().toString();
				String c = lblNom1.getText().toString();
				String d = lblDatenaissance1.getText().toString();
				String e = lblEtatCivil1.getText().toString();
				String f = lblEmail1.getText().toString();
				int g = Integer.valueOf(lblTel1.getText().toString());
				String h = lblAdresse1.getText().toString();
				String i = lblGrade1.getText().toString();
				String j = lblDateEntree1.getText().toString();
				String k = lblFonction1.getText().toString();
				String l = lblResidence1.getText().toString();
				int m =Integer.valueOf( lblIdentifiantUnique1.getText().toString());
				int n =Integer.valueOf( lblNumCIN1.getText().toString());
				String o = lblDateRec1.getText().toString();
				String p = lblLieu1.getText().toString();
				
				
					
						ConnectionDB cc = new ConnectionDB();
						cc.seConnecter();
						String q = "insert into project.employee values('"+a+"','"+bb+"',"
								+ "'"+c+"',"
								+ "'"+d+"',"
								+ "'"+e+"',"
								+ "'"+f+"',"
								+ "'"+g+"',"
								+ "'"+h+"',"
								+ "'"+i+"',"
								+ "'"+j+"',"
								+ "'"+k+"',"
								+ "'"+l+"',"
								+ "'"+m+"',"
								+ "'"+n+"',"
								+ "'"+o+"',"
								+ "'"+p+"')";
						
							cc.executerUpdate(q);

							JOptionPane.showMessageDialog(null, "Details Successfully inserted");
							frame.setVisible(false);
							new Menu_Admin1();
			}});
						
					
				
				
				
		
		
		b.setBounds(628, 329, 121, 26);
		getFrame().getContentPane().add(b);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblID1.setText(null);
				lblPrenom1.setText(null);
				lblNom1.setText(null);
				lblDatenaissance1.setText(null);
				lblEtatCivil1.setText(null);
				lblEmail1.setText(null);
				lblTel1.setText(null);
				lblAdresse1.setText(null);
				lblNumCIN1.setText(null);
				lblGrade1.setText(null);
				lblFonction1.setText(null);
				lblResidence1.setText(null);
				lblIdentifiantUnique1.setText(null);
				lblDateRec1.setText(null);
				lblLieu1.setText(null);
				lblDateEntree1.setText(null);
				
				
			}
		});
		btnReset.setBounds(628, 402, 121, 26);
		getFrame().getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Menu_Admin1 m = new Menu_Admin1();
				Menu_Admin1.main(null);
			}
			
		});
		btnExit.setBounds(628, 472, 121, 26);
		getFrame().getContentPane().add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("Système de Gestion des Personnels");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_1.setBounds(160, 40, 614, 38);
		getFrame().getContentPane().add(lblNewLabel_1);
	}


	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	}
