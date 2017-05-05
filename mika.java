package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mika
 */
@WebServlet("/mika")
public class mika extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mika() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//自己紹介
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>mikaの自己紹介</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>mikaのプロフィール</h1>");
		out.println("<p>Java猛勉強中のmikaです。<br>プログラムの勉強を始めて一年、Javaは半年になります。<br>Javaの基本、SQL、HTMLを習得してます</p>");
		out.println("</body>");
		out.println("<html>");
		
	}

}
