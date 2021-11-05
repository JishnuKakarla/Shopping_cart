package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.service.CartService;
import com.example.demo.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
    private ProductService service;
	@Autowired
	private CartService cartService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("totalItems",cartService.getTotalQuantity());
        return "index";
    }
    
    @GetMapping("/products")
    public String viewProductsPage(Model model) {
    	List<Product> listproduct = service.listAll();
        model.addAttribute("listproduct", listproduct);
        model.addAttribute("totalItems",cartService.getTotalQuantity());
        return "products";
    }

    @GetMapping("/Addproduct")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("totalItems",cartService.getTotalQuantity());
        return "Addproduct";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveproduct(@ModelAttribute("product") Product product) {
        service.save(product);
        return "redirect:/products";
    }
}
