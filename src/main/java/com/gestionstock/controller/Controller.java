package com.gestionstock.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestionstock.Dao.ProductDaoImplet;
import com.gestionstock.product.Product;

@RestController
@RequestMapping("api/Products")
public class Controller {
	
	@Autowired
	public  ProductDaoImplet  productimplet;
	
@GetMapping
public List<Product> Listproduct()
{
	return productimplet.listProduct();
}
/*
@DeleteMapping("api/Products/{id}")
public void delete(@PathVariable int id)
{
	  productimplet.deleteById(id);
	
}

@PostMapping("api/Products")
public void addProducts(@RequestBody Product product)
{
	productimplet.addProduct(product);
}*/

}
