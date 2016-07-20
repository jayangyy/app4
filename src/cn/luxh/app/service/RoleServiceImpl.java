package cn.luxh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.luxh.app.domain.Role;
import cn.luxh.app.persistence.RoleMapper;

public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> getAll() {
		return roleMapper.selectAll();
	}

}
