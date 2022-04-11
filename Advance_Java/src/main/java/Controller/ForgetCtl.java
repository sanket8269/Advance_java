package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.AuthenticateBean;
import Bean.RegistrationBean;
import Model.AuthenticateModel;
import Model.RegistrationModel;

@WebServlet(urlPatterns = "/ForgetCtl")
public class ForgetCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AuthenticateModel model = new AuthenticateModel();
		String email = request.getParameter("login");

		try {

			if (email.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("ForgetPasswordView.jsp");
				request.setAttribute("r1", "Email Is Required.");
				rd.forward(request, response);
			} else {
				AuthenticateBean bean = model.Authenticate(email);
				if (bean != null) {
					RequestDispatcher rd = request.getRequestDispatcher("PasswordView.jsp");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("ForgetPasswordView.jsp");
					request.setAttribute("r2", "Invaild Users");
					rd.forward(request, response);

				}
			}
		} catch (Exception e) {
		}
	}
}