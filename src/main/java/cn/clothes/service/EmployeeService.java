package cn.clothes.service;

import java.util.List;

import cn.clothes.domain.EmployeeTable;

public interface EmployeeService {
	List<EmployeeTable> findAll();

	EmployeeTable findById(Long id);
}
