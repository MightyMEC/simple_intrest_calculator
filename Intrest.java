package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Intrest
 */
@WebServlet("/Intrest")
public class Intrest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("takenyear"));
		int b = Integer.parseInt(request.getParameter("takenmonth"));
		int c = Integer.parseInt(request.getParameter("takenday"));
		int A = Integer.parseInt(request.getParameter("givenyear"));
		int B = Integer.parseInt(request.getParameter("givenmonth"));
		int C = Integer.parseInt(request.getParameter("givenday"));
		int p = Integer.parseInt(request.getParameter("amount"));
		int r = Integer.parseInt(request.getParameter("rate"));
		
		int count=0;
		if(c>C) {
			C=C+30;
			count=C-c;
			B=B-1;
		}
		else {
			count = C-c;
		}
		int m=0;
		if(b>B) {
			B=B+12;
			 m=B-b;
			count=count+(m*30);
			A=A-1;
		}
		else {
			m=B-b;
			count=count+(m*30);
		}
		int year=A-a;
		count=count+((year*12)*30);
		count=count+5;
		
		System.out.println(count);
	
		int monthly=p/100;
		int vaddi=monthly*r;
		int baru=(vaddi/30)*count;
		System.out.println(baru);
		int amount =p+baru;
		PrintWriter writer = response.getWriter();		
		writer.print("<h1> intrest is="+baru+"</h1> <br>");
		writer.print("<h1> intrest + amount taken="+amount+"</h1>");
		
		
	}

}
