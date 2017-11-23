package wp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/RequestCounter", loadOnStartup = 1)
public class RequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public RequestCounter() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		int counter = 0; // khai bao bien counter co gia tri ban dau bang 0.
		getServletContext().setAttribute("counter", counter); // Luu bien counter vao Application scope.
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		
		int counter = (int)servletContext.getAttribute("counter"); //Lay bien counter tu trong Application Scope.
		counter++; // Tang gia tri bien counter len 1 don vi RequestCounter servlet duoc thuc thi.
		servletContext.setAttribute("counter", counter); // Luu bien counter vao Application scope.
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");   // Set contentype khi xuat ra mot file html.
		
		out.println("<html><head><title>Request Counter</title><head><body>");
		out.println("<h2>The counter is incremented.</h2>");
		out.println("</body></html>");
	}

}
