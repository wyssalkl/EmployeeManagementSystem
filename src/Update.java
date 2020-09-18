import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Update {
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
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update window = new Update();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Update() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 98, 157));
		frame.setBounds(0, 0, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setFont(new Font("Chilanka", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(0,98,157));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/hp/Desktop/Stage TT/Webp.net-resizeimage.jpg"));
		lblNewLabel.setBounds(0, 0, 164, 101);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblID = new JLabel("ID");
		lblID.setForeground(Color.WHITE);
		lblID.setBounds(12, 160, 85, 27);
		frame.getContentPane().add(lblID);
		
		lblID1 = new JTextField();
		lblID1.setBounds(140, 160, 114, 27);
		frame.getContentPane().add(lblID1);
		lblID1.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prénom");
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setBounds(12, 230, 70, 15);
		frame.getContentPane().add(lblPrenom);
		
		lblPrenom1 = new JTextField();
		lblPrenom1.setBounds(140, 230, 114, 27);
		frame.getContentPane().add(lblPrenom1);
		lblPrenom1.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(Color.WHITE);
		lblNom.setBounds(12, 300, 70, 15);
		frame.getContentPane().add(lblNom);
		
		lblNom1 = new JTextField();
		lblNom1.setBounds(140, 300, 114, 27);
		frame.getContentPane().add(lblNom1);
		lblNom1.setColumns(10);
		
		JLabel lblDatenaissance = new JLabel("Date de naissance");
		lblDatenaissance.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDatenaissance.setForeground(Color.WHITE);
		lblDatenaissance.setBounds(12, 370, 132, 27);
		frame.getContentPane().add(lblDatenaissance);
		
		JLabel lblEtatCivil = new JLabel("Etat civil");
		lblEtatCivil.setForeground(Color.WHITE);
		lblEtatCivil.setBounds(12, 440, 70, 15);
		frame.getContentPane().add(lblEtatCivil);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(12, 510, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblTel = new JLabel("Téléphone");
		lblTel.setForeground(Color.WHITE);
		lblTel.setBounds(12, 580, 110, 15);
		frame.getContentPane().add(lblTel);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setBounds(12, 650, 70, 15);
		frame.getContentPane().add(lblAdresse);
		
		lblDatenaissance1 = new JTextField();
		lblDatenaissance1.setBounds(140, 370, 114, 27);
		frame.getContentPane().add(lblDatenaissance1);
		lblDatenaissance1.setColumns(10);
		
		lblEtatCivil1 = new JTextField();
		lblEtatCivil1.setColumns(10);
		lblEtatCivil1.setBounds(140, 440, 114, 27);
		frame.getContentPane().add(lblEtatCivil1);
		
		lblEmail1 = new JTextField();
		lblEmail1.setColumns(10);
		lblEmail1.setBounds(140, 510, 114, 27);
		frame.getContentPane().add(lblEmail1);
		
		lblTel1 = new JTextField();
		lblTel1.setColumns(10);
		lblTel1.setBounds(140, 580, 114, 27);
		frame.getContentPane().add(lblTel1);
		
		lblAdresse1 = new JTextField();
		lblAdresse1.setColumns(10);
		lblAdresse1.setBounds(140, 650, 114, 27);
		frame.getContentPane().add(lblAdresse1);
		
		JLabel lblNumCIN = new JLabel("Num CIN");
		lblNumCIN.setForeground(Color.WHITE);
		lblNumCIN.setBounds(301, 166, 70, 15);
		frame.getContentPane().add(lblNumCIN);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setBounds(301, 230, 70, 15);
		frame.getContentPane().add(lblGrade);
		
		JLabel lblDateEntree = new JLabel("Date d'entrée");
		lblDateEntree.setForeground(Color.WHITE);
		lblDateEntree.setBounds(301, 300, 110, 15);
		frame.getContentPane().add(lblDateEntree);
		
		JLabel lblFonction = new JLabel("Fonction");
		lblFonction.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFonction.setForeground(Color.WHITE);
		lblFonction.setBounds(301, 375, 70, 15);
		frame.getContentPane().add(lblFonction);
		
		JLabel lblResidence = new JLabel("Résidence Administrative");
		lblResidence.setFont(new Font("Dialog", Font.BOLD, 11));
		lblResidence.setForeground(Color.WHITE);
		lblResidence.setBounds(301, 429, 167, 52);
		frame.getContentPane().add(lblResidence);
		
		JLabel lblIdentifiantUnique = new JLabel("Identifiant Unique");
		lblIdentifiantUnique.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIdentifiantUnique.setForeground(Color.WHITE);
		lblIdentifiantUnique.setBounds(301, 510, 132, 15);
		frame.getContentPane().add(lblIdentifiantUnique);
		
		JLabel lblDateRec = new JLabel("Date de Récrutement");
		lblDateRec.setFont(new Font("Dialog", Font.BOLD, 11));
		lblDateRec.setForeground(Color.WHITE);
		lblDateRec.setBounds(301, 581, 150, 15);
		frame.getContentPane().add(lblDateRec);
		
		JLabel lblLieu = new JLabel("Lieu");
		lblLieu.setForeground(Color.WHITE);
		lblLieu.setBounds(301, 650, 70, 15);
		frame.getContentPane().add(lblLieu);
		
		lblNumCIN1 = new JTextField();
		lblNumCIN1.setColumns(10);
		lblNumCIN1.setBounds(468, 160, 114, 27);
		frame.getContentPane().add(lblNumCIN1);
		
		lblGrade1 = new JTextField();
		lblGrade1.setColumns(10);
		lblGrade1.setBounds(468, 230, 114, 27);
		frame.getContentPane().add(lblGrade1);
		
		lblDateEntree1 = new JTextField();
		lblDateEntree1.setColumns(10);
		lblDateEntree1.setBounds(468, 300, 114, 27);
		frame.getContentPane().add(lblDateEntree1);
		
		lblFonction1 = new JTextField();
		lblFonction1.setColumns(10);
		lblFonction1.setBounds(468, 370, 114, 27);
		frame.getContentPane().add(lblFonction1);
		
		lblResidence1 = new JTextField();
		lblResidence1.setColumns(10);
		lblResidence1.setBounds(468, 440, 114, 27);
		frame.getContentPane().add(lblResidence1);
		
		lblIdentifiantUnique1 = new JTextField();
		lblIdentifiantUnique1.setColumns(10);
		lblIdentifiantUnique1.setBounds(468, 510, 114, 27);
		frame.getContentPane().add(lblIdentifiantUnique1);
		
		lblDateRec1 = new JTextField();
		lblDateRec1.setColumns(10);
		lblDateRec1.setBounds(468, 580, 114, 27);
		frame.getContentPane().add(lblDateRec1);
		
		lblLieu1 = new JTextField();
		lblLieu1.setColumns(10);
		lblLieu1.setBounds(468, 650, 114, 27);
		frame.getContentPane().add(lblLieu1);
		
		JButton btnMettreJour = new JButton("Modifier");
		btnMettreJour.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int a = Integer.valueOf(lblID1.getText().toString());
				String bb = lblPrenom1.getText().toString();
				String c = lblNom1.getText().toString();
				String d = lblDatenaissance1.getText().toString();
				String ee = lblEtatCivil1.getText().toString();
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
				
				String sql= " UPDATE project.employee SET Prenom = '"+bb+"', Nom = '"+c+"',Date_Naissance='"+d+"',Etat_Civil='"+ee+"',Email='"+f+"',Tel='"+g+"',Adresse='"+h+"',Grade='"+i+"',Date_entree='"+j+"',Fonction='"+k+"',Residence='"+l+"',Identifiant_Unique='"+m+"',Num_CIN='"+n+"',Date_Recru ='"+o+"' , Lieu='"+p+"'  WHERE EmpID='"+a+"'";
				cc.executerUpdate(sql);
			}
		});
		btnMettreJour.setBounds(658, 370, 117, 25);
		frame.getContentPane().add(btnMettreJour);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			    frame.setVisible(false);
				Menu_Admin1 men= new Menu_Admin1();
				Menu_Admin1.main(null);
			}
		});
		btnCancel.setBounds(658, 435, 117, 25);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Modifier Les Détails de L'Employé");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(176, 39, 599, 36);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
