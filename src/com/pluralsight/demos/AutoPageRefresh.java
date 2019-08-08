package com.pluralsight.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AutoPageRefresh
 */
@WebServlet("/AutoPageRefresh")
public class AutoPageRefresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoPageRefresh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setIntHeader("Refresh", 1);
		
		Date currentDate = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E dd-MM-YYYY 'at' hh:mm:ss a");
		String currentDateAndTime = ft.format(currentDate);
		
		PrintWriter out = response.getWriter();
		
		out.println("<!Doctype HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Auto Page Refresh using HTTP Response Header</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("Page Last Refreshed at : " + currentDateAndTime + "</p>" );
		
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
