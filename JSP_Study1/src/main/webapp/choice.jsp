<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="Lunch" class="Test.Lunch" />
<jsp:setProperty name = "Lunch" property = "*"/>

<jsp:getProperty name = "Lunch" property = "menu" />

<%
	out.println( Lunch.getPrice());
%>
<%=Lunch.getRestaurant() %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>