<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<h2>���� �α���</h2>
		<form action="ProMenu.jsp" method="post">  <!-- Login ������ ProLogin.jsp�� ���� -->
			I   D : <input type="text"  name="id"><br>
			P  W : <input type="password"  name="pwd"><br>
			
			<input type="radio" id="Pro_button" name="job">
			<label for="Pro_button">Professor</label>
			
			<input type="radio" id="Student_button" name="job" >
			<label for="Student_button">Student</label><br>
			
			<a href ="ProMenu.jsp">
			<input type="submit"  value="Login">
			</a>
		</form>
</body>
</html>