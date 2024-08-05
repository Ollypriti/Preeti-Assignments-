package edu.student.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.students.dao.StudentsDao;
import edu.student.model.Student;

@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	
private StudentsDao studentDao = new StudentsDao();
public StudentServlet() {
	super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	String pass = request.getParameter("pass");
	
	Student student = new Student();
	student.setFname(fname);
	student.setLname(lname);
	student.setEmail(email);
	student.setMobile(mobile);
	student.setPass(pass);
	String serURL = request.getServletPath();
	switch(serURL) {
	case "/studs":
	{
		try {
			List <Student> studList = studentDao.getStudent();
			request.setAttribute("studList", studList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("stud-list.jsp");
			dispatcher.forward(request, response);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		break;
	}
	case "/delete":
	{
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			int r = 0;
			r = studentDao.deleteStudentById(id);
			if(r>0) {
				response.sendRedirect("done.jsp");
			}
			else {
				response.sendRedirect("error.jsp");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	String pass = request.getParameter("pass");
	
	Student student = new Student();
	student.setFname(fname);
	student.setLname(lname);
	student.setEmail(email);
	student.setMobile(mobile);
	student.setPass(pass);
	String requestPart = request.getServletPath();
	switch(requestPart) {
	case "/addStudent":
	{
	
	try {
		int x=0;
		x= studentDao.saveStudent(student);
		if(x>0) {
			response.sendRedirect("done.jsp");
		}
		else {
			response.sendRedirect("error.jsp");

		}
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
		response.sendRedirect("error.jsp");
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	break;
}
	case "/Update":
	{
		try {
			int x=0;
			x= studentDao.updateStudent(student);
			if(x>0) {
				response.sendRedirect("done.jsp");
			}
			else {
				response.sendRedirect("error.jsp");

			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
		
}
	
	
}
}
}
