package Controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.RegistrationBean;
@WebServlet(urlPatterns = "/Localcgtl")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("in login");
		
		
	}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.sendRedirect("LoginRegistration.jsp");
			
			
			
/*			String u = request.getParameter("user");
			String p = request.getParameter("user");
			String m = request.getParameter("Email");
			String N = request.getParameter("contact");
			String c = request.getParameter("city");
			String t = request.getParameter("password");


		RegistrationBean bean = new RegistrationBean();
		bean.setNAME(request.getParameter("user"));
		bean.setNAME(request.getParameter("user"));
		bean.setEmail(request.getParameter("Email"));
		bean.setCONTACT(request.getParameter("contact"));
		bean.setPASSWORD(request.getParameter("Password"));
		
		PrintWriter out = response.getWriter();
			
			out.println(u);
			out.println(p);
			out.println(m);
			out.println(N);
			out.println(c);
			out.println(t);

			
			out.close();
			doPost(request, response);
		}*/
}
}