/**
 * 
 */
package cn.jx.pxc.ssm.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.jx.pxc.ssm.po.User;
import cn.jx.pxc.ssm.dao.UserDao;

/**
 * <p>@Title UserDaoImpl.java</p>
 *<p> @description userdaoimpL实现类</p>
 * @package cn.jx.pxc.dao.impl
 * @author 黄信胜
 * @date 2018.11.23;4:27:33
 * @version 1.0
 */
@SuppressWarnings("all")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#findUserById(java.lang.Integer)
	 */
	@Override
	public User findUserById(Integer id) throws Exception {
		return this.getSqlSession().selectOne("test.findUserById", id);
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#findUserByName(java.lang.String)
	 */
	@Override
	public List<User> findUserByName(String username) throws Exception {
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#insertUser(cn.jx.pxc.pojo.User)
	 */
	@Override
	public void insertUser(User user) throws Exception {
		
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#deleteUserById(java.lang.Integer)
	 */
	@Override
	public void deleteUserById(Integer id) throws Exception {
		
	}

	/* (non-Javadoc)
	 * @see cn.jx.pxc.dao.UserDao#findAllUser()
	 */
	@Override
	public List<User> findAllUser() throws Exception {
		return null;
	}
	

}
