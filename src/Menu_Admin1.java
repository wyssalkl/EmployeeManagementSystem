import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.JButton;

public class Menu_Admin1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Admin1 window = new Menu_Admin1();
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
	public Menu_Admin1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 98, 157));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setFont(new Font("Chilanka", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(0,98,157));
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(50, 60, 70, 15);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/hp/Desktop/Stage TT/Webp.net-resizeimage.jpg"));
		lblNewLabel.setBounds(253, 0, 154, 128);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				First menu = new First();
				First.main(null);
			}
		});
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(221, 142, 198, 35);
		frame.getContentPane().add(panel);
		
		JLabel lblAjouter = new JLabel("Ajouter");
		panel.add(lblAjouter);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				View v=new View();
				View.main(null);
			}
		});
		panel_1.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_1.setBounds(221, 189, 198, 35);
		frame.getContentPane().add(panel_1);
		
		JLabel lblModifier = new JLabel("Modifier");
		panel_1.add(lblModifier);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Remove v=new Remove();
				Remove.main(null);
				
			}
		});
		panel_2.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2.setBounds(221, 236, 198, 35);
		frame.getContentPane().add(panel_2);
		
		JLabel lblSupprimer = new JLabel("Supprimer");
		panel_2.add(lblSupprimer);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Rechercher r =new Rechercher();
				Rechercher.main(null);
			}
		});
		panel_3.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_3.setBounds(221, 283, 198, 35);
		frame.getContentPane().add(panel_3);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		panel_3.add(lblRechercher);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
					
					if(JOptionPane.showConfirmDialog(frame , "Are you sure you want to close this application","Confirmation", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
						{System.exit(0);
				}
			}
		});
		panel_4.setBackground(Color.GRAY);
		panel_4.setBorder(UIManager.getBorder("MenuItem.border"));
		panel_4.setBounds(272, 330, 107, 29);
		frame.getContentPane().add(panel_4);
		
		JLabel lblExit = new JLabel("Exit");
		panel_4.add(lblExit);
		
		
	}
}
