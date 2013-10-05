package com.example.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.classes.Calculator;

/**
 * Servlet implementation class Calcservlet
 */
@WebServlet("/Calcservlet")
public class Calcservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calcservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String useraction=request.getParameter("useraction");
	int i = Integer.parseInt(request.getParameter("usrval1"));
	int j=Integer.parseInt(request.getParameter("usrval2"));
	int k=0;
	

	if(useraction.equals("add"))
	  k=Calculator.add(i, j);
	if(useraction.equals("mul"))
	  k=Calculator.multiply(i,j);
	if(useraction.equals("div"))
	  k=Calculator.div(i, j);
	
	response.getWriter().println(k);
	
	
	}
}
