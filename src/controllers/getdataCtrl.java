package controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import models.User;
@WebServlet("/getdataCtrl")
public class getdataCtrl extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	   /**
	    * @see HttpServlet#HttpServlet()
	    */
	   public getdataCtrl() {
	       super();
	       // TODO Auto-generated constructor stub
	   }
	
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONArray output = new JSONArray();
	
	 	try{ 		
	 		//check sessionId
	 		//String sessionId = request.getParameter("sessionId");
	 		
	 			
			List<User> users = User.getUsers();
			for (User object: users) {
				
				JSONObject item = new JSONObject();
				item.put("IdUser", object.Id);
				item.put("Username", object.username);
				item.put("Name", object.name);
				item.put("Surname", object.surname);
				item.put("Password", object.password);
				item.put("Country", object.country);
				item.put("Email", object.email);
				output.add(item);  
			}
	 	    
	    }
	    catch(Exception ex)
	    {
	    	JSONObject item = new JSONObject();
	    	item.put("error",ex.getMessage());
	    	output.add(item); 
	    }
	 	
	 	response.getWriter().append(output.toJSONString());

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
