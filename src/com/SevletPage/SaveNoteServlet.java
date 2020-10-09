package com.SevletPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;

import com.entity.FactoryProvider;
import com.entity.Note;

@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SaveNoteServlet() {
        super();
       
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			
			//create obj of Note
			Note notes=new Note(title,content,new Date());
			System.out.println(notes.getTitle()+ ":"+ notes.getContent());
			//create session
			Session s=FactoryProvider.getFactory().openSession();
			Transaction Tx=s.beginTransaction();
			s.save(notes);
			Tx.commit();
			s.close();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1 style='text-align:center'>Note is added Successfully</h1>");
			out.println("<h1 style='text-align:center'><a href='all_notes.jsp'>View all Notes</a></h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
