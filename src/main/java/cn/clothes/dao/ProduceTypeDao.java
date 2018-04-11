package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.ProductType;

public interface ProduceTypeDao extends JpaRepository<ProductType, Long>{

}
