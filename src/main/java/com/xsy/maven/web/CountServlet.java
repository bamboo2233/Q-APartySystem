package com.xsy.maven.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.Score;
import com.xsy.maven.utils.SqlSessionUtil;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");	   
		response.setContentType("text/html;charset=UTF-8");
		
		
		String examnum[]=new String[10];
		examnum=(String[]) request.getSession().getServletContext().getAttribute("examnum");
		
		String  rightLists[]=new String[10];
		rightLists=(String[]) request.getSession().getServletContext().getAttribute("rightLists");
		
		String []userAnswer=new String[10];
		String name=(String) request.getSession().getServletContext().getAttribute("name");
		
		int userScore=0;
		for(int i=0;i<10;i++) {
			 userAnswer[i]=request.getParameter(examnum[i]);//获取用户的答案
			 if(userAnswer[i].equals(rightLists[i])) {
				 userScore=userScore+10;   //计算总分
			 }
		}
		
		SqlSession sqlSession = SqlSessionUtil.getSqLSession();
    	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    	Score score=new Score(null,name,Integer.toString(userScore),null);
		Score scoreExit=mapper.selectUserbyName(name);
    	
    	if(scoreExit!=null) {
    		mapper.updateScore(score);//更新该用户成绩
    	}else {
    		mapper.insertScore(score);//插入成绩
    	}
    	
    	
		
    	List<Score> scores=mapper.getScoresOrder();
    	
    	request.setAttribute("userpoint",userScore);
    	request.setAttribute("scores",scores);
		request.getRequestDispatcher("User_score.jsp").forward(request, response);
		
		
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
