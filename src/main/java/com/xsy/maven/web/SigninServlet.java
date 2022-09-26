package com.xsy.maven.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

/**
 * Servlet implementation class SigninServlet
 */
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter printWriter = response.getWriter();
		 
				String username = request.getParameter("username");
		        String password = request.getParameter("password");
		        String phone = request.getParameter("phone");
		        
		        SqlSession sqlSession = SqlSessionUtil.getSqLSession();
		    	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		    	User user = new User(null,username,password,phone,"normal");
		    	User realUser =mapper.checkSignIn(username);
		    	
		    	if(realUser!=null) {
		    		printWriter.print("<script>alert('�û�������������������');window.location.href='SignIn.jsp'</script>;");
		    	
		    	
		    	}else {
		    	 	mapper.insertUser(user);
			    	//System.out.println(user);

		    	 	printWriter.print("<script>alert('ע��ɹ�');window.location.href='UserLogin.jsp'</script>;");
			        //request.getRequestDispatcher( "UserLogin.jsp").forward(request,response); 
		    	
		    	}
					       
		        sqlSession.close();
		      
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
        /*
        User user = new User();
        user.setUserName(username);
        user.setPwd(password);
        user.setPhone(phone);

        //2.����MyBatis��ɲ�ѯ
        //2.1 ��ȡSqlSessionFactory����
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 ��ȡSqlSession����
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //2.3 ��ȡMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //���÷���
        User u = userMapper.getUserbyUsername(username);
        */
	
//        if (user==null){
//       
//            //�û�������
//           
//            response.getWriter().write("<h1>�û���ӳɹ���</h1>");
//            sqlSession.close();
//        }else{
//            //�û�����
//            response.getWriter().write("<h1>�û����Ѿ�����</h1>");
//        }
		
		
        
	}

}
