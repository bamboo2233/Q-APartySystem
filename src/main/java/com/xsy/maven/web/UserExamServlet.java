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
		
		int examSum=mapper.selectExamSum();//��ȡ�������Ŀ����
		Random r = new Random();
		
		List<Exam> lists=new ArrayList<Exam>();//�洢���ɵ���Ŀ��ѡ��
		String []examnum =new String[10];//�������
		List<String> order =new ArrayList<String>();//�ж��ظ����
		String []rightLists=new String[10];//��ȷ��
		int i=0;
		while(i<10) {
			Exam exam= new Exam();

			String num = Integer.toString(r.nextInt(examSum)+1); // ����[1, examSum+1)���������
			if(!order.contains(num)) {
				//contains()��ǰ�б�������ĳԪ�أ����ؽ��Ϊtrue, ����������Ԫ�أ����ؽ��Ϊfalse��
				order.add(num); 
				
				exam=mapper.getExambyId(num);//��ȡ��Ŀ��ѡ��
				lists.add(exam);//��������
				
				examnum[i]=num;//�������
				rightLists[i]=mapper.getAnswerbyId(num);//�����
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
