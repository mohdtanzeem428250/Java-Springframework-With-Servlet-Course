<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="RegistrationForm" method="post">
		Name : <input type="text" name="name2"/><br><br>
		Email : <input type="text" name="email2"/><br><br>
		Password : <input type="password" name="password2"/><br><br>
		Gender : Male <input type="radio" name="gender2" value="Male"/>Female <input type="radio" name="gender2" value="Female"/><br><br>
		City : <select name="city2">
					<option>Select City</option>
					<option>Bareilly</option>
					<option>Pilibhit</option>
					<option>Rampur</option>
					<option>Delhi</option>
					<option>Mumabi</option>
					<option>Noida</option>
					<option>Banglore</option>
			   </select><br><br>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>