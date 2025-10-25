package test.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String name =request.getParameter("name");
		String password =request.getParameter("pwd");
		if(name.equals("admin") && password.equals("12345") ) {
			out.println("Login successfully");
//			RequestDispatcher rs=request.getRequestDispatcher("Register.html");
//			rs.forward(request, response);
		
			response.sendRedirect("https://www.youtube.com/");
		}
		else {
			out.println("login failed ...");
			RequestDispatcher rs=request.getRequestDispatcher("error.html");
			rs.include(request, response);
		}
		
		
	}	
	}


