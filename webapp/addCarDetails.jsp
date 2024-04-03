<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
h2 {
	padding-top: 40px;
}

div {
	padding-left: 5px;
	padding-top: 5px;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="index.css">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: white; font-weight: bolder">Add Your Car
		Details</h2>
	<form action="/cars/AddcarDetails">
		<div class="row mb-3">
			<label for="cartype" class="col-sm-2 col-form-label">Car Type</label> <br>
			<div class="col-sm-9">
				<input type="text" id="cartype" name="cartype" class="form-control"
					required>
			</div>
		</div>
		<div class="row mb-3">
			<label for="2" class="col-sm-2 col-form-label">Car Model</label> <br>
			<div class="col-sm-9">
				<input type="text" id="2" name="carmodel" class="form-control"
					required>
			</div>
		</div>
		<div class="row mb-3">
			<label for="3" class="col-sm-2 col-form-label">Car<br>Registered<br>Number</label> <br>
			<div class="col-sm-9">
				<input type="text" class="form-control" name="carregno" id="3"
					required>
			</div>
		</div>
		<button type="submit" value="addit" class="btn btn-primary col-6">ADD</button>
	</form>
</body>
</html>