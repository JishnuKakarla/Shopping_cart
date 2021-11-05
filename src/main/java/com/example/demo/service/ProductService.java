package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {
	List<Product> products ;
	
	ProductService()
	{
		products = new ArrayList<Product>();
	}
	
		public List<Product> listAll() {
			if(products.isEmpty())
			{
				products.add(new Product(101,"Product1","Product_1",100));
				products.add(new Product(102,"Product2","Product_2",150));
				products.add(new Product(103,"product3","Product_3",200));
				products.add(new Product(104,"product4","Product_4",400));
				products.add(new Product(105,"Product5","Product_5",220));
				products.add(new Product(106,"Product6","Product_6",160));
				products.add(new Product(107,"product7","Product_7",250));
				products.add(new Product(108,"product8","Product_8",170));
				products.add(new Product(109,"Product9","Product_9",120));
				products.add(new Product(110,"Product10","Product_10",650));
				products.add(new Product(111,"product11","Product_11",100));
				products.add(new Product(112,"product12","Product_12",900));
				products.add(new Product(113,"Product13","Product_13",300));
				products.add(new Product(114,"Product14","Product_14",750));
				products.add(new Product(115,"product15","Product_15",200));
				products.add(new Product(116,"product16","Product_16",900));
				products.add(new Product(117,"Product17","Product_17",200));
				products.add(new Product(118,"Product18","Product_18",810));
				products.add(new Product(119,"product19","Product_19",260));
				products.add(new Product(120,"product20","Product_20",130));
			}
	        return products;
	    }
	     
	    public void save(Product product) {
	       product.setPID(products.size()+101);
	       products.add(product);
	    }
	     
	    public Product get(int id) {
	    	for(Product product : products )
	    	{
	    		if(product.getPID()==id)
	    		{	
	    			return product;
	    		}
	    	}
			return null;
	    }
	}
