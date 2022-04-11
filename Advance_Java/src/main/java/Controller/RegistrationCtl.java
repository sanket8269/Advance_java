package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.AuthenticateBean;
import Bean.RegistrationBean;
import Model.RegistrationModel;

@WebServlet("/RegistrationCtl")
public class RegistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrationBean bean = new RegistrationBean();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Contact = request.getParameter("contact");
		String pwd = request.getParameter("pwd");
		String city = request.getParameter("city");

		bean.setNAME(name);
		bean.setPASSWORD(pwd);
		bean.setEmail(email);
		bean.setCONTACT(Contact);
		bean.setCITY(city);

		try {
			if (name.equals("") && email.equals("") && Contact.equals("") && pwd.equals("") && city.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("RegistrationView.jsp");
				request.setAttribute("s1", "Name is Requird..");
				request.setAttribute("s2", "Email is Requird..");
				request.setAttribute("s3", "Contact is Requird..");
				request.setAttribute("s4", "Password is Requird..");
				request.setAttribute("s5", "city is Requird..");
				rd.forward(request, response);

			} else if (name.equals("") || email.equals("") || Contact.equals("") || pwd.equals("") || city.equals("")) {

				if (name.equals("")) {
					request.setAttribute("s1", "Name is Required");

				}
				if (email.equals("")) {

					request.setAttribute("s2", "Email is Required");
				}

				if (Contact.equals("")) {

					request.setAttribute("s3", "Contact is Required");
				}
				if (pwd.equals("")) {

					request.setAttribute("s4", "Email is Required");

				}
				if (city.equals("")) {

					request.setAttribute("s5", "City is Required");
				}
				RequestDispatcher rd = request.getRequestDispatcher("RegistrationView.jsp");
				rd.forward(request, response);
			} else {
				RegistrationModel rm = new RegistrationModel();
				rm.testadd(bean);
				RequestDispatcher rh = request.getRequestDispatcher("LoginView.jsp");

				request.setAttribute("j1", "Registration Successfully");
				
				rh.forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}