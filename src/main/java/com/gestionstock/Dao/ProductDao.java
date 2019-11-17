package com.gestionstock.Dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionstock.product.Product;

@Service
public interface ProductDao  {
	
	public List<Product> listProduct();
	public void addProduct(Product product);
	public void upgrtaeProduct(Product product);
	public void deleteById(int id);
}
