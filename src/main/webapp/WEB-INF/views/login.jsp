<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>

<head>
	<link href="${ctx}/resources/css/login.css" rel="stylesheet">
	<script src="https://kit.fontawesome.com/215ee1d5fa.js" crossorigin="anonymous"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
	<div class="bg-img">
		<div class="content">
		<h2>Login</h2>
			<form action="login.project" name="register" method="post">
			<fieldset>
				<div class="field">
					<span class="fa fa-user"></span>
					 <input type="text" name="id" required placeholder="ID">
				</div>
				<div class="field space">
					<span class="fa fa-lock"></span>
					<input type="password" name="pwd" class="password" required placeholder="Password">
					 <span class="show">show</span>
				</div>
			</fieldset>
				<div class="pass">
					<a href="${ctx }/main" class="nav-link">메인으로</a>
				</div>
				<div class="field">
					 <input type="submit" value="LOGIN">
					 <input type="button" value="JOIN IN" onclick="location='${ctx }/join'">
				</div>

			<script>
			const pass_field=document.querySelector('.password');
			const show_btn=document.querySelector('.show');
			show_btn.addEventListener('click',function(){
				if(pass_field.type === "password"){
					pass_field.type = "text";
					show_btn.style.color = "#3498db";
					show_btn.textContent ="HIDE";
				}
				else{
					pass_field.type = "password";
					show_btn.style.color = "#222";
					show_btn.textContent ="SHOW";
				}
			});
			</script>	

</body>
</html>