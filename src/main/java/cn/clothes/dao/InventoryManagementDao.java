package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.InventoryManagement;
import java.lang.String;
import java.util.List;

public interface InventoryManagementDao extends JpaRepository<InventoryManagement, Integer>{
	InventoryManagement findByClothesnames(String clothesnames);
}
