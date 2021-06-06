<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<h2>학생 로그인</h2>
		<form action="StudentLogin.jsp" method="post">  <!-- Login 누르면 Login.jsp로 연결 -->
			I   D : <input type="text"  name="id"><br>
			P  W : <input type="password"  name="pwd"><br>
			
			<input type="radio" id="Pro_button" name="job">
			<label for="Pro_button">Professor</label>
			
			<input type="radio" id="Student_button" name="job" >
			<label for="Student_button">Student</label><br>
			
			<a href ="StudentMenu.jsp">
			<input type="submit"  value="Login">
			</a>
		</form>
</body>
</html>