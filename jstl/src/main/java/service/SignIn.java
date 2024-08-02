package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;



public class SignIn implements MainActive{
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		String view = "/";
		
		if(request.getSession().getAttribute("user") != null ) {
			request.getSession().removeAttribute("user");
			 
		}else {
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPassword");
		view = request.getParameter("preURL");
		
		// 데이터베이스에서 아이디 비번 조회하기
		MemberDAO dao = new MemberDAO();
		boolean isSuccess = dao.login(id,pw);
		if( isSuccess ) {	// 아이디 비번이 데이터베이스에 존재한다면
			request.getSession().setAttribute("user", id);
			}
		}
		try {
			response.sendRedirect(view);
		}catch(Exception e) { }
			
		return null;
		}
}
