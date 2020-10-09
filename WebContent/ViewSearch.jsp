<%@ page import="com.entity.*"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Search : Note Taker</title>
<%@ include file="Helper/All_css_js.jsp"%>
</head>
<body>
<div class="container">
<%@ include file="Helper/Navbar.jsp"%>
<h2>Searching Result !!!</h2>

<div class="row">

			<div class="col-12">
				
				<div class="card my-2">
					<div class="card-body">
						<h5 class="card-title"><%=request.getAttribute("title") %></h5>
						<p class="card-text"><%=request.getAttribute("content") %></p>
						<div class="container" style="text-align:center;">
						<a href="index.jsp" class="btn btn-danger">Back to Home</a>
						</div>
					</div>
				</div>


			</div>

		</div>
</div>

</body>
</html>