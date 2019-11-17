package com.gestionstock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionstock.Dao.ProductDao;
import com.gestionstock.product.Product;

@RestController
@RequestMapping("api/Products/")
public class Controller {
	
	@Autowired
	public ProductDao  productDao;
	

public List<Product> ListProduits()
{
	return productDao.ListProduit();
	
}


public  void  addProduct(@RequestBody Product product)
{
	 productDao.addProduct(product);
}

public void  upgratdProduct(@RequestBody Product product)
{
	productDao.upgradeProduct(product);
}

public Product deleteProduct(@PathVariable String ref)
{
	return productDao.deleteProduct(ref);

}
	

}
