package com.web.devproj.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import java.io.*;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.web.devproj.AddServlet;

public class AddServletTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testServlet() throws NumberFormatException, Exception{		
		assertTrue(73.8==Double.parseDouble(currency("Dollar","Euro")));
		assertTrue(6750==Double.parseDouble(currency("Dollar","Rupee")));
		assertTrue(27==Double.parseDouble(currency("Dollar","Dinar")));
		assertTrue(90==Double.parseDouble(currency("Dollar","Dollar")));
		
		assertTrue(109.8==Double.parseDouble(currency("Euro","Dollar")));
		assertTrue(8005.5==Double.parseDouble(currency("Euro","Rupee")));
		assertTrue(33.3==Double.parseDouble(currency("Euro","Dinar")));
		assertTrue(90==Double.parseDouble(currency("Euro","Euro")));
		
		assertTrue(298.8==Double.parseDouble(currency("Dinar","Dollar")));
		assertTrue(21762==Double.parseDouble(currency("Dinar","Rupee")));
		assertTrue(90==Double.parseDouble(currency("Dinar","Dinar")));
		assertTrue(244.8==Double.parseDouble(currency("Dinar","Euro")));
		
		assertTrue(1.2==Double.parseDouble(currency("Rupee","Dollar")));
		assertTrue(90==Double.parseDouble(currency("Rupee","Rupee")));
		//assertTrue(0.99==Double.parseDouble(currency("Rupee","Euro")));
		//assertTrue(0.369==Double.parseDouble(currency("Rupee","Dinar")));
		
	}

	private String currency(String s11, String s12) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response=mock(HttpServletResponse.class);
		RequestDispatcher rd= mock(RequestDispatcher.class);
		Comparable c= mock(Comparable.class);
		
		when(request.getParameter("amount")).thenReturn("90");
		when(request.getParameter("source")).thenReturn(s11);
		when(request.getParameter("dest")).thenReturn(s12);
		
		when(request.getRequestDispatcher("output.jsp")).thenReturn(rd);
		
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		when(response.getWriter()).thenReturn(pw);

		new AddServlet().doGet(request,response);
		
		String res = sw.getBuffer().toString().trim();
		verify(rd).forward(request, response);
		
	     return res;
		
	}

	
}