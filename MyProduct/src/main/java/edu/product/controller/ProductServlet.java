package edu.product.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.product.dao.ProductDao;
import edu.product.model.Product;

@WebServlet("/")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	
private ProductDao productDao = new ProductDao();
public ProductServlet() {
	super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	/*String pname = request.getParameter("pname");
	String bname = request.getParameter("bname");
	String pquan = request.getParameter("pquan");
	String pdesc = request.getParameter("pdesc");
	int price = Integer.parseInt(request.getParameter("price"));
	
	Product product = new Product();
	product.setPname(pname);
	product.setBname(bname);
	product.setPquan(pquan);
	product.setPdesc(pdesc);
	product.setPrice(price);*/
	String serURL = request.getServletPath();
	switch(serURL) {
	case "/prod":
	{
		try {
			List <Product> prodList = productDao.getProduct();
			request.setAttribute("prodList", prodList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("prod-list.jsp");
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
			r = productDao.deleteProductById(id);
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
	String pname = request.getParameter("pname");
	String bname = request.getParameter("bname");
	String pquan = request.getParameter("pquan");
	String pdesc = request.getParameter("pdesc");
	int price = Integer.parseInt(request.getParameter("price"));
	
	Product product = new Product();
	product.setPname(pname);
	product.setBname(bname);
	product.setPquan(pquan);
	product.setPdesc(pdesc);
	product.setPrice(price);
	String requestPart = request.getServletPath();
	switch(requestPart) {
	case "/addProduct":
	{
	
	try {
		int x=0;
		x= productDao.saveProduct(product);
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
			x= productDao.updateProduct(product);
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
