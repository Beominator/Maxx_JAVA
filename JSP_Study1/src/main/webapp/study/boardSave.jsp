
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*"%>

<%-- boardSave.jsp --%>
 <% request.setCharacterEncoding("UTF-8"); %>
 <jsp:useBean id="newBoard" class="study.Board" />
 <jsp:setProperty property="*" name="newBoard"/>
<%
	// 작성자 가져오기
	String writer = ((Member)session.getAttribute("user")).getUserId();

	// 이미지 업로드해서 저장될 실제 위치
	String path="사용자\\maxx_beominator\\다운로드\\무제폴더\\Maxx_JAVA\\JSP_Study1\\src\\main\\webapp\\study\\image";
	// 업로드할 이미지 최대크기
	int size = 1024*1024*20;
	
	String title = null;
	String content = null;
	String imgName = null;
	String imgPath = "JSP_Study1/study/image/";
	try{
		// 파일업로드를 위한 MultipartRequest 객체 생성
		MultipartRequest mr = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
		
		// 업로드 이미지 파일 이름 가져오기	
		Enumeration em = mr.getFileNames();
		String file = (String)em.nextElement();	// 이미지 한개만 업로드 하기때문에
												// nextElement() 한번만 하면 된다.
		imgName = mr.getFilesystemName(file);	// 실제 저장된 파일이름
				// 원본이름 - mr.getOriginalFileName(file)
		// 제목과 내용 파라미터 가져오기
		title = mr.getParameter("title");
		content = mr.getParameter("content");
		
		
		
	}catch(Exception e){
		System.out.println("파일 업로드 실패");
		e.printStackTrace();
	}



	
	// 데이터베이스 사용
	DBconnect db = new DBconnect();
	//db.pt = db.conn.prepareStatement(sql);
	String sql="insert into board(title, writer, content) values(?,?,?)";
	 
 	
 	try{
 		
 		db.pt = db.conn.prepareStatement(sql);
 		db.pt.setString(1, title);	
 		db.pt.setString(2, writer);	
 		db.pt.setString(3, content);
 		db.pt.executeUpdate();				
 		
 	}catch(SQLException e){
 		
 		e.printStackTrace();
 	}
 	
 	int boardId = 0;
 	sql = "select board_id from board order by board_id desc limit 1";
 	try{
 		db.pt = db.conn.prepareStatement(sql);
 		db.rs = db.pt.executeQuery();
 		if( db.rs.next()){
 			boardId = db.rs.getInt("board_id");
 		}
 	}catch(SQLException e){
 		
 	}
 	
 	response.sendRedirect("/JSP_Study1/study/?part=board");

 	
	
	
%>