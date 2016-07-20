package cn.luxh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.luxh.app.domain.Resource;
import cn.luxh.app.persistence.ResourceMapper;


public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
	private ResourceMapper resourceMapper;
	@Override
	public List<Resource> getByRoleId(Integer roleId) {
		return resourceMapper.selectByRoleId(roleId);
	}

}
