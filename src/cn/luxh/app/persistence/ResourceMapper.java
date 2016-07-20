package cn.luxh.app.persistence;

import java.util.List;

import cn.luxh.app.domain.Resource;

public interface ResourceMapper{
	
	/**
	 * 根据角色id获取该角色可以访问的资源
	 * @param roleId
	 * @return
	 */
	List<Resource> selectByRoleId(Integer roleId);
}
