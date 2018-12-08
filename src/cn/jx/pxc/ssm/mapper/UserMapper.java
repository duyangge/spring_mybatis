/**
 * 
 */
package cn.jx.pxc.ssm.mapper;

import java.util.List;

import cn.jx.pxc.ssm.po.User;
import cn.jx.pxc.ssm.po.UserCustomer;
import cn.jx.pxc.ssm.po.UserQueryVo;




/**
 *<p> @Title UserMapper.java</p>
 *<p> @description 描述</p>
 * @package cn.jx.pxc.mapper
 * @author 黄信胜
 * @date 2018年11月29日下午1:20:58
 * @version 1.0
 */
public interface UserMapper {
	
	/**
	 * 根据用户id查询信息
	 * @param id 用户id
	 * @return 用户实体类对象
	 */
	User findUserById(Integer id) throws Exception;
	

}
