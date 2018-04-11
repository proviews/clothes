package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.ProductStyle;

public interface ProduceStyleDao extends JpaRepository<ProductStyle, Long>{

}
