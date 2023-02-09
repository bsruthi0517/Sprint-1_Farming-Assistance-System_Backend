package com.cg.fas.dto;
public class CropDTO {
	private int id;
	private String name;
	private Long quantity;
	private Double sellingPrice;
	private Double buyingPrice;

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
}
