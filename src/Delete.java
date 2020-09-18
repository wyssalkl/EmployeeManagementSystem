import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete {

	private JFrame frame;
	JLabel id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,id16,Id, Prenom ,Nom, DateNais ,Etat ,Mail ,Telephone, Adr, Cin ,Grad ,DateEnt ,Fct ,Res, Cnam, DateRecr, Place ,aid16;
	String emp_id;
	String prenom;
	String nom;
	String DatedeNaissance;
	String EtatCivil;
	String Email;
	String Tel;
	String Adresse;
	String CIN;
	String Grade;
	String DateEntree;
	String Fonction;
	String Residence;
	String IdentifiantUnique;
	String DateRec;
	String Lieu;
	JButton b1,b2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
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
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 98, 157));
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/hp/Desktop/Stage TT/Webp.net-resizeimage.jpg"));
		lblNewLabel.setBounds(12, 12, 160, 101);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblDtailsDeLemploy = new JLabel("Détails de L'Employé");
		lblDtailsDeLemploy.setFont(new Font("Dialog", Font.BOLD, 18));
		lblDtailsDeLemploy.setForeground(Color.WHITE);
		lblDtailsDeLemploy.setBounds(231, 43, 223, 33);
		frame.getContentPane().add(lblDtailsDeLemploy);
		
		id0= new JLabel("ID :");
		id0.setFont(new Font("Dialog", Font.BOLD, 14));
		id0.setForeground(Color.decode("#fcdb02"));
		id0.setBounds(12, 145, 70, 15);
		frame.getContentPane().add(id0);
		
		Id= new JLabel(emp_id);
		Id.setForeground(Color.WHITE);
		Id.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Id.setBounds(102, 145, 117, 15);
		frame.getContentPane().add(Id);
		
		b1 = new JButton("Supprimer");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			int Idr=Integer.valueOf(Id.getText().toString());
			 
					ConnectionDB con=new ConnectionDB();
					con.seConnecter();
					String str="select * from project.employee where EmpID='"+Idr+"'";
					con.executerRequete(str);
					try {
					while (con.getRs().next()) {
						 emp_id = con.getRs().getString("EmpID");
						 prenom = con.getRs().getString("Prenom");
						 nom = con.getRs().getString("Nom");
						 DatedeNaissance =con.getRs().getString("Date_Naissance");
						 EtatCivil = con.getRs().getString("Etat_CIvil");
						 Email = con.getRs().getString("Email");
						 Tel = con.getRs().getString("Tel");
						 Adresse = con.getRs().getString("Adresse");
						 CIN =con.getRs().getString("Num_CIN");
						 Grade = con.getRs().getString("Grade");
						 DateEntree = con.getRs().getString("Date_entree");
					     Fonction = con.getRs().getString("Fonction");
						 Residence = con.getRs().getString("Residence_administrative");
						 IdentifiantUnique = con.getRs().getString("Identifiant_Unique");
						 DateRec = con.getRs().getString("Date_Recru");
						 Lieu = con.getRs().getString("Lieu");
					} 
					int x= Integer.valueOf(emp_id);
					String q = "insert into project.archive values('"+x+"','"+prenom+"',"
							+ "'"+nom+"',"
							+ "'"+DatedeNaissance+"',"
							+ "'"+EtatCivil+"',"
							+ "'"+Email+"',"
							+ "'"+Tel+"',"
							+ "'"+Adresse+"',"
							+ "'"+CIN+"',"
							+ "'"+Grade+"',"
							+ "'"+DateEntree+"',"
							+ "'"+Fonction+"',"
							+ "'"+Residence+"',"
							+ "'"+IdentifiantUnique+"',"
							+ "'"+DateRec+"',"
							+ "'"+Lieu+"')";
					
						con.executerUpdate(q);
					
					}
					catch (SQLException e1) {
						e1.printStackTrace();
					}
						
				
				
				
				
				String sql1="delete  from project.employee where  EmpID='"+Idr+"'";
				
				con.executerUpdate(sql1);
				
			}
		});
		b1.setBounds(164, 516, 117, 25);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("Cancel");
		b2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Remove m = new Remove();
				Remove.main(null);
			}
		});
		b2.setBounds(337, 516, 117, 25);
		frame.getContentPane().add(b2);
		
		id1 = new JLabel("Prénom :");
		id1.setFont(new Font("Dialog", Font.BOLD, 14));
		id1.setForeground(Color.decode("#fcdb02"));
		id1.setBounds(12, 185, 85, 15);
		frame.getContentPane().add(id1);
		
		Prenom = new JLabel(prenom);
		Prenom.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Prenom.setForeground(Color.WHITE);
		Prenom.setBounds(102, 185, 142, 15);
		frame.getContentPane().add(Prenom);
		
		id2 =new JLabel("Nom :");
		id2.setFont(new Font("Dialog", Font.BOLD, 14));
		id2.setForeground(Color.decode("#fcdb02"));
		id2.setBounds(12, 225, 70, 15);
		frame.getContentPane().add(id2);
		
		Nom= new JLabel(nom);
		Nom.setForeground(Color.WHITE);
		Nom.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Nom.setBounds(84, 225, 160, 15);
		frame.getContentPane().add(Nom);
		
		id3= new JLabel("Date de Naissance :");
		id3.setFont(new Font("Dialog", Font.BOLD, 14));
		id3.setForeground(Color.decode("#fcdb02"));
		id3.setBounds(12, 265, 160, 15);
		frame.getContentPane().add(id3);
		
		DateNais= new JLabel(DatedeNaissance);
		DateNais.setForeground(Color.WHITE);
		DateNais.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		DateNais.setBounds(184, 265, 126, 15);
		frame.getContentPane().add(DateNais);
		
		id4 = new JLabel("Etat Civil :");
		id4.setFont(new Font("Dialog", Font.BOLD, 14));
		id4.setForeground(Color.decode("#fcdb02"));
		id4.setBounds(12, 305, 85, 15);
		frame.getContentPane().add(id4);

		Etat = new JLabel(EtatCivil);
		Etat.setForeground(Color.WHITE);
		Etat.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Etat.setBounds(102, 305, 170, 15);
		frame.getContentPane().add(Etat);
		
		
		
		id5= new JLabel("E-mail :");
		id5.setFont(new Font("Dialog", Font.BOLD, 14));
		id5.setForeground(Color.decode("#fcdb02"));
		id5.setBounds(12, 345, 70, 15);
		frame.getContentPane().add(id5);
		
		Mail = new JLabel(Email);
		Mail.setForeground(Color.WHITE);
		Mail.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Mail.setBounds(102, 345, 142, 15);
		frame.getContentPane().add(Mail);
		
		id6= new JLabel("Téléphone :");
		id6.setFont(new Font("Dialog", Font.BOLD, 14));
		id6.setForeground(Color.decode("#fcdb02"));
		id6.setBounds(12, 385, 100, 15);
		frame.getContentPane().add(id6);
		
		Telephone = new JLabel(Tel);
		Telephone.setForeground(Color.WHITE);
		Telephone.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Telephone.setBounds(121, 385, 160, 15);
		frame.getContentPane().add(Telephone);
		
		id7 = new JLabel("Adresse :");
		id7.setFont(new Font("Dialog", Font.BOLD, 14));
		id7.setForeground(Color.decode("#fcdb02"));
		id7.setBounds(12, 425, 85, 15);
		frame.getContentPane().add(id7);
		
		Adr = new JLabel(Adresse);
		Adr.setForeground(Color.WHITE);
		Adr.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Adr.setBounds(102, 425, 179, 15);
		frame.getContentPane().add(Adr);
		
		id8 = new JLabel("CIN :");
		id8.setFont(new Font("Dialog", Font.BOLD, 14));
		id8.setForeground(Color.decode("#fcdb02"));
		id8.setBounds(312, 145, 70, 15);
		frame.getContentPane().add(id8);
		
		Cin= new JLabel(CIN);
		Cin.setForeground(Color.WHITE);
		Cin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Cin.setBounds(416, 145, 152, 15);
		frame.getContentPane().add(Cin);
		
		id9 = new JLabel("Grade :");
		id9.setFont(new Font("Dialog", Font.BOLD, 14));
		id9.setForeground(Color.decode("#fcdb02"));
		id9.setBounds(312, 185, 70, 15);
		frame.getContentPane().add(id9);
		

		Grad = new JLabel(Grade);
		Grad.setForeground(Color.WHITE);
		Grad.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Grad.setBounds(438, 185, 152, 15);
		frame.getContentPane().add(Grad);
		
		
		id10 = new JLabel("Date d'entrée :");
		id10.setFont(new Font("Dialog", Font.BOLD, 14));
		id10.setForeground(Color.decode("#fcdb02"));
		id10.setBounds(312, 225, 126, 15);
		frame.getContentPane().add(id10);
		
		
		DateEnt= new JLabel(DateEntree);
		DateEnt.setForeground(Color.WHITE);
		DateEnt.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		DateEnt.setBounds(464, 225, 142, 15);
		frame.getContentPane().add(DateEnt);
		
		id11= new JLabel("Fonction :");
		id11.setFont(new Font("Dialog", Font.BOLD, 14));
		id11.setForeground(Color.decode("#fcdb02"));
		id11.setBounds(312, 265, 100, 15);
		frame.getContentPane().add(id11);
		
		Fct = new JLabel(Fonction);
		Fct.setForeground(Color.WHITE);
		Fct.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Fct.setBounds(438, 265, 152, 15);
		frame.getContentPane().add(Fct);
		
		id12 = new JLabel("Résidence Administrative :");
		id12.setFont(new Font("Dialog", Font.BOLD, 14));
		id12.setForeground(Color.decode("#fcdb02"));
		id12.setBounds(312, 305, 216, 15);
		frame.getContentPane().add(id12);
		
		Res = new JLabel(Residence);
		Res.setForeground(Color.WHITE);
		Res.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Res.setBounds(526, 305, 100, 15);
		frame.getContentPane().add(Res);
		
		id13 = new JLabel("Identifiant Unique :");
		id13.setFont(new Font("Dialog", Font.BOLD, 14));
		id13.setForeground(Color.decode("#fcdb02"));
		id13.setBounds(312, 345, 160, 15);
		frame.getContentPane().add(id13);
		

		Cnam = new JLabel(IdentifiantUnique);
		Cnam.setForeground(Color.WHITE);
		Cnam.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Cnam.setBounds(484, 345, 142, 15);
		frame.getContentPane().add(Cnam);
		
		id14 = new JLabel("Date de Récrutement :");
		id14.setFont(new Font("Dialog", Font.BOLD, 14));
		id14.setForeground(Color.decode("#fcdb02"));
		id14.setBounds(312, 385, 179, 15);
		frame.getContentPane().add(id14);
		
		DateRecr= new JLabel(DateRec);
		DateRecr.setForeground(Color.WHITE);
		DateRecr.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		DateRecr.setBounds(502, 385, 126, 15);
		frame.getContentPane().add(DateRecr);
		
		
		
		id15 = new JLabel("Lieu :");
		id15.setFont(new Font("Dialog", Font.BOLD, 14));
		id15.setForeground(Color.decode("#fcdb02"));
		id15.setBounds(312, 425, 70, 15);
		frame.getContentPane().add(id15);
		
		
		Place = new JLabel(Lieu);
		Place.setForeground(Color.WHITE);
		Place.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		Place.setBounds(416, 425, 152, 15);
		frame.getContentPane().add(Place);
	}
	
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	

	public void setID1(JLabel id) {
		Id = id;
	}

	public void setPrenom(JLabel prenom) {
		Prenom = prenom;
	}

	public void setNom(JLabel nom) {
		Nom = nom;
	}

	public void setDateNais(JLabel dateNais) {
		DateNais = dateNais;
	}

	public void setEtat(JLabel etat) {
		Etat = etat;
	}

	public void setMail(JLabel mail) {
		Mail = mail;
	}

	public void setTelephone(JLabel telephone) {
		Telephone = telephone;
	}

	public void setAdr(JLabel adr) {
		Adr = adr;
	}

	public void setCin(JLabel cin) {
		Cin = cin;
	}

	public void setGrad(JLabel grad) {
		Grad = grad;
	}

	public void setDateEnt(JLabel dateEnt) {
		DateEnt = dateEnt;
	}

	public void setFct(JLabel fct) {
		Fct = fct;
	}

	public void setRes(JLabel res) {
		Res = res;
	}

	public void setCnam(JLabel cnam) {
		Cnam = cnam;
	}

	public void setDateRecr(JLabel dateRecr) {
		DateRecr = dateRecr;
	}

	public void setPlace(JLabel place) {
		Place = place;
	}

	public void setAid16(JLabel aid16) {
		this.aid16 = aid16;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDatedeNaissance(String datedeNaissance) {
		DatedeNaissance = datedeNaissance;
	}

	public void setEtatCivil(String etatCivil) {
		EtatCivil = etatCivil;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public void setDateEntree(String dateEntree) {
		DateEntree = dateEntree;
	}

	public void setFonction(String fonction) {
		Fonction = fonction;
	}

	public void setResidence(String residence) {
		Residence = residence;
	}

	public void setIdentifiantUnique(String identifiantUnique) {
		IdentifiantUnique = identifiantUnique;
	}

	public void setDateRec(String dateRec) {
		DateRec = dateRec;
	}

	public void setLieu(String lieu) {
		Lieu = lieu;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JLabel getId0() {
		return id0;
	}

	public JLabel getId1() {
		return id1;
	}

	public JLabel getId2() {
		return id2;
	}

	public JLabel getId3() {
		return id3;
	}

	public JLabel getId4() {
		return id4;
	}

	public JLabel getId5() {
		return id5;
	}

	public JLabel getId6() {
		return id6;
	}

	public JLabel getId7() {
		return id7;
	}

	public JLabel getId8() {
		return id8;
	}

	public JLabel getId9() {
		return id9;
	}

	public JLabel getId10() {
		return id10;
	}

	public JLabel getId11() {
		return id11;
	}

	public JLabel getId12() {
		return id12;
	}

	public JLabel getId13() {
		return id13;
	}

	public JLabel getId14() {
		return id14;
	}

	public JLabel getId15() {
		return id15;
	}

	public JLabel getId16() {
		return id16;
	}

	public JLabel getId() {
		return Id;
	}

	public JLabel getPrenom() {
		return Prenom;
	}

	public JLabel getNom() {
		return Nom;
	}

	public JLabel getDateNais() {
		return DateNais;
	}

	public JLabel getEtat() {
		return Etat;
	}

	public JLabel getMail() {
		return Mail;
	}

	public JLabel getTelephone() {
		return Telephone;
	}

	public JLabel getAdr() {
		return Adr;
	}

	public JLabel getCin() {
		return Cin;
	}

	public JLabel getGrad() {
		return Grad;
	}

	public JLabel getDateEnt() {
		return DateEnt;
	}

	public JLabel getFct() {
		return Fct;
	}

	public JLabel getRes() {
		return Res;
	}

	public JLabel getCnam() {
		return Cnam;
	}

	public JLabel getDateRecr() {
		return DateRecr;
	}

	public JLabel getPlace() {
		return Place;
	}

	public JLabel getAid16() {
		return aid16;
	}

	public String getEmp_id() {
		return emp_id;
	}

	
	

	public String getDatedeNaissance() {
		return DatedeNaissance;
	}

	public String getEtatCivil() {
		return EtatCivil;
	}

	public String getEmail() {
		return Email;
	}

	public String getTel() {
		return Tel;
	}

	public String getAdresse() {
		return Adresse;
	}

	public String getCIN() {
		return CIN;
	}

	public String getGrade() {
		return Grade;
	}

	public String getDateEntree() {
		return DateEntree;
	}

	public String getFonction() {
		return Fonction;
	}

	public String getResidence() {
		return Residence;
	}

	public String getIdentifiantUnique() {
		return IdentifiantUnique;
	}

	public String getDateRec() {
		return DateRec;
	}

	public String getLieu() {
		return Lieu;
	}

	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}
}
