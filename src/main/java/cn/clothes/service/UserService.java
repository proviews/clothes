package cn.clothes.service;

import java.util.List;

import cn.clothes.domain.UserTable;

public interface UserService {
	List<UserTable> findAll();
	UserTable findUserByName(String username);
	void addUser(UserTable userTable);
}
