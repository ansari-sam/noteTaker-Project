<%@ page import="org.hibernate.Session"%>
<%@ page import="org.hibernate.Query"%>
<%@ page import="com.entity.*"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
<%@ include file="Helper/All_css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="Helper/Navbar.jsp"%>

		<h2>All Notes :</h2>

		<div class="row">

			<div class="col-12">
				<%
					Session s = FactoryProvider.getFactory().openSession();
					Query q = s.createQuery("from Note");
					List<Note> list = q.list();

					for (Note note : list) {
				%>
				<div class="card my-2">
					<img class="img-fluid mx-auto my-2" style="max-width: 60px" src="notepad.png" alt="">
					<div class="card-body">
						<h5 class="card-title"><%=note.getTitle() %></h5>
						<p class="card-text"><%=note.getContent() %></p>
						<p class="card-text mt-3 text-primary">Last Update : <%=note.getAddedDate() %></p>
						<div class="container" style="text-align:center;">
						<a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>
						<a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a></div>
					</div>
				</div>

				<%
					}

					s.close();
				%>




			</div>

		</div>

	</div>

</body>
</html>