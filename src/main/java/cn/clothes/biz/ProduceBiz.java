package cn.clothes.biz;

import java.util.Date;

import javax.persistence.Entity;

import cn.clothes.domain.ProductStyle;
import cn.clothes.domain.ProductType;
public class ProduceBiz {
	private Integer id;
	private Integer productrecordtableid;
	private Integer productstateid; 
	private Integer productnum;
	private Date inspectiontime; 
	private Date deliverytime;
	private String productquality;
	private String responsibleperson;
	private ProductStyle productStyle;
	private ProductType productType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductrecordtableid() {
		return productrecordtableid;
	}
	public void setProductrecordtableid(Integer productrecordtableid) {
		this.productrecordtableid = productrecordtableid;
	}
	public Integer getProductstateid() {
		return productstateid;
	}
	public void setProductstateid(Integer productstateid) {
		this.productstateid = productstateid;
	}
	public Integer getProductnum() {
		return productnum;
	}
	public void setProductnum(Integer productnum) {
		this.productnum = productnum;
	}
	public Date getInspectiontime() {
		return inspectiontime;
	}
	public void setInspectiontime(Date inspectiontime) {
		this.inspectiontime = inspectiontime;
	}
	public Date getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}
	public String getProductquality() {
		return productquality;
	}
	public void setProductquality(String productquality) {
		this.productquality = productquality;
	}
	public String getResponsibleperson() {
		return responsibleperson;
	}
	public void setResponsibleperson(String responsibleperson) {
		this.responsibleperson = responsibleperson;
	}
	public ProductStyle getProductStyle() {
		return productStyle;
	}
	public void setProductStyle(ProductStyle productStyle) {
		this.productStyle = productStyle;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
}
