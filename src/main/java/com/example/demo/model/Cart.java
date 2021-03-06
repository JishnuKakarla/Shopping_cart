package com.example.demo.model;

public class Cart {
	
	Product product;
	int quantity;
	double totalPrice;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Cart(Product product, int quantity, double totalPrice) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [product=" + product + ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
