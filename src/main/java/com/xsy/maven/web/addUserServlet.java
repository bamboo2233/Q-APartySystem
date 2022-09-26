package com.xsy.maven.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.Score;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

/**
 * Servlet implementation class addUserServlet
 */
public class addUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String phone = request.getParameter("phone");
		String identity = request.getParameter("identity");
		
		SqlSession sqlSession = SqlSessionUtil.getSqLSession();
    	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    	User user=new User(null,name,pwd,phone,identity);
    	mapper.insertUser(user);
    	request.getRequestDispatcher("manageUserServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
