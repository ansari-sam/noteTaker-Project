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

		<div class="card">
			<img class="img-fluid mx-auto my-4" style="max-width: 400px"
				src="notepad.png" alt="">
			<h2 class="text-primary text-uppercase text-center">Start Taking
				Your Notes</h2>
			<div class="container mx-auto text-center mb-2 ">
				<button class="btn-outline-success">
					<a href="Add_Note.jsp">Start Here</a>
				</button>
			</div>
		</div>
	</div>



</body>
</html>