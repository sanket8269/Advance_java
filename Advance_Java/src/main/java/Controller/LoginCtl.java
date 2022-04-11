package Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import Bean.AuthenticateBean;
import Model.AuthenticateModel;
import Model.RegistrationModel;

@WebServlet("/Hello")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");

		Cookie c = new Cookie(email, pwd);
		c.setMaxAge(24 * 60 * 60);
		response.addCookie(c);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Cookie added");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");

	
		AuthenticateModel model = new AuthenticateModel();

		try {
			AuthenticateBean bean = model.Authenticate(email, pwd);

			if (email.equals("") && pwd.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");

				request.setAttribute("s1", "Email is Required.");
				request.setAttribute("s2", "Password is Required");
				rd.forward(request, response);

			} else if (email.equals("") || pwd.equals("")) {

				if (email.equals("")) {

					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("s1", "Email is Required");
					rd.forward(request, response);

				} else {
					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("s2", "Password is Required");
					rd.forward(request, response);

				}
			} else {
				if (bean != null) {
					HttpSession session = request.getSession();
					session.setAttribute("email", bean);
					RequestDispatcher rd = request.getRequestDispatcher("WelcomeCtl.do");
					rd.forward(request, response);
					

				} else {

					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("Error", "Invalid user/password");
					rd.forward(request, response);
				}
			}
		} catch (Exception e) {

		}

	}
}