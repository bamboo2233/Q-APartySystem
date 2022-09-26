package com.xsy.maven.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");	   
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter printWriter = response.getWriter();
		 
		String username = request.getParameter("username");
        String password = request.getParameter("password");
		String adminIdentity="admin";
		String identity=null;
        
		
        SqlSession sqlSession = SqlSessionUtil.getSqLSession();
    	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    	User user = mapper.checkLogin(username,password);
    	//System.out.println(user);
    	if(user!=null) {
    		
    		identity=mapper.getIdentity(username);
    		request.setAttribute("username",username);
			printWriter.print("<script>alert('登录成功！');");
			HttpSession session=request.getSession();
			session.setAttribute("name",username);
			request.getSession().getServletContext().setAttribute("name", username);
			if(identity.equals(adminIdentity))
    		{
    			
    			request.getRequestDispatcher("Admin_home.jsp").forward(request, response);		
    			//response.sendRedirect("Admin_home.jsp");
    		}else {
    			
    				
    			request.getRequestDispatcher("User_home.jsp").forward(request, response);
    		
    		}
    		//response.getWriter().write("success===="+user.getUserName());
    		
    		//response.sendRedirect(".jsp");
    	}else {
    		printWriter.print("<script>alert('用户名或密码不正确！');window.location.href='UserLogin.jsp'</script>;");
    		//response.getWriter().write("login fail");
    		//response.sendRedirect("UserLogin.jsp");
    	}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		
		
	}

}
