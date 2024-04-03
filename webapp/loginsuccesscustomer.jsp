<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.bg-custom {
	background-color: blue;
}

#dd {
	width: 450px;
	border: 5px solid white;
	border-radius: 10px;
}

#d {
	padding: 5px;
}

li {
	padding: 5px;
}

a {
	font-size: 50px;
}
</style>

<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="index.css">

<title>Login</title>
</head>
<body>

	<ul class="nav nav-pills bg-custom justify-content-end">
		<li class="nav-item "><a style="color: white;"
			class="nav-link bg-danger active" aria-current="page"
			href="index.html">Logout</a></li>
	</ul>
	<br>


	<%
	String name = (String) session.getAttribute("sname");
	%>
	<div class="toast align-items-center text-bg-danger border-0 fade show"
		role="alert" aria-live="assertive" aria-atomic="true">
		<div class="d-flex">
			<div class="toast-header">
				    <strong class="me-auto"><%
				out.println("Dear  " + name + "  you have successfully Logged-in");
				%></strong>
				
			</div>
			<button type="button" class="btn-close btn-close-white me-2 m-auto"
				data-bs-dismiss="toast" aria-label="Close"></button>
		</div>
	</div>

	<h1 style="color: white; font-weight: bolder">Relationship
		Overview</h1>

	<div id=dd class="container bg-custom text-center">
		<div id=d class="col">
			<a style="color: white;" href="addCarDetails.jsp">Add Car Details</a>
		</div>
		<div id=d class="col">
			<a style="color: white;" href="RequestForService.jsp">Request For
				Service</a>
		</div>


		<div id=d class="col">
			<a style="color: white;" href="ServiceStatusControl">Check
				Service Status</a>
		</div>
		<div id=d class="col">
			<a style="color: white;" href="ChangePassword.jsp">Change
				Password</a>

		</div>
		<div id=d class="col">
			<a style="color: white;" href="EditCarDetails.jsp">Edit Car
				Details</a>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>