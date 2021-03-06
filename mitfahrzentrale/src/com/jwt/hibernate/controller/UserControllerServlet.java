package com.jwt.hibernate.controller;
 
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import com.jwt.hibernate.dao.UserDAO;
 
public class UserControllerServlet extends HttpServlet {
     
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String userSurname = request.getParameter("userSurname");
        String userFamilyname = request.getParameter("userFamilyname");
        String password = request.getParameter("password1");
        String email = request.getParameter("email");
 
        HttpSession session = request.getSession(true);
        
        response.sendRedirect(response.encodeRedirectUrl("Angebot_hinzufuegen.jsp")); // nach einem Submit wird hier testweise auf die Seite Angebot_hinzufuegen weitergeleitet.
        
        
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(userSurname, userFamilyname, password, email);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }
}
