package cn.luxh.app.persistence;

import cn.luxh.app.domain.User;

public interface UserMapper {
	
	/**
	 * 根据帐号查询用户
	 * @param account 帐号
	 * @return
	 */
	User selectByAccount(String account);
}
