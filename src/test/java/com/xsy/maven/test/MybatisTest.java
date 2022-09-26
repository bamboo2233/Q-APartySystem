package com.xsy.maven.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

public class MybatisTest {
	/*5@Test
	
	public  void testinsert() throws IOException {
		InputStream is =Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
		//sql的会话对象SqlSession 是mybatis的提供的操作数据库的对象
		//设置自动提交
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		//获取UserMapper的代理实现类对象
		UserMapper mapper =sqlSession.getMapper(UserMapper.class);
		//调用mapper接口中的方法，
		int result=mapper.insertUser();
		System.out.println("结果："+result);
		
		//sqlSession.commit();
		sqlSession.close();
	}
	*/
	/*
	@Test
	public void testUpdate() {
		SqlSession sqlSession =SqlSessionUtil.getSqLSession();
		UserMapper mapper= sqlSession.getMapper(UserMapper.class);
		mapper.updateUser();
		sqlSession.close();
	}
	*/
//	
//	@Test
//	public void testGetAllUser() {
//		SqlSession sqlSession =SqlSessionUtil.getSqLSession();
//		UserMapper mapper= sqlSession.getMapper(UserMapper.class);
//		List<User> list=mapper.getAllUser();
//		list.forEach(System.out::println);
//	}
	
	@Test
	public void testDeleteUser() {
		SqlSession sqlSession =SqlSessionUtil.getSqLSession();
		UserMapper mapper= sqlSession.getMapper(UserMapper.class);
		mapper.deleteUser("张三");
	}
	
	
	
	
}






