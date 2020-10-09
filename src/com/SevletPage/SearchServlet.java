package com.SevletPage;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.FactoryProvider;
import com.entity.Note;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String search=request.getParameter("search");
			String title=null;
			String content=null;
			Session s=FactoryProvider.getFactory().openSession();
			Transaction Tx=s.beginTransaction();
			
			Query q=s.createQuery("from Note where Title like '%"+search+"%'");
			
			List<Note> list = q.list();

			for (Note note : list) {
				title=note.getTitle();
				content=note.getContent();
				request.setAttribute("title",title);
				request.setAttribute("content",content);
				request.getRequestDispatcher("ViewSearch.jsp").forward(request, response);
			}
			
			 
			
			Tx.commit();
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
