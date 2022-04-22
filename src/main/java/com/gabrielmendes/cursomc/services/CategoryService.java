package com.gabrielmendes.cursomc.services;

import com.gabrielmendes.cursomc.domain.Category;
import com.gabrielmendes.cursomc.repositories.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRespository categoryRespository;

    public Category findById(int id){
        Optional<Category> category = categoryRespository.findById(id);

        return category.orElse(null);
    }

}
