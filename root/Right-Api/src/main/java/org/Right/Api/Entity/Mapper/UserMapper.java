package org.Right.Api.Entity.Mapper;

import java.util.List;

import org.Right.Api.Entity.User;

public interface UserMapper {
	/**
	 * 获取用户列表
	 * @return
	 */
	List<User> getUserList();
}
