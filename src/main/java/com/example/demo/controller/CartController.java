package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.service.CartService;

@Controller
public class CartController {
	
	@Autowired
	CartService cartService;
	
    @GetMapping("/cart")
    public String viewCartPage(Model model) {
    	Map<Product,Integer> cartItems = cartService.getAllitems();
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("totalPrice", cartService.getTotalPrice());
        model.addAttribute("totalItems",cartService.getTotalQuantity());
        return "cart";
    }
    
    @RequestMapping("/addtocart/{id}")
    public String addProduct(@PathVariable(name = "id") int id) {
        cartService.addItem(id);
        return "redirect:/cart";
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        cartService.deleteItem(id);
        return "redirect:/cart";
    }
}
