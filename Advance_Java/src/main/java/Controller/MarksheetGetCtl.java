package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.MarksheetModel;

@WebServlet(urlPatterns = "/MG") 
public class MarksheetGetCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MarksheetModel model = new MarksheetModel();
		try {
			List list = model.testMeritlist();

			RequestDispatcher rd = request.getRequestDispatcher("MarksheetGetView.jsp");
			request.setAttribute("w1", list);
			rd.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
