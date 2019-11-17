package com.gestionstock.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionstock.product.Product;
@Repository
public interface ProductRepositoy  extends JpaRepository<Product, Integer>{

}
