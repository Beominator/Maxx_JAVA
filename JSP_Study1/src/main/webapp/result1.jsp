<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- result1.jsp 

	이름과 국어, 수학, 과학 성적을 받아서
	이름 출력하고
	평균 90점 이상이면 참 잘했어요
	80점 이상이면 잘했어요
	70점 이상이면 노력해라
	나머지는 이게 점수야! 출력

--%>
<%	
	String name = request.getParameter("std");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	int sci = Integer.parseInt(request.getParameter("sci"));
	
	int total = kor+mat+sci;
	int avg = total/3;
	
	String print = "이름 : "+name+ "<br>";
	
	
	if(avg>=90)
		print+="참 잘했어요";
	else if(avg>=80)
		print+="잘했어요";
	else if (avg>=70)
		print+="노력해요";
				
	else
		print+="이게 점수야!";
	
		
	
%>
<%= print %>


<%@ include file="requestTest2.jsp"%>