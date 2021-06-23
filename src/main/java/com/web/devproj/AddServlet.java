package com.web.devproj;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	String dollar = "Dollar";
	String rupee = "Rupee";
	String euro = "Euro";
	String dinar = "Dinar";

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	  {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		  double result = 0;
		  double transactionCharges = 0;
		  double netAmount = 0;
		  String i = req.getParameter("source");
		  String j = req.getParameter("dest");
	      double val = Double.parseDouble(req.getParameter("amount"));
		 if(i.equals(dollar) && j.equals(dollar)){result =  val;}
		 if(i.equals(dollar) && j.equals(rupee)){result = 75 * val;}
		 if(i.equals(dollar) && j.equals(euro)){result = 0.82 * val;}
		 if(i.equals(dollar) && j.equals(dinar)){result = 0.30 * val;}
		 
		 if(i.equals(rupee) && j.equals(dollar)){result = val/75;}
		 if(i.equals(rupee) && j.equals(rupee)){result = val;}
		 if(i.equals(rupee) && j.equals(euro)){result = 0.011 * val;}
		 if(i.equals(rupee) && j.equals(dinar)){result = 0.0041 * val;}
		 
		 if(i.equals(dinar) && j.equals(dollar)){result = 3.32*val;}
		 if(i.equals(dinar) && j.equals(rupee)){result = 241.80*val;}
		 if(i.equals(dinar) && j.equals(euro)){result = 2.72 * val;}
		 if(i.equals(dinar) && j.equals(dinar)){result =  val;	}
		 
		 if(i.equals(euro) && j.equals(dollar)){result = 1.22*val;}
		 if(i.equals(euro) && j.equals(rupee)) {result = 88.95*val;}
		 if(i.equals(euro) && j.equals(euro)){result =  val;}
		 if(i.equals(euro) && j.equals(dinar)){result = 0.37 * val;}
		 
		 transactionCharges = 0.01 * result;
		 netAmount = result - transactionCharges;
		 
		 RequestDispatcher dispatcher = req.getRequestDispatcher("output.jsp");
		 out.print(result);
		 req.setAttribute("result", result);
		 req.setAttribute("charges", transactionCharges);
		 req.setAttribute("netAmount", netAmount);
		 dispatcher.forward(req,res);
		  
	  }
	}
