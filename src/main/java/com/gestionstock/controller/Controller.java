package com.gestionstock.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestionstock.Dao.ProductDaoImplet;
import com.gestionstock.product.Product;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	public  ProductDaoImplet  productimplet;
	
@GetMapping("api/Products")
public List<Product> Listproduct()
{
	return productimplet.listProduct();
}
@PostMapping("api/Products")
public void addProducts(@RequestBody Product product)
{
	productimplet.addProduct(product);
}

@PutMapping("api/Products")
public void upgrateProducts(@RequestBody Product product)
{
	productimplet.upgrtaeProduct(product);
}

@DeleteMapping("api/Products/{id}")
public void deleteProduct(@PathVariable int id)
{
	productimplet.deleteById(id);
}

@GetMapping("api/Products/{id}")
public void findByid(@PathVariable int id)
{
	productimplet.findById(id);
}
}
