package models;
import java.sql.*;
import com.mysql.jdbc.Connection;

public class DBconn {
	
	private static Connection con = null;
	
	public static Connection getconnection(){
		
		//SINGLETON
		if(con == null){
			try {
				java.sql.DriverManager.registerDriver(new com.mysql.jdbc.Driver());	 				
				con =  (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/webdevproject","root", "");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		
		return con;
	}
	
	
}