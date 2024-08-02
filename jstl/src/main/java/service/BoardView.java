package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardRep;
import DTO.BoardDTO;

public class BoardView implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		int bid = Integer.parseInt( request.getParameter("id"));
		BoardRep dao = new BoardRep();
		
		BoardDTO dto = dao.findById( bid );
		
		request.setAttribute("board", dto);
		
		return "board/view.jsp";
	}

}
