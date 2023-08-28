package com.log.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.log.pojo.Product;
import com.log.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	Logger logger =LogManager.getLogger(ProductController.class);
	@Autowired
	private ProductService productservice;
	
	@GetMapping
	public List<Product>  findall() {
		logger.info("started hitting the find all api from the controller");
		List<Product>pds=productservice.findall();
		logger.info("fetch all product from service in controller" +pds );
		return pds;
	}
		@GetMapping("/{id}")
		public Optional<Product> findById(@PathVariable int id){
			return productservice.findById(id);
		}
		
	}


