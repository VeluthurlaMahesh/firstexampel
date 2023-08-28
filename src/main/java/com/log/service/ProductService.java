package com.log.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.log.pojo.Product;

@Service
public class ProductService {
	
	Logger logger=LogManager.getFormatterLogger(ProductService.class);
	List<Product>ll=new ArrayList();
	
	public List<Product> findall() {
		
		logger.info("we are starting yhe execution of find () in service ");
		
		
		Product p=new Product();
		p.setId(1);
		p.setName("bike");
		p.setPrice(1000);
		p.setQuantity(10);
		
		Product p1=new Product();
		p1.setId(2);
		p1.setName("car");
		p1.setPrice(2000);
		p1.setQuantity(15);
		
		Product p2=new Product();
		p2.setId(3);
		p2.setName("tractor");
		p2.setPrice(3000);
		p2.setQuantity(20);
		
		Product p3=new Product();
		p3.setId(4);
		p3.setName("pulsar");
		p3.setPrice(4000);
		p3.setQuantity(13);
		
		ll.add(p);
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		
		logger.info("fetch the productlist from db in service");
		return ll;
	}
	public Optional<Product>findById(int id){
		Product p1=new Product();
		p1.setId(2);
		p1.setName("car");
		p1.setPrice(2000);
		p1.setQuantity(15);
		Optional<Product>pd=Optional.ofNullable(p1);
		return pd;
	}
	public Product save(Product product) {
		Product p1=new Product();
		p1.setId(2);
		p1.setName("car");
		p1.setPrice(2000);
		p1.setQuantity(15);
		return p1;
		
	}
	public void deleteById(int id) {
		
	}
}
