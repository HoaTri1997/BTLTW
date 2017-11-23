package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.HourlyEmployee;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get input
		int employeeID = Integer.parseInt(request.getParameter("employeeID"));
		String firstName = request.getParameter("firstName");
		String lastNaem = request.getParameter("lastName");
		double hourlyRate = Double.parseDouble(request.getParameter("hourlyRate"));
		
		//instantiate hourly employee object
		HourlyEmployee employee = new HourlyEmployee(employeeID, firstName, lastNaem, hourlyRate);
		
		// create a Map of tax rates
		Map<String, String> taxRates = new HashMap<String, String>();
		taxRates.put("Trí", "8");
		taxRates.put("Triều", "8");
		taxRates.put("Phúc", "8");
		
		// set session attributes
		HttpSession session = request.getSession();
		session.setAttribute("employee", employee);
		session.setAttribute("taxRates", taxRates);
		
		// set up destination
		String url = "/ELDemo.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
