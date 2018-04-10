package cn.clothes.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import cn.clothes.domain.ProductRecordTable;
public interface ProduceDao extends JpaRepository<ProductRecordTable,Long>{
	/*@Query("select id,Status,productNum,productType,styleNames,inspectionTime,deliveryTime,productQuality,responsiblePerson,productrecordtableid from product_record_table prt,production_record_status_table prst,product_style ps,product_type pt where prt.productStateID=prst.StatusNo and prt.typeID=pt.productNo and prt.styleID=ps.styleNo")
	List<ProductRecordTable> findAll();*/
	
	
}
