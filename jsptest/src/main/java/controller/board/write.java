package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;
@WebServlet("/board/write")
public class write extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*	    btitle      varchar(50),	-- 게시물제목 
	    bcontent    varchar(100),	-- 게시물내용 
		bname		varchar(50) NOT NULL ,-- 게시물작성자
	    bpassword	varchar(50) NOT NULL ,-- 게시물패스워드 */
		
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bname = request.getParameter("bname");
		String bpassword = request.getParameter("bpassword");
		
		boolean result = BoardDao.pushTable(btitle,bcontent,bname,bpassword);
		if(result) {
			response.getWriter().print(result);
		}
		else {
			response.getWriter().print(result);
		}
		
	}
	
	
	private static final long serialVersionUID = 1L;

	public write() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
