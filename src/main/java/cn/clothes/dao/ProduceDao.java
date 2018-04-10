package cn.clothes.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.ProductRecordTable;
public interface ProduceDao extends JpaRepository<ProductRecordTable,Long>{
	
	
	
}
