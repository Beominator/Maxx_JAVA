<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- Test3.jsp --%>

<%!

	class Worker{
		String name;
		String job;
		Worker(String name, String job){
			this.name = name;
			this.job = job;
		}
		
		@Override
		public String toString(){
			return name+", "+job;
		}
}
		
%>

<%
	Worker[] work = new Worker[]{
		new Worker("이순신", "군인"), new Worker("김춘춘", "정치인"),
		new Worker("최무선", "연구원"), new Worker("정약용", "발명가")
};
		
%>    


    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 명단 </h1>
	<%
		for(int i = 0; i<work.length; i++){
	%>
			<div><%=work[i] %></div>
	<%
		}
	%>
	
<%-- 반복문을 사용하여 1부터 10까지 출력하세요. --%>

	<% 
		for(int i=1; i<=10; i++){
	%>
			<div><%=i %></div>
	<% 
		}
	%>
</body>
</html>