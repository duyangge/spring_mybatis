/**
 * 
 */
package cn.jx.pxc.ssm.mapper.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jx.pxc.ssm.dao.UserDao;
import cn.jx.pxc.ssm.mapper.UserMapper;
import cn.jx.pxc.ssm.po.User;

/**
 * <p>@Title MybatisTest.java</p>
 *<p> @description 测试mybatis一些常用的操作crud</p>
 * @package cn.jx.pxc.test
 * @author 黄信胜
 * @date 2018年11月28日下午7:45:48
 * @version 1.0
 */
@SuppressWarnings("all")
public class UserMapperTest {
	private ApplicationContext con;
	
	@Before
	public void setup() throws Exception{
		 con = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		
	}
	
	/**
	 * 测试对用户的查询操作
	 * @throws Exception 
	 */
	@Test
	public void selectTest() throws Exception {
		UserMapper userMapper = (UserMapper) con.getBean("userMapper");
		User user = userMapper.findUserById(10);
		System.out.println(user.toString());
	}
	

	
}
