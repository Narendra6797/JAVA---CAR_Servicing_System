<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
a {
	text-decoration: none;
}

h2 {
	padding-top: 30px;
}
h3{	
	padding-top: 30px;
	text-align: center;
}

form {
	width: 450px;
}
</style>
<meta charset="UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" href="index.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
<h3 style="color:red; font-weight:bold" >⚠In-valid User-name⚠</h3>
	<h2 style="color:white; font-weight:bold">Login</h2>
	<form action="/cars/loginCusControl">
		<div class="row mb-3">
			<label for="un" class="col-sm-2 col-form-label">UserName:</label>
			<div class="col-sm-10">
				<input type="text" name="username" class="form-control"
					 id="un"  required>
			</div>
		</div>
		<div class="row mb-3">
			<label for="ip" class="col-sm-2 col-form-label">Password:</label>
			<div class="col-sm-10">
				<input type="password" name="password" class="form-control"
					id="ip" required >
			</div>
		</div>
		<button type="submit" class="btn btn-outline-primary" >Login</button>

		<br> <a class="nav-pills bg- justify-content" aria-current="page"
			href="registercustomer.html">Register</a>
	</form>
</body>
</html>