<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="junil">준일로 전달</a>
	<div>
		<label>아이디</label>
		<label><%=session.getAttribute("id") %></label>
		<label>비밀번호</label>
		<label><%=session.getAttribute("password") %></label>
		<label>이름</label>
		<label><%=session.getAttribute("myName") %></label>
		<label>flag</label>
		<label><%=session.getAttribute("flag") %></label>
		<label><%=session.getAttribute("test") %></label>
	</div>
</body>
</html>