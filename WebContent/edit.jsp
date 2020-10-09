<%@ page import="org.hibernate.*,com.entity.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Note: NoteTaker</title>
<%@ include file="Helper/All_css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="Helper/Navbar.jsp"%>
		<h2>Update Note:</h2>

		<%
			int noteId = Integer.parseInt(request.getParameter("note_id").trim());
			Session s = FactoryProvider.getFactory().openSession();
			Note note = (Note) s.get(Note.class, noteId);
			
			s.close();
		%>

		<form action="UpdateServlet" method="post">
		<input value="<%=note.getId()%>" type="hidden" name="noteId"/>
			<div class="form-group">
				<label for="title">Title : </label> <input type="text"
					class="form-control" id="title" placeholder="Enter Title"
					name="title" required value="<%=note.getTitle()%>"/>
			</div>
			<div class="form-group">
				<label for="content">Content Details : </label>
				<textarea type="text" class="form-control" id="content"
					placeholder="Enter Content Details here" name="content" required
					style="height: 260px"><%=note.getContent() %></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save Your
					Note</button>
			</div>
		</form>
	</div>

</body>
</html>