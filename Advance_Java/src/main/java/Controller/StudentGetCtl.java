package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.StudentBean;
import Model.StudentModel;

@WebServlet(urlPatterns = "/StdCtl")
public class StudentGetCtl extends HttpServlet {
	public static final String OP_GO = "Go";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setRollNo(request.getParameter("rollnumber"));
		String op = request.getParameter("operation");
		StudentModel model = new StudentModel();
		if(OP_GO.equalsIgnoreCase(op)) {
		try {

			List<StudentBean> list = model.get(bean);

			RequestDispatcher rd = request.getRequestDispatcher("StudentGetView.jsp");
			request.setAttribute("DD", list);
			rd.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}else {
	   
	    RequestDispatcher rd = request.getRequestDispatcher("GetRollNoView.jsp");
	    request.setAttribute("msg", "Roll Number does not exist");
		rd.forward(request, response);
	}
	}

	}

