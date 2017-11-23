package wp.servlet;
import wp.model.GuestBookEntry;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditEntry")
public class EditEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditEntry() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<GuestBookEntry> entries = (List<GuestBookEntry>)getServletContext().getAttribute("entries");
		int KeySua = Integer.parseInt(request.getParameter("index"));
		GuestBookEntry entry = null;
		int flag=0;
		for(int i=0; i<entries.size();i++)
		{
			entry = entries.get(i); 
			if(entry.getKey()==KeySua)
			{
				flag = 1;
				break;
			}
		}		
		if(flag == 1)
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");   // Set contentype khi xuat ra mot file html.
			
			out.println("<html><head><title>Edit Comment</title><head><body>");
			out.println("<form action='EditEntry' method='Post'>");
			out.println("Name:<input type='text' name='name' value='"+ entry.getName() +"'/><br/>");
			out.println("Message:<textarea name='message' rows='5' cols='60'>"+ entry.getMessage() +"</textarea>");
			out.println("<input type='hidden' name='keysua' value='"+entry.getKey()+"'>");
			out.println("<input type='submit' name='editentry' value='Edit'/>");
			
			out.println("</form>");
			out.println("</body></html>");
		}
		else
		{
			response.sendRedirect("GuestBook");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<GuestBookEntry> entries = (List<GuestBookEntry>)getServletContext().getAttribute("entries");
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		int keysua = Integer.parseInt(request.getParameter("keysua"));
		GuestBookEntry entry = null;
		int i=0;
		for( i=0; i<entries.size();i++)
		{
			entry = entries.get(i); 
			if(entry.getKey()==keysua)
			{
				break;
			}
		}		
		entries.get(i).setName(name);
		entries.get(i).setMessage(message);
		entries.get(i).setKey(keysua);		
		response.sendRedirect("GuestBook"); 
	}

}
