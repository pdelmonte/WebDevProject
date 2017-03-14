package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import models.User;

/**
 * Servlet implementation class InsertCtrl
 */
@WebServlet("/InsertCtrl")
public class InsertCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public InsertCtrl() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		JSONArray output = new JSONArray();				
		JSONObject item =  new JSONObject();
		
		//Load Model
		User x = new User(username, name, surname, password, email, country);
		if(x.Insert()){
			item.put("status", true);
			//SEND JSON OK
		} else {
			item.put("status", false);
			//SEND JSON KO ERROR
		}
		
		output.add(item); 
		response.getWriter().append(output.toJSONString());
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
