package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	public Integer Id;
	public String username;
	public String password;
	public String name;
	public String surname;
	public String email;
	public String country;

	public User(String username, String name, String surname, String password, String email, String country) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.country = country;
	}
	
	public User() {
		
	}
	
	public boolean Insert(){
		try {
			String sql = "INSERT INTO users (Username,Name,Surname,Password,Country,Email) VALUES (?,?,?,md5(?),?,?)";  
			 
		 	Connection conn=DBconn.getconnection();
	        PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
			pst.setString(1, this.username);
			pst.setString(2, this.name);
			pst.setString(3, this.surname);
			pst.setString(4, this.password);
			pst.setString(5, this.country);
			pst.setString(6, this.email);
			pst.executeUpdate();
			return true;
		} catch(Exception es){
			System.out.println(es.getMessage());
			return false;
		}
	}
	
	public static  List<User> getUsers(){	
		
		 try{
				// create our mysql database connection
				Connection conn=DBconn.getconnection();
				
				// create the java statement
				Statement st = conn.createStatement();
		        
				//SQL STRING
				String sql  = "SELECT * from users";
						
				// execute the query, and get a java result set
				ResultSet rs = st.executeQuery(sql);
		       
		        //create list users
		        List<User> users = new ArrayList<User>();
		        
		        while(rs.next())
		        {		        
		        	User x =new User();

		        	x.Id = Integer.parseInt(rs.getString("IdUser"));
		        	x.username= rs.getString("Username");
		        	x.name= rs.getString("Name");
		        	x.surname = rs.getString("Surname");
		        	x.password= rs.getString("Password");
		        	x.country = rs.getString("Country");
		        	x.email = rs.getString("Email");
		        	
		 
		            users.add(x);
		        }
		        
		        //close record set
		        rs.close();
		        
		        return users;
		        
		    }
		    catch(Exception ex)
		    {
		    	System.out.println(ex.getMessage());
		    	return null;
		    }
	}
	
}
