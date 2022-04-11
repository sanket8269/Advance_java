package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitorCount")
public class VisitorCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		Integer count = (Integer) ctx.getAttribute("visitCount");

		if (count == null) {
			count = 1;
		} else {
			count++;
		}
		ctx.setAttribute("visitCount", count);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Visitor Count:" + count + "</h1>");
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
