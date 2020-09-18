
import java.sql.Connection; 
	 import java.sql.DriverManager; 
	 import java.sql.ResultSet; 
	 import java.sql.SQLException; 
	 import java.sql.Statement;

import javax.swing.JOptionPane; 
	 
public class ConnectionDB {

	
	public Statement s;

		 private Connection connection; 
		 private Statement st; 
		 private ResultSet rs; 
		 private String sql; 
		 
		 public boolean seConnecter(){ 
			 
			 String url="jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC";  
			 String login="root"; 
			 String mdp="wissalsoumaya26"; 
			 try { 
				 Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
				/* System.out.println("connection success");*/} 
			 catch (InstantiationException | ClassNotFoundException |IllegalAccessException e) { 
				 e.printStackTrace(); return false;		 }
				 
			 try { 
				 connection=DriverManager.getConnection(url,login,mdp); }
			 
			 catch (SQLException e1) {e1.printStackTrace();  return false; } 
			 return true; } 
	 	public boolean executerUpdate(String sql){ 
	 		try { 
	 			st=connection.createStatement(); st.executeUpdate(sql); 
	 			JOptionPane.showMessageDialog(null, "Mise à jour effectué avec succées!");} 
	 		catch (SQLException e) { 
	 			e.printStackTrace();  
	 			return false;  }
	 		return true;  }  
	 	public boolean executerRequete(String sql){ 
	 		try {  st=connection.createStatement(); setRs(st.executeQuery(sql)); } 
	 		catch (SQLException e) {   
	 			e.printStackTrace(); 
	 			return false; } 
	 		return true;  } 
	 	
	 		public void setRs(ResultSet rs) { 
	 				this.rs = rs;  } 
	 		public ResultSet getRs() { 
	 		 return rs;  }}