package calculater;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/output")
public class Result extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		int num1= Integer.parseInt(req.getParameter("num1"));
		int num2= Integer.parseInt(req.getParameter("num2"));
		
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		if(name.equals("mul")) {
			int result=num1*num2;
			out.println("<h2>Multipilication is "+result+"</h2>");
		}

		if(name.equals("add")) {
			int result=num1+num2;
			out.println("<h2>Addition is "+result+"</h2>");
		}

		if(name.equals("div")) {
			int result=num1/num2;
			out.println("<h2>Diviion is "+result+"</h2>");
		}

		if(name.equals("sub")) {
			int result=num1-num2;
			out.println("<h2>subtraction is "+result+"</h2>");
		}
		
	
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
