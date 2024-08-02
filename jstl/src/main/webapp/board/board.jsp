<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!-- jquery CDN -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="boardWrap">
   <h2>게시판</h2>
   <div id="boardBox">
      <div id="boardListBox">
         <table id="boardList">
            <tr>
               <th class="num">번호</th>
               <th class="title">제목</th>
               <th class="writer">작성자</th>
               <th class="hit">조회수</th>
            </tr>
            
	<c:forEach var = "row" items = "${ list }">

            <tr>
               <td class="num">${ row.board_id }</td>
               <td class="title">
               <a href="/boardView.do?id=${ row.board_id }">${ row.title }</a></td>
               <td class="writer">${ row.writer }</td>
               <td class="hit">${ row.hit }</td>
            </tr>
     </c:forEach>
         </table>
         <!-- 페이징 -->
<style>
	#pageNumList{list-style:none; padding:30px 0; margin:0;
				display:flex;
				justify-content:center;
				}
		#pageNumList li{ width:50px; text-align:center;}
		#pageNumList .nowPage{ background : #ccc; font-weight:800;}
</style>
         <div id = "pageNumbers">
         	<ul id = "pageNumList">
         	<a href = "/board.do?${ pageNum - skip < 1 ? 1 : pageNum - skip }${param.word == null ? '' : '&word='}${param.word}"><i class="bi bi-arrow-bar-left"></i></a>
         	
         	<c:forEach var = "i" begin = "${startPage }" end = "${endPage }" step = "1">
         	
         		<c:if test = "${ pageNum == i }">
         			<li class = "nowPage">${ i }</li>
         		</c:if>
         		<c:if test = "${ pageNum != i }">
         			<li> <a href = "/board.do?${ i }${param.word == null ? '' : '&word='}${param.word}">${i }</a></li>
         		</c:if>
         		
         	</c:forEach>
         	<a href = "/board.do?${ pageNum + skip > pageTotalNum ? pageTotalNum : pageNum + skip }${param.word == null ? '' : '&word='}${param.word}"><i class="bi bi-arrow-bar-right"></i></a>
         	</ul>
         </div>
      </div>
      <div id="boardSearchBox">
         <form method="get" action="/board.do">
            <div class="boardSearch">
               <input type="search" name="word" id="word">
               <button>검색</button>
            </div>
         </form>
      </div>
      <div id="boardWriteBox">
         <a id="wrBt">글작성</a>
      </div>
   </div>
</div>
<script>
   
   
   $("#wrBt").on("click",function(){ 
      if( '${ sessionScope.user }' != '' ){
         location.href="/write.do"; 
      }else{
         var isOk = confirm("글 작성 권한이 없습니다. 로그인 하시겠습니까?");
         if(isOk){		// 로그인 하겠다고 확인 버튼클릭 하였으니 로그인 페이지 이동
        	 location.href="/signIn.do";
         }
      }
   });
   
</script>
</body>
</html>