package org.Right.Service;

import java.util.List;

import org.Right.Api.Entity.User;
import org.Right.Api.Entity.Mapper.UserMapper;
import org.Right.Api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}

}
