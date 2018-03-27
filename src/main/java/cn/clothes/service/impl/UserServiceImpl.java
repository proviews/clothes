package cn.clothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.clothes.dao.UserDao;
import cn.clothes.domain.UserTable;
import cn.clothes.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public List<UserTable> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Override
	public UserTable findUserByName(String username) {
		// TODO Auto-generated method stub
		UserTable userTable=userDao.findByUsername(username);
		return userTable;
	}
	@Override
	public void addUser(UserTable userTable) {
		// TODO Auto-generated method stub
		userDao.save(userTable);
		
	}
	
	
}
