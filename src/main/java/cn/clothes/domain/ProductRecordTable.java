package cn.clothes.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="product_record_table")
public class ProductRecordTable implements Serializable{
	@Id
	@GeneratedValue
    private Integer id;

    private Integer productrecordtableid;

    @OneToOne(targetEntity = ProductionRecordStatusTable.class)
    @JoinColumn(name = "productstateid",referencedColumnName = "statusno")
    private ProductionRecordStatusTable productionRecordStatusTable;

    private Integer productnum;
    @Temporal(TemporalType.DATE)
    private Date inspectiontime;
    @Temporal(TemporalType.DATE)
    private Date deliverytime;

    private String productquality;

    private String responsibleperson;

    @OneToOne(targetEntity = ProductType.class)
    @JoinColumn(name = "typeid",referencedColumnName = "productno")
    private ProductType productType;

    @OneToOne(targetEntity = ProductStyle.class)
    @JoinColumn(name = "styleid",referencedColumnName = "styleno")
    private ProductStyle productStyle;

    public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductStyle getProductStyle() {
		return productStyle;
	}

	public void setProductStyle(ProductStyle productStyle) {
		this.productStyle = productStyle;
	}

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
    public Integer getProductnum() {
        return productnum;
    }

    public ProductionRecordStatusTable getProductionRecordStatusTable() {
		return productionRecordStatusTable;
	}

	public void setProductionRecordStatusTable(ProductionRecordStatusTable productionRecordStatusTable) {
		this.productionRecordStatusTable = productionRecordStatusTable;
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
}