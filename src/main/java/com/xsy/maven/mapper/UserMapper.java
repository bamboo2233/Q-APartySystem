package com.xsy.maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xsy.maven.qaparty.Exam;
import com.xsy.maven.qaparty.Score;
import com.xsy.maven.qaparty.User;

public interface UserMapper {
	
	//添加用户
	void insertUser(User user);
	
	//根据用户名和密码查询，登录
	User checkLogin(@Param("username") String username , @Param("password") String password);
	
	//根据用户名查重，重名
	User checkSignIn(@Param("username")String username);
	
	//查询所有用户
	List<User> getAllUser();
	
	//删除用户
	void deleteUser(@Param("username") String username);
	
	
	//修改用户信息
	void updateUser(User user);
	
	//添加试题
	void insertExam(Exam exam);
	
	//编辑试题
	void updateExam(Exam exam);
	
	//删除试题
	void deleteExam(@Param("testId") String testId);
		
	//获取所有试题
	List<Exam> getExam();
	
	//根据题号查询题目
	Exam getExambyId(@Param("testId") String testId) ;
	
	//根据题号获取正确答案
	String getAnswerbyId(@Param("testId")String testId );
	
	//获取当前题目总数
	int selectExamSum();
	
	//获取用户身份
	String getIdentity(@Param("username") String username);

	//保存用户成绩
	void insertScore(Score score);
	
	//查询成绩表中的用户
	Score selectUserbyName(@Param("name") String username);
	
	//更新用户成绩
	void updateScore(Score score);
	
	//获取所有答题用户的成绩排序
	List<Score> getScoresOrder();
	
	
	
	//删除试卷
	
}
