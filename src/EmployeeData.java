import java.sql.*;
import javax.swing.*;

public class EmployeeData {
	public Statement s;
	public static Connection ConnectDB() {
		String url="jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC";  
		 String login="root"; 
		 String mdp="wissalsoumaya26";
		try { 
			 Connection conn=DriverManager.getConnection(url,login,mdp);
			 return conn; }
		 
		 catch (SQLException e1)
		{
			 e1.printStackTrace(); 
			 return null; }
		
		} 
	}


