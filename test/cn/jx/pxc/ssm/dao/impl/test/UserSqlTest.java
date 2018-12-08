/**
 * 
 */
package cn.jx.pxc.ssm.dao.impl.test;


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
public class UserSqlTest {
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
	UserDao userDao = (UserDao) con.getBean("userDao");
	User user = userDao.findUserById(1);
	System.out.println(user.toString());
	}
	
	/**
	 * 根据用户id修改用户信息
	 * @throws IOException
	 */
	public void updateUser() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
	    User user = sqlSession.selectOne("test.findById", 24);
	    user.setUsername("张三疯");
		sqlSession.update("test.updateUser", user);
		sqlSession.commit();
		System.out.println("修改成功！");
		sqlSession.close();
	}
	
	/**4.根据用户id删除用户
	 * @throws IOException
	 */
	public void deleteUser() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.delete("test.deleteUser", 25);
		sqlSession.commit();
		System.out.println("删除成功！");
		sqlSession.close();
	}
	
	/**
	 * 添加用户返回主键（两种方式）
	 * 1.自增型添加
	 * 2.非自增型添加
	 * @throws IOException
	 */
	public void addUser() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		/*3.添加用户
			3.1自增型
			3.2非自增型*/
		User user=new User();
		user.setUsername("刘者先");
		user.setSex('男');
		//user.setBirthday(new Date("1998-12-02"));
		user.setAddress("北京朝阳区");
		Integer uid = sqlSession.insert("test.addUser", user);
		System.out.println("添加用户成功！"+uid);
		sqlSession.commit();
		sqlSession.close();
	}
}
