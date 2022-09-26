package com.xsy.maven.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xsy.maven.mapper.UserMapper;

public class SqlSessionUtil {
	
	public static SqlSession getSqLSession(){
		SqlSession sqlSession =null;
		try {
		InputStream is =Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
		//sql�ĻỰ����SqlSession ��mybatis���ṩ�Ĳ������ݿ�Ķ���
		//�����Զ��ύ
		sqlSession = sqlSessionFactory.openSession(true);
		}catch(IOException e) {
			e.printStackTrace();
		}	
	
		return sqlSession;
		
	}
}
