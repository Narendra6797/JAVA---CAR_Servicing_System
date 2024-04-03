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

form {
	width: 450px;
}
</style>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" href="index.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<h2 style="color: white; font-weight: bold ; ">Admin Login</h2>
	<form action="/cars/AdminControl">
		<div class="row mb-3">
			<label for="adminname" class="col-sm-2 col-form-label">Admin-Name</label>
			<div class="col-sm-8">
				<input type="text" name="adminname" class="form-control"
					id="adminname" required>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputPassword3" class="col-sm-2 col-form-label">Pass-Code</label>
			<div class="col-sm-8">
				<input type="password" name="password" class="form-control"
					id="inputPassword3" required>
			</div>
		</div>
		<button type="submit" class="btn btn-outline-primary" >Login</button>

		<br> 
		<a style="font-weight:normal; color:silver; " class="nav-pills disabled bg- justify-content" aria-current="page"
			href="">Request for New-Admin</a>
	</form>
</body>
</html>