package test.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String firstname =request.getParameter("fname");
		String lastname =request.getParameter("lname");
		String password =request.getParameter("pwd");
		if(firstname.equals("admin") && lastname.equals("admin1")&& password.equals("12345") ) {
			out.println("Login successfully");
		}
		else {
			out.println("login failed ...");
		}	
	}
	
	}

	

