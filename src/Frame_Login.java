import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Frame_Login extends JFrame {

	private Image img_logo = new ImageIcon(Frame_Login.class.getResource("res/museum.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_username = new ImageIcon(Frame_Login.class.getResource("res/user.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(Frame_Login.class.getResource("res/lock.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_log_in = new ImageIcon(Frame_Login.class.getResource("res/key.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);

	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Login frame = new Frame_Login();
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
	public Frame_Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 98, 157));
		contentPane.setFont(new Font("Chilanka", Font.PLAIN, 12));
		contentPane.setBackground(new Color(0,98,157));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(175, 167, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().contentEquals("Username")) {
					txtUsername.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Chandas", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(12, 12, 170, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconUsername.setBounds(211, 0, 39, 40);
		lblIconUsername.setIcon(new ImageIcon("/home/hp/eclipse-workspace/Login_app/src/res/user.png"));
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(175, 218, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {

					txtPassword.setText("");
				}
				else  {
					txtPassword.selectAll();
				}
				
			}
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {

					txtPassword.setText("Password");
				}
				
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setText("Password");
		txtPassword.setBounds(12, 12, 170, 20);
		panel_1.add(txtPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconPassword.setBounds(211, 3, 39, 32);
		lblIconPassword.setIcon(new ImageIcon("/home/hp/eclipse-workspace/Login_app/src/res/lock.png"));

		panel_1.add(lblIconPassword);
		
		
		
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application","Confirmation", JOptionPane.YES_NO_OPTION)== 0)
					Frame_Login.this.dispose();
			}
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Century Schoolbook L", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(580, 0, 20, 20);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(158, 12, 265, 128);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon("/home/hp/Desktop/Stage TT/Webp.net-resizeimage.jpg"));
		
		JLabel lblLoginMessage = new JLabel("");
	
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Chandas", Font.PLAIN, 12));
		lblLoginMessage.setBounds(175, 270, 250, 18);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			
				@Override
				public void mouseClicked(MouseEvent e) {
				
					String login =txtUsername.getText().toString();
					String password=txtPassword.getText().toString();
					String sql="SELECT * FROM project.bank WHERE password ='" +password+"' and username ='"+login+"'";
					ConnectionDB x =new ConnectionDB();
					x.seConnecter();
					x.executerRequete(sql);
					
					int i=0;
					try {
						while (x.getRs().next()) {
							  i++;
							}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (i==0) {
						lblLoginMessage.setText("Username & password didn't match");}
					else {
						
						lblLoginMessage.setText("");
						JOptionPane.showMessageDialog(null,"Login Successful!");
						
						Menu_Admin1 menu = new Menu_Admin1();
						Menu_Admin1.main(null);
				}
			
			//public void mouseEntered(MouseEvent e) {
				//pnlBtnLogin.setBackground(new Color(30, 60, 60));
				
					
					

			}
			public void mouseExited(MouseEvent e) {
				//pnlBtnLogin.setBackground(new Color(255, 229, 8));

			}
			public void mousePressed(MouseEvent e) {
			//	pnlBtnLogin.setBackground(new Color(60, 80, 80));

			}
			public void mouseReleased(MouseEvent e) {
			//	pnlBtnLogin.setBackground(new Color(30, 60, 6));}
			}
			
		});
		pnlBtnLogin.setBackground(new Color (39, 153, 162));
		pnlBtnLogin.setBounds(175, 298, 250, 50);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Chandas", Font.BOLD, 14));
		lblLogin.setBounds(112, 16, 59, 26);
		pnlBtnLogin.add(lblLogin);
		
		JLabel lblIconLogin = new JLabel("");
		lblIconLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogin.setIcon(new ImageIcon("/home/hp/eclipse-workspace/Login_app/src/res/key.png"));
		lblIconLogin.setBounds(57, 0, 59, 50);
		pnlBtnLogin.add(lblIconLogin);
	}
}
