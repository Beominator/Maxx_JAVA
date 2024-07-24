<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- requestTest2.jsp

	학생이름과 국어, 수학, 과학 성적 입력하여 제출버튼을 클릭하기
	전송 페이지 : result1.jsp
	전송방식 : get
	
 --%>
 
<form method="get" action = "result1.jsp">
	이름 : <input type = "text" name = "std"> <br>
	국어 : <input type = "text" name = "kor"> <br>
	수학 : <input type = "text" name = "mat"> <br>
	과학 : <input type = "text" name = "sci"> <br>
	
</form>

<button> 제출 </button>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>