package com.gestionstock.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gestionstock.product.Product;

@Repository
public class ProductDaoImplements implements ProductDao {
	public static List<Product>  products = new ArrayList<Product>();
	static {
		products.add(new Product("Livre",100,2));
		products.add(new Product("CD",200,5));
		products.add(new Product("TV",1000,10));
		products.add(new Product("Bibliothéque",50,1));
		
	}

	@Override
	public List<Product> ListProduit() {
		return products;
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
		
	}

	@Override
	public void upgradeProduct(Product product) {
		products.add(product);
		products.remove(product);
	
		
	}

	@Override
	public Product deleteProduct(String ref ) {
     Product product = new Product();
     product.setRef(ref);
     products.remove(product);
	return product;
	}

}
