package cn.luxh.app.service;

import java.util.List;

import cn.luxh.app.domain.Resource;

public interface ResourceService {
	
	/**
	 * 根据角色id获取该角色可以访问的资源
	 * @param roleId
	 * @return
	 */
	List<Resource> getByRoleId(Integer roleId);
}
