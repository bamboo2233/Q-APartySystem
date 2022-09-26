package com.xsy.maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xsy.maven.qaparty.Exam;
import com.xsy.maven.qaparty.Score;
import com.xsy.maven.qaparty.User;

public interface UserMapper {
	
	//����û�
	void insertUser(User user);
	
	//�����û����������ѯ����¼
	User checkLogin(@Param("username") String username , @Param("password") String password);
	
	//�����û������أ�����
	User checkSignIn(@Param("username")String username);
	
	//��ѯ�����û�
	List<User> getAllUser();
	
	//ɾ���û�
	void deleteUser(@Param("username") String username);
	
	
	//�޸��û���Ϣ
	void updateUser(User user);
	
	//�������
	void insertExam(Exam exam);
	
	//�༭����
	void updateExam(Exam exam);
	
	//ɾ������
	void deleteExam(@Param("testId") String testId);
		
	//��ȡ��������
	List<Exam> getExam();
	
	//������Ų�ѯ��Ŀ
	Exam getExambyId(@Param("testId") String testId) ;
	
	//������Ż�ȡ��ȷ��
	String getAnswerbyId(@Param("testId")String testId );
	
	//��ȡ��ǰ��Ŀ����
	int selectExamSum();
	
	//��ȡ�û����
	String getIdentity(@Param("username") String username);

	//�����û��ɼ�
	void insertScore(Score score);
	
	//��ѯ�ɼ����е��û�
	Score selectUserbyName(@Param("name") String username);
	
	//�����û��ɼ�
	void updateScore(Score score);
	
	//��ȡ���д����û��ĳɼ�����
	List<Score> getScoresOrder();
	
	
	
	//ɾ���Ծ�
	
}
