<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 내장객체3.jsp --%>

<pre>
<%
	out.print("출력");
	out.newLine();		// 줄바꿈 메서드
	out.println("정수, 실수, 문자, 문자열 출력가능");
	
	// page == this 
			
	String name = "이순신";
	
	pageContext.getRequest().getParameter(name);		// 대부분의 내장객체에 접근 가능
	pageContext.setAttribute("age", 25);				// Attribute - 속성
	
	// pageContext.include("requestTest2.jsp");	// <%@ include file = "경로"
	// pageContext.forward("내장객체1.jsp");	// 
	
	
%>

<jsp:include  page = "Test3.jsp" />
<jsp:forward page = "requestTest2.jsp" />


</pre>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%=pageContext.getAttribute("age") %>
</body>
</html>