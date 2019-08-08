package com.pluralsight.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LargeServletPage
 */
@WebServlet("/LargeServletPage")
public class LargeServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LargeServletPage() {
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
		String dummyLine = "You’ve heard tons about coding and know that it has to do with computers and they process the information we see. However, you may not have much more than this vague understanding of the concept. Don’t feel bad. Many people don’t really understand it, though we all depend on the fundamentals of code each and every day. It’s such an important aspect of the technological landscape that President Obama has unveiled a new initiative called “Computer Science for All” that has been backed by and invested in by big names, including the Turner Broadcasting Network. The President’s movement is one that mirrors that of our nationl’s schools that have been emphasizing the value of technology, computer science, engineering and other STEM related topics. Read on to discover what computer code is and why it is of such importance in today’s society.";
		
		out.println("<!Doctype HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Demo: Request Headers</title>");
		out.println("</head>");
		out.println("<body>");
		
		
		
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
