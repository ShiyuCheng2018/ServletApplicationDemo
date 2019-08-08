package comm.pluralsight.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		out.println("<h3>Reading QueryString data using 'String getParameter(String name)' method :"
				+ "</h3>");
		out.println("<div>");
		out.println("<p>First Name : " + firstName + "</p>");
		out.println("<p>Last Name  " + lastName + "</p>");
		out.println("</div>");
		
		out.println("<h3>Reading QueryString data using 'Enumeration getParameterNames()'method</h3>");
		Enumeration<String> paraNames = request.getParameterNames();
		out.println("<div>");
		while(paraNames.hasMoreElements()) {
			String paraName = paraNames.nextElement();
			String paraValue = request.getParameter(paraName);
			out.println("<p>" + paraName + " : " + paraValue + "</p>");
			
		}
		out.println("</div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
