<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner"%>

<%-- Test2.jsp --%>

<%--
	JSP 스크립트
		JSP 스크립트릿 : <%	%>
					자바 로직 코드를 작성 (일반적인 코드작성) (메서드, 클래스 정의 불가)
		선언문 : <%!	!%>
				자바 변수나 메서드, 클래스 정의할 때 (계산 및 제어문 사용 불가, 메서드 호출 안됨)
		표현식 : <%=	=%>
				결과값 출력



 --%>
 
 <%!
 	int age = 20;
 	String name = "이순신";
 	
 	int sum(int a, int b){
 		return a+b;
 	}
 	class mem{
 		String userName;
 	}
 	
 	Scanner sc = new Scanner(System.in);
 	
 %>
 
 <%
 	int num = sc.nextInt();
 
 	sum(10,20);
 	if(age > 15){
 	
 	}
 	String job = "군인";
 	
 	%>
 <%=100 %>
 <%="<br> 이순신" %>
 <%=10>5 ? "크다" : "작다" %>
 
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>