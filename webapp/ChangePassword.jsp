<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
h2 {
	padding-top: 50px;
}
</style>
<script type="text/javascript">
	var check = function() {
		if (document.getElementById('password').value == document
				.getElementById('confirm_password').value) {
			document.getElementById('message').style.color = 'green';
			document.getElementById('message').innerHTML = 'Password Matching';
		} else {
			document.getElementById('message').style.color = 'red';
			document.getElementById('message').innerHTML = 'Password Not Matching';
		}
	}
</script>
<title>Change Password</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="index.css">
</head>
<body>
	<h2 style="color: white; font-weight: bolder">Change Password</h2>
	<form action="/cars/ChangePasswordControl">
		<!-- 		<div class="row mb-3">
			<label class="col-sm-2 col-form-label">Enter Old Password</label>
			<div class="col-sm-10">
				<input type="password" name="oldpassword" class="form-control"
					required>
			</div>
		</div> -->
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">Enter
				New Password</label>
			<div class="col-sm-10">
				<input type="password" name="newpassword" class="form-control"
					id="password" onkeyup='check();' required>
			</div>
		</div>
		<div class="row mb-3">
			<label class="col-sm-2 col-form-label">Confirm new Password</label>
			<div class="col-sm-10">
				<input type="password" name="newconfirmpassword"
					class="form-control" id="confirm_password" onkeyup='check();'
					required> <br> <div><span id='message'></span></div> 
			</div>
		</div>
		<button type="submit" value="changePassWord"
			class="btn btn-outline-primary">Change Password</button>
	</form>
</body>
</html>