package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.InventoryManagement;

public interface InventoryManagementDao extends JpaRepository<InventoryManagement, Integer>{

}
