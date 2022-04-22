package com.gabrielmendes.cursomc;

import com.gabrielmendes.cursomc.domain.Category;
import com.gabrielmendes.cursomc.repositories.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoryRespository categoryRespository;

    public static void main(String[] args){
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Informatic");
        Category cat2 = new Category(null, "Office");
        List<Category> categories = Arrays.asList(cat1, cat2);

        categoryRespository.saveAll(categories);
    }
}
