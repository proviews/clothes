package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.clothes.domain.UserTable;

public interface UserDao extends JpaRepository<UserTable, Long>{
	@Query("select u from UserTable u where username=?1")
	UserTable findByUsername(String username);
}
