package com.jwt.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jwt.hibernate.dao.UserChangeData;

public class UserChangeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
       
    	// Hier muss wohl noch die Variable id erstellt werden, ich weiß aber nicht wie. Ich habe mich am UserControllerServlet orientiert.
    	String userSurname = request.getParameter("userSurname");
        String userFamilyname = request.getParameter("userFamilyname");
        String password = request.getParameter("password1");
        String email = request.getParameter("email");
 
        HttpSession session = request.getSession(true);
        
        response.sendRedirect(response.encodeRedirectUrl("main.jsp")); // nach einem Submit wird hier testweise auf die Seite main weitergeleitet.
        
      
        try {
            UserChangeData userChangeData = new UserChangeData();
            userChangeData.changeUserDetails(id, userSurname, userFamilyname, password, email);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }
}

