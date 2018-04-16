package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.EmployeeTable;

public interface EmployeeDao extends JpaRepository<EmployeeTable, Long>{

}
