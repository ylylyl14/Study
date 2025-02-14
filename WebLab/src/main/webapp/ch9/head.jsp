<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session ="false" %>
<%!
	String name;
	String email;
%>
<%!
	public int getLength(){
	int len = email.length();
	return len;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>script tag test</h1>
	<%@ include file = "head.jsp" %>
	<br/>
	<%
		name = request.getParameter("name");
		email = request.getParameter("email");
	%>
	name :<%=name %><br/>
	email :<%=email %><br/>
	email length : <%=getLength() %>
</body>
</html>