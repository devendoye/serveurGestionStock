package com.gestionstock.Dao;

import java.util.List;

import com.gestionstock.product.Product;

public interface ProductDao {
	
	public List<Product> ListProduit (); 
	
	public void addProduct(Product product);
	
	public void upgradeProduct(Product product);
	
	public Product deleteProduct(String ref);
	

}
