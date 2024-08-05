package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardRep;
import DTO.BoardDTO;

public class UpdateService implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 수정 - 상세페이지와 새 게시글 작성 두가지를 합쳐놓은 것
		
		if( request.getParameter("method") != null ) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int bid = Integer.parseInt( request.getParameter("boardId"));
			
			BoardDTO dto = new BoardDTO(bid, null, title, content, 0);
			
			BoardRep dao = new BoardRep();
			dao.update(dto);
			
			try { response.sendRedirect("/boardView.do?id="+bid);}catch(Exception e) {}
			return null;
		}else {
		
		int bid = Integer.parseInt( request.getParameter("id"));
		BoardRep dao = new BoardRep();
		
		BoardDTO dto = dao.findById( bid );
		
		request.setAttribute("board", dto);
		
		
		return "board/update.jsp";
		}
	}

}
