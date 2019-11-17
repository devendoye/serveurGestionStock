package com.gestionstock.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.gestionstock.product.Product;

@Service
@Primary
public class ProductDaoImplet implements ProductDao {

	@Autowired
	public ProductRepositoy  productrepository;
	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return productrepository.findAll();
	}

	@Override
	public void addProduct(Product product) {
		productrepository.save(product);
		
	}

	@Override
	public void upgrtaeProduct(Product product) {
		productrepository.save(product);
		
	}


	@Override
	public void deleteById(int id) {
	Product product = new Product();
	product.setId(id);
	productrepository.delete(product);
		
	}

}
