package com.xsy.maven.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.Exam;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

/**
 * Servlet implementation class UserExamServlet
 */
public class UserExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserExamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
	     
		SqlSession sqlSession=SqlSessionUtil.getSqLSession();
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		
		int examSum=mapper.selectExamSum();//获取试题库题目总数
		Random r = new Random();
		
		List<Exam> lists=new ArrayList<Exam>();//存储生成的题目和选项
		String []examnum =new String[10];//保存题号
		List<String> order =new ArrayList<String>();//判断重复题号
		String []rightLists=new String[10];//正确答案
		int i=0;
		while(i<10) {
			Exam exam= new Exam();

			String num = Integer.toString(r.nextInt(examSum)+1); // 生成[1, examSum+1)区间的整数
			if(!order.contains(num)) {
				//contains()当前列表若包含某元素，返回结果为true, 若不包含该元素，返回结果为false。
				order.add(num); 
				
				exam=mapper.getExambyId(num);//获取题目和选项
				lists.add(exam);//生成试题
				
				examnum[i]=num;//保存题号
				rightLists[i]=mapper.getAnswerbyId(num);//保存答案
				i++;
				}
		}
		
	
		request.getSession().getServletContext().setAttribute("examnum",examnum);
		request.getSession().getServletContext().setAttribute("rightLists",rightLists);
		

		//exams.forEach(System.out::println);
		
		request.setAttribute("lists",lists);
		request.getRequestDispatcher("User_Exam.jsp").forward(request, response);
		//sqlSession.close();
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
