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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class View {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
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
		
	
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=0;
				int id= Integer.valueOf(textField.getText().toString());
				try {
					ConnectionDB con=new ConnectionDB();
					con.seConnecter();
					String str="select * from employee where EmpID='"+id+"'";
					con.executerRequete(str);
					
					while (con.getRs().next()) {
						i++;
					}
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				if (i==0) {
					JOptionPane.showMessageDialog(null, "Employé n'existe pas!");
					
				}
				else { 
				frame.setVisible(false);
				Update up=new Update();
				Update.main(null);
				}
			}
		});
		btnModifier.setBounds(85, 209, 117, 25);
		frame.getContentPane().add(btnModifier);
		
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
		
		textField = new JTextField();
		textField.setBounds(233, 138, 190, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

	}
}
