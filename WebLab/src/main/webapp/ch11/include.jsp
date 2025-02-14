<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
	include file
	<br/>
	name : <%= request.getAttribute("name") %><br/>
	data : <%= request.getParameter("data") %>
</center>

</body>
</html>