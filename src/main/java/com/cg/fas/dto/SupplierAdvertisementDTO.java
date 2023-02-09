package com.cg.fas.dto;

public class SupplierAdvertisementDTO {
	  private int Id;
	    private long cropId;
	    private long supplierId;
	    private double askedPrice;

	 

	    public int getId() {
	        return Id;
	    }
	    public void setId(int Id) {
	        this.Id = Id;
	    }
	    public long getCropId() {
	        return cropId;
	    }
	    public void setCropId(long cropId) {
	        this.cropId = cropId;
	    }
	    public long getSupplierId() {
	        return supplierId;
	    }
	    public void setSupplierId(long supplierId) {
	        this.supplierId = supplierId;
	    }
	    public double getAskedPrice() {
	        return askedPrice;
	    }
	    public void setAskedPrice(double askedPrice) {
	        this.askedPrice = askedPrice;
	    }

}
