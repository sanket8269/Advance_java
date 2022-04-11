package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MarksheetBean;
import Model.MarksheetModel;

@WebServlet(urlPatterns = "/m")
public class MarksheetCtl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MarksheetModel model = new MarksheetModel();
		try {
			List list = model.search();

			RequestDispatcher rd = request.getRequestDispatcher("MarksheetDataView.jsp");
			request.setAttribute("w1", list);
			rd.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * MarksheetModel model = new MarksheetModel(); try { List list =
		 * model.search();
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("MarksheetView.jsp");
		 * request.setAttribute("w1", list); rd.forward(request, response);
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.printStackTrace();
		 */}

	/*
	 * MarksheetBean bean = new MarksheetBean(); String Roll =
	 * request.getParameter("Roll No"); String First =
	 * request.getParameter("First_Name"); String Last =
	 * request.getParameter("Last_Name"); String Phy = request.getParameter("90");
	 * String Che = request.getParameter("80"); String Math =
	 * request.getParameter("70");
	 * 
	 * bean.setRoll_NO(Roll); bean.setFIRST_NAME(First); bean.setLAST_NAME(Last);
	 * bean.setPHYSICS(Phy); bean.setCHEMISTRY(Che); bean.setMATHS(Math); try { if
	 * (Roll.equals("") && First.equals("") && Last.equals("") && Phy.equals("") &&
	 * Che.equals("") && Math.equals("")) { RequestDispatcher rd =
	 * request.getRequestDispatcher("MarksheetView.jsp"); request.setAttribute("t1",
	 * "ROll No is Requird.."); request.setAttribute("t2",
	 * "First Name is Requird.."); request.setAttribute("t3",
	 * "Last Name is Requird.."); request.setAttribute("t4", "Marks is Requird..");
	 * request.setAttribute("t5", "Marks is Requird.."); request.setAttribute("t6",
	 * "Marks is Requird.."); rd.forward(request, response);
	 * 
	 * } else if (Roll.equals("") || First.equals("") || Last.equals("") ||
	 * Phy.equals("") || Che.equals("") || Math.equals("")) {
	 * 
	 * if (Roll.equals("")) { request.setAttribute("t1", "Roll No is Required");
	 * 
	 * }
	 * 
	 * if (First.equals("")) { request.setAttribute("t2", "First Name is Required");
	 * 
	 * } if (Last.equals("")) {
	 * 
	 * request.setAttribute("t3", "Last Name is Required"); }
	 * 
	 * if (Phy.equals("")) {
	 * 
	 * request.setAttribute("t4", "Marks is Required"); } if (Che.equals("")) {
	 * 
	 * request.setAttribute("t5", "Marks is Required");
	 * 
	 * } if (Math.equals("")) {
	 * 
	 * request.setAttribute("t6", "Marks is Required"); } RequestDispatcher rd =
	 * request.getRequestDispatcher("MarksheetView.jsp"); rd.forward(request,
	 * response); } else { MarksheetModel rm = new MarksheetModel(); List
	 * list=rm.search(); RequestDispatcher rh =
	 * request.getRequestDispatcher("LoginView.jsp");
	 * 
	 * request.setAttribute("j1", list);
	 * 
	 * rh.forward(request, response);
	 * 
	 * }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */

}
