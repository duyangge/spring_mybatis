/**
 * 
 */
package cn.jx.pxc.ssm.dao;

import java.util.List;

import cn.jx.pxc.ssm.po.User;


/**
 * <p> @Title  UserDao</p>
 *<p> @description User的dao层</p>
 * @package cn.jx.pxc.dao
 * @author  黄信胜
 * @date   2018年11月29日下午1:20:58
 * @version 1.0
 */
public interface UserDao {
	
	/**
	 * 根据用户id查询信息
	 * @param id 用户id
	 * @return 用户实体类对象
	 */
	User findUserById(Integer id) throws Exception;
	
	/**
	 * 通过用户名称模糊查询
	 * @param username 用户名称
	 * @return 用户实体类的集合
	 * @throws Exception
	 */
	List<User> findUserByName(String username) throws Exception;
	
	/**
	 * 添加用户
	 * @param user 用户实体类对象
	 * @throws Exception
	 */
	void insertUser(User user) throws Exception;
	
	/**
	 * 根据用户id删除用户
	 * @param id 用户id
	 * @throws Exception
	 */
	void deleteUserById(Integer id) throws Exception;
	
	/**
	 * 查询所有用户
	 * @return 所有用户实体类对象的集合
	 * @throws Exception
	 */
	List<User> findAllUser() throws Exception;
}
