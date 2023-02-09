package com.cg.fas.entity;
import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name = "SupplierAdvertisement")
public class SupplierAdvertisement implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Long cropId;
    private Long supplierId;
    private Double askedPrice;
    public SupplierAdvertisement(int Id, Long cropId, Long supplierId, Double askedPrice) {
        super();
        this.Id = Id;
        this.cropId = cropId;
        this.supplierId = supplierId;
        this.askedPrice = askedPrice;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public Long getCropId() {
        return cropId;
    }
    public void setCropId(Long cropId) {
        this.cropId = cropId;
    }
    public Long getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    public Double getAskedPrice() {
        return askedPrice;
    }
    public void setAskedPrice(Double askedPrice) {
        this.askedPrice = askedPrice;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    @Override
    public String toString() {
        return "SupplierAdvertisement [id=" + Id + ", cropId=" + cropId + ", supplierId=" + supplierId + ", askedPrice="
                + askedPrice + "]";
    }
    public SupplierAdvertisement() {
        super();
        // TODO Auto-generated constructor stub
    }
}
