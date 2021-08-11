package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository category;

    public List<Category> findAll(){
        return category.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = category.findById(id);
        return obj.get();

    }

}
