package com.app.pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServCalc
 */
@WebServlet("/ServCalc")
public class ServCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServCalc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		int x,y;
		String str1="";
		x=Integer.parseInt(request.getParameter("txtfn"));
		y=Integer.parseInt(request.getParameter("txtsn"));
		str1=request.getParameter("operation");
		
		if (str1.equals("add")) {
			
			out.print("<h1> Result of Addition is : "+(x+y)+"</h1>");
			
		}else if (str1.equals("sub")) {
			out.print("<h1> Result of Subtraction is : "+(x-y)+"</h1>");
			
		}else if (str1.equals("mul")) {
			out.print("<h1> Result of Multiplication is : "+(x*y)+"</h1>");
			
		}else if (str1.equals("div")) {
			out.print("<h1> Result of Division is : "+(x/y)+"</h1>");
			
		}else {
			out.print("<h1> Result of Modulus is : "+(x%y)+"</h1>");
			
		}
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
