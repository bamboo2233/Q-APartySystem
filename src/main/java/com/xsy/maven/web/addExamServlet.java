package com.xsy.maven.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.Exam;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

/**
 * Servlet implementation class addExamServlet
 */
public class addExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addExamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		
		String testType = request.getParameter("type");
		String testTitle = request.getParameter("title");
		String optionA = request.getParameter("A");
		String optionB = request.getParameter("B");
		String optionC = request.getParameter("C");
		String testAnswer = request.getParameter("answer");
		
		SqlSession sqlSession = SqlSessionUtil.getSqLSession();
    	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    	Exam exam=new Exam(null,testType,testTitle,optionA,optionB,optionC,testAnswer);
    	mapper.insertExam(exam);
    	request.getRequestDispatcher("manageExamServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
