package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class CartService {

	@Autowired

	ProductService productService;

	Map<Integer, Integer> items;
	 double totalPrice=0;
	 int totalItems=0;

	CartService() {
		items = new HashMap<Integer, Integer>();
	}

	public void addItem(int id) {
		if (items.containsKey(id)) {
			items.put(id, items.get(id) + 1);
		}
		else
		{
			items.put(id,1);
		}
	}

	public Map<Product, Integer> getAllitems() {
		Map<Product, Integer> cart = new HashMap<Product, Integer>();
		totalPrice=0;
		totalItems=0;
		for (Integer id : items.keySet()) {
			Product p = productService.get(id);
			totalPrice  += p.getPPrice()*items.get(id);
			totalItems +=items.get(id);
			cart.put(productService.get(id), items.get(id));
		}
		return cart;
	}

	public void deleteItem(int id) {
		if(items.containsKey(id))
		{
			items.remove(id);
		}
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	public int getTotalQuantity()
	{
		return totalItems;
	}
}
