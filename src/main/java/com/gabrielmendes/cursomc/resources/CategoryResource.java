package com.gabrielmendes.cursomc.resources;

import com.gabrielmendes.cursomc.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource implements Serializable {

    @GetMapping
    public List<Category> list(){
        Category cat1 = new Category(1, "Informatic");
        Category cat2 = new Category(2, "Office");

        List<Category> categoryList = Arrays.asList(cat1, cat2);

        return categoryList;
    }

}
