package com.SevletPage;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.FactoryProvider;
import com.entity.Note;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
        
    }
	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int noteId=Integer.parseInt(request.getParameter("note_id").trim());
			
			Session s=FactoryProvider.getFactory().openSession();
			Transaction Tx=s.beginTransaction();
			Note note=(Note)s.get(Note.class, noteId);
			s.delete(note);
			Tx.commit();
			s.close();
			response.sendRedirect("all_notes.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
