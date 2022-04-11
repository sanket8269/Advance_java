package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.AuthenticateBean;
import Model.AuthenticateModel;

@WebServlet("/p")
public class PasswordCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AuthenticateModel model = new AuthenticateModel();
		String pwd = request.getParameter("password");

		try {
			AuthenticateBean bean = model.Authenticate(pwd);

			if (pwd.equals("")) {
				RequestDispatcher rd = request.getRequestDispatcher("PasswordView.jsp");
				request.setAttribute("D2", "Password Is Requird.");
				rd.forward(request, response);
			} else {
					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("r2", "Invaild Password.");
					rd.forward(request, response);

				}
			
		} catch (Exception e) {
		}

	
	}

}
