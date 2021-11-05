package com.example.demo.model;

public class Product {
	int PID;
	String PName;
	String PDescription;
	int PPrice;
	
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPDescription() {
		return PDescription;
	}
	public void setPDescription(String pDescription) {
		PDescription = pDescription;
	}
	public int getPPrice() {
		return PPrice;
	}
	public void setPPrice(int pPrice) {
		PPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [PID=" + PID + ", PName=" + PName + ", PDescription=" + PDescription + ", PPrice=" + PPrice
				+ "]";
	}
	public Product(int pID, String pName, String pDescription, int pPrice) {
		super();
		PID = pID;
		PName = pName;
		PDescription = pDescription;
		PPrice = pPrice;
	}
	public Product() {
		super();
	}
}
