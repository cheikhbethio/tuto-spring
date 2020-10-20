package com.springhibernate.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJdbc
 */
@WebServlet("/TestJdbc")
public class TestJdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestJdbc() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = "springstudent";
		String pass = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:9998/web_customer_tracker?useSSm=false";
		String driver = "com.mysql.jdbc.Driver";
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to data base: " +jdbcUrl);
			
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("success connection");
			myConn.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
