<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<title>NoteTaker</title>
<%@ include file="Helper/All_css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="Helper/Navbar.jsp"%>
		<h2 mt-3 style="text-decoration: underline;">Please Fill Your Note Here
			!!!</h2>
		
		<!--This is Add Form  -->
		<form action="SaveNoteServlet" method="post">
			<div class="form-group">
				<label for="title">Title : </label> <input type="text"
					class="form-control" id="title" placeholder="Enter Title"
					name="title" required />
			</div>
			<div class="form-group">
				<label for="content">Content Details : </label>
				<textarea type="text" class="form-control" id="content"
					placeholder="Enter Content Details here" name="content" required
					style="height: 260px"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>
		</form>
	</div>




</body>
</html>