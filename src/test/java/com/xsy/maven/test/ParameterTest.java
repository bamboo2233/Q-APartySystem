package com.xsy.maven.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.xsy.maven.mapper.UserMapper;
import com.xsy.maven.qaparty.User;
import com.xsy.maven.utils.SqlSessionUtil;

public class ParameterTest {

//	@Test
//	public void testGetUserbyUsername() {
//	SqlSession sqlSession = SqlSessionUtil.getSqLSession();
//	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//	User user =mapper.getUserbyUsername("张三");
//	System.out.println(user);
//	}
//	
//	@Test
//	public void testInsertUser() {
//	SqlSession sqlSession = SqlSessionUtil.getSqLSession();
//	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//	User user = new User(null,"李四","2342","2365","normal");
//	mapper.insertUser(user);
//	System.out.println(user);
//	}
//	
	@Test
	public void testCheckUser() {
	SqlSession sqlSession = SqlSessionUtil.getSqLSession();
	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	User user = mapper.checkLogin("张三","123");
	System.out.println(user);
	}


}
