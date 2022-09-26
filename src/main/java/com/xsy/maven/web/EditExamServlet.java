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
 * Servlet implementation class EditExamServlet
 */
public class EditExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditExamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String testId = request.getParameter("testId");
		String testTitle = request.getParameter("testTitle");	
		String optionA = request.getParameter("optionA");
		String optionB = request.getParameter("optionB");
		String optionC = request.getParameter("optionC");
		String testAnswer = request.getParameter("testAnswer");
		
		System.out.println(testId);
		
		SqlSession sqlSession=SqlSessionUtil.getSqLSession();
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		
		Exam exam=new Exam(testId,null,testTitle,optionA,optionB,optionC,testAnswer);
		
		mapper.updateExam(exam);
		
		response.sendRedirect("manageExamServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
