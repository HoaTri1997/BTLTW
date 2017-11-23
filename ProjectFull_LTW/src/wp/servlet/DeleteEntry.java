package wp.servlet;
import wp.model.GuestBookEntry;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEntry")
public class DeleteEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteEntry() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<GuestBookEntry> entries = (List<GuestBookEntry>)getServletContext().getAttribute("entries");
		int index = Integer.parseInt(request.getParameter("index"));
		int KeyXoa=index;
		for(int i=0; i<entries.size();i++)
		{
			GuestBookEntry entry = entries.get(i); 
			if(entry.getKey()==KeyXoa)
			{
				entries.remove(i);
				break;
			}
		}
		response.sendRedirect("GuestBook");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
