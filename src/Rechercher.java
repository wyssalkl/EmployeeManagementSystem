import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class Rechercher {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechercher window = new Rechercher();
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
	public Rechercher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 98, 157));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/hp/Desktop/Stage TT/Webp.net-resizeimage.jpg"));
		lblNewLabel.setBounds(152, 12, 153, 101);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setFont(new Font("Courier 10 Pitch", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(36, 135, 190, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(233, 138, 190, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {int i=0;
			String emp_id=textField.getText().toString();
			int id= Integer.valueOf(textField.getText().toString());
			try {
				ConnectionDB con1=new ConnectionDB();
				con1.seConnecter();
				String str="select * from employee where EmpID='"+id+"'";
				con1.executerRequete(str);
				
				while (con1.getRs().next()) {
					i++;
				}
				if (i==0) {
					JOptionPane.showMessageDialog(null, "Employé n'existe pas!");
					
				}
				else { 
				frame.setVisible(false);
				Print up=new Print(emp_id);
				up.getFrame().setVisible(true);
				try {
					ConnectionDB con=new ConnectionDB();
					con.seConnecter();
					String sql="select * from employee where EmpID='"+id+"'";
					con.executerRequete(str);
				while (con.getRs().next()) {
					
					 up.getId().setText(con.getRs().getString("EmpID"));
					 up.getPrenom().setText( con.getRs().getString("Prenom"));
					 up.getNom().setText( con.getRs().getString("Nom"));
					 up.getDateNais().setText( con.getRs().getString("Date_Naissance"));
					 up.getEtat().setText( con.getRs().getString("Etat_CIvil"));
					 up.getMail().setText( con.getRs().getString("Email"));
					 up.getTelephone().setText( con.getRs().getString("Tel"));
					 up.getAdr().setText( con.getRs().getString("Adresse"));
					 up.getCin().setText( con.getRs().getString("Num_CIN"));
					 up.getGrad().setText( con.getRs().getString("Grade"));
					 up.getDateEnt().setText( con.getRs().getString("Date_entree"));
					 up.getFct() .setText( con.getRs().getString("Fonction"));
					 up.getRes().setText( con.getRs().getString("Residence_administrative"));
					 up.getCnam().setText( con.getRs().getString("Identifiant_Unique"));
					 up.getDateRecr().setText( con.getRs().getString("Date_Recru"));
					 up.getPlace().setText( con.getRs().getString("Lieu"));
					
				}
				
				
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			}
		});
		btnRechercher.setBounds(85, 209, 117, 25);
		frame.getContentPane().add(btnRechercher);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				 frame.setVisible(false);
				Menu_Admin1 m = new Menu_Admin1();
				Menu_Admin1.main(null);
			}
		});
		btnCancel.setBounds(221, 209, 117, 25);
		frame.getContentPane().add(btnCancel);

	}
}
