<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.bg-custom {
	background-color: navy;
}

#dd {
	width: 450px;
	border: 5px solid white;
	border-radius: 10px;
}

#d {
	padding: 5px;
}

li:hover {
	color: red;
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
		<li class="nav-item"><a style="color: white;"
			class="nav-link bg-custom active" aria-current="page"
			href="index.html">Logout</a></li> 
	</ul>
	<br>

	<br>

	<h1 style="color: white; font-weight: bolder">Relationship
		Overview</h1>

	<div>
		<div id=dd class="container bg-custom text-center ">
			<div id=d class="col">
				<a style="color: white;" href="viewRegisteredCustomberControler">View Registered
					Customers</a>
			</div>
			<div id=d class="col ">
				<a style="color: white;" href="ViewServiceRequestsControl">View Service Request</a>
			</div>
			<div id=d class="col">
				<a style="color: white;" href="/cars/updateServiceStatus.jsp">Update Service Status</a>
			</div>
			<div id=d class="col">
				<a style="color: white;" href="/cars/editCustomer.jsp">Edit Customer</a>

			</div>
			<div id=d class="col">
				<a style="color: white;" href="/cars/DeleteCustomer.jsp">Delete Customer</a>
			</div>
		</div>
	</div>


</body>
</html>