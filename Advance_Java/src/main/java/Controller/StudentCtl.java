package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.StudentBean;
import Model.MarksheetModel;
import Model.RegistrationModel;
import Model.StudentModel;

@WebServlet(urlPatterns = "/S")
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentModel model = new StudentModel();
		try {
			List list = model.testsearch();

			RequestDispatcher rd = request.getRequestDispatcher("StudentViewData.jsp");
			request.setAttribute("w1", list);
			rd.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}
	
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * StudentBean bean = new StudentBean(); String Rollno = (String)
		 * request.getAttribute("roll_no"); String FNAME = (String)
		 * request.getAttribute("first_name"); String LNAME = (String)
		 * request.getAttribute("last_name"); String SESSION = (String)
		 * request.getAttribute("session");
		 * 
		 * bean.setRollNo(Rollno); bean.setFirstName(FNAME); bean.setLastName(LNAME);
		 * bean.setSession(SESSION);
		 * 
		 * try { if (Rollno.equals("") && FNAME.equals("") && LNAME.equals("") &&
		 * SESSION.equals("")) { RequestDispatcher rd =
		 * request.getRequestDispatcher("StudentView.jsp"); request.setAttribute("a1",
		 * "Roll No Is Required"); request.setAttribute("a2", "First Name Is Required");
		 * request.setAttribute("a3", "Last Name Is Required");
		 * request.setAttribute("a4", "Session Is Required"); rd.forward(request,
		 * response);
		 * 
		 * } else if (Rollno.equals("") || FNAME.equals("") || LNAME.equals("") ||
		 * SESSION.equals("")) {
		 * 
		 * if (Rollno.equals("")) { request.setAttribute("a1", "Roll No Is Required"); }
		 * if (FNAME.equals("")) { request.setAttribute("a2", "First Name Is Required");
		 * } if (LNAME.equals("")) { request.setAttribute("a3",
		 * "Last Name Is Required"); } if (SESSION.equals("")) {
		 * request.setAttribute("a4", "Session Is Required");
		 * 
		 * } RequestDispatcher rd = request.getRequestDispatcher("StudentView.jsp");
		 * rd.forward(request, response);
		 * 
		 * } else {
		 * 
		 * StudentModel rm = new StudentModel(); HttpSession session =
		 * request.getSession(); session.setAttribute("email", bean);
		 * 
		 * rm.testadd(bean); RequestDispatcher rh =
		 * request.getRequestDispatcher("StudentView.jsp");
		 * 
		 * request.setAttribute("j1", "Added Successfully");
		 * 
		 * rh.forward(request, response); } } catch (
		 * 
		 * Exception e) { e.printStackTrace();
		 * 
		 * }
		 */	}
}
		