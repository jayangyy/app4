package cn.luxh.app.persistence;

import java.util.List;

import cn.luxh.app.domain.Role;

public interface RoleMapper{
	
	/**
	 * 根据用户id获取角色集合
	 * @param userId
	 * @return
	 */
	List<Role> selectByUserId(Integer userId);
	
	/**
	 * 查询所有角色
	 * @return
	 */
	List<Role> selectAll();
}
