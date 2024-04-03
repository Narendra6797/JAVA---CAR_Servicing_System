<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.nn.model.Car"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h2 {
	padding-top: 40px;
	background-color: navy;
	border: 2px solid white;
	border-radius: 10px;
}

div {
	padding-left: 5px;
	padding-top: 5px;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="index.css">
<meta charset="UTF-8">
<title>View Registered Service Request</title>
</head>
<body>
	<%
	ArrayList<Car> carDetails = (ArrayList<Car>) session.getAttribute("sCarDetails");
	%>

	<h1 style="color: white; font-weight: bolder">Registered Users
		Service Request</h1>
	<div class="row mb-3">
		<h2 style="color: white; font-weight: 50px;">
			<%
			for (Car x : carDetails) {

				out.println("⭐USERNAME:=>" + x.getUsername()+" || "+ "Car-Num:"+ x.getCarregno()
				+" || "+ "Service-Type:"+ x.getServicetype() +" || "+ "Status:"+ x.getServicestatus() + "///////"  );
			}
			%>
		</h2>
	</div>


</body>
</html>