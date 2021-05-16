<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored= "false" %>


<!DOCTYPE html>
<html>


    
<head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

	<title>E-SHOP</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
    <style type="text/css">
    	/* Coded with love by Mutiullah Samim */
		body,
		html {
			margin: 0;
			padding: 0;
			height: 100%;
			background: #60a3bc !important;
		}
		.user_card {
			height: 400px;
			width: 350px;
			margin-top: auto;
			margin-bottom: auto;
			background: #f39c12;
			position: relative;
			display: flex;
			justify-content: center;
			flex-direction: column;
			padding: 10px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			-webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			-moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			border-radius: 5px;

		}
		.brand_logo_container {
			position: absolute;
			height: 170px;
			width: 170px;
			top: -75px;
			border-radius: 50%;
			background: #60a3bc;
			padding: 10px;
			text-align: center;
		}
		.brand_logo {
			height: 150px;
			width: 150px;
			border-radius: 50%;
			border: 2px solid white;
		}
		.form_container {
			margin-top: 100px;
		}
		.login_btn {
			width: 100%;
			background: #c0392b !important;
			color: white !important;
		}
		.login_btn:focus {
			box-shadow: none !important;
			outline: 0px !important;
		}
		.login_container {
			padding: 0 2rem;
		}
		.input-group-text {
			background: #c0392b !important;
			color: white !important;
			border: 0 !important;
			border-radius: 0.25rem 0 0 0.25rem !important;
		}
		.input_user,
		.input_pass:focus {
			box-shadow: none !important;
			outline: 0px !important;
		}
		.custom-checkbox .custom-control-input:checked~.custom-control-label::before {
			background-color: #c0392b !important;
		}
    </style>
</head>

<body>
             

	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img src="data:image/png;base64,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" class="brand_logo" alt="Logo">
					</div>
				</div>
				
				<div class="d-flex justify-content-center form_container">
				
					<form action="login" method="post">
						<div class="input-group mb-3">
						
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
								
							</div>
							<input type="text" name="username" class="form-control input_user" value="" placeholder="username" required>
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password" class="form-control input_pass" value="" placeholder="password" required>
						</div>
						
							<div class="d-flex justify-content-center mt-3 login_container">
				 	<button type="submit" name="submit" class="btn login_btn">Login</button>
				   </div>
				   
					</form>
				</div>
		
				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Don't have an account? <a href="/reg" class="ml-2">Sign Up</a>
						
					</div>
					<div class="d-flex justify-content-center">
					${SPRING_SECURITY_LAST_EXCEPTION.message}
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
