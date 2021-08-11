package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {

    @Autowired
    public ProductServices services;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value ="/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = services.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
