<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
h1 {
	padding-bottom: 10px;
	padding-top: 50px;
}

div {
	padding: 10px;
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
	<h1 style="color: white; font-weight:bolder;">Enter Type
		of Service Required</h1>
	<form action="/cars/ServiceReqControler">
		<div class="col-sm-12">
			<input type="text" id="cartype" name="servicetype" class="form-control"
				required>
		</div>
		<div class="d-grid gap-2 d-md-flex justify-content-md-end">
			<button class="btn btn-primary me-md-2" type="submit">Add</button>
		</div>
	</form>
</body>
</html>