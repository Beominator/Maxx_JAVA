<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	
	out.println( myId );
	
	if(myId.equals("woqja87") && myPw.equals("1234")){
%>
		<script>
			alert("로그인 성공");
			location.href="Login.jsp";
		</script>
<%		
	}
%>

<%=myPw %>


<%-- jsp 주석 --%>



<!-- logincheck.jsp -->