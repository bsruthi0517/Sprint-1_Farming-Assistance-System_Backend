package com.cg.fas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="crop")
public class Crop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Long quantity;
	private Double sellingPrice;
	private Double buyingPrice;
	 public Crop() {
		 super();
		// TODO Auto-generated constructor stub
	 }
	 public Crop(String name, Long quantity, Double sellingPrice, Long farmerId, Long supplierId, Double buyingPrice) {
		 super();
		 this.name = name;
		 this.quantity = quantity;
		 this.sellingPrice = sellingPrice;
		 this.buyingPrice = buyingPrice;
	 }
	 public int getId() {
		 return id;
}
	 public void setId(int id) {
		 this.id = id;
}
	 public String getName() {
		 return name;
}
	 public void setName(String name) {
		 this.name = name;
}
	 public Long getQuantity() {
		 return quantity;
}
	 public void setQuantity(Long quantity) {
		 this.quantity = quantity;
}
	 public Double getSellingPrice() {
		 return sellingPrice;
}
	 public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
}
	 public Double getBuyingPrice() {
		 return buyingPrice;
}
	 public void setBuyingPrice(Double buyingPrice) {
		 this.buyingPrice = buyingPrice;
}
	 @Override
	 public String toString() {
	 return "Crop [id=" + id + ", name=" + name + ", quantity=" + quantity + ", sellingPrice=" + sellingPrice
	 + ", buyingPrice=" + buyingPrice
	 + "]";
}
}
