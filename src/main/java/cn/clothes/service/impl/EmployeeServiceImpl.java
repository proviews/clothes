package cn.clothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.clothes.dao.EmployeeDao;
import cn.clothes.domain.EmployeeTable;
import cn.clothes.service.EmployeeService;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<EmployeeTable> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	@Override
	public EmployeeTable findById(Long id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id).get();
	}

}
