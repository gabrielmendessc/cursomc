package com.gabrielmendes.cursomc;

import com.gabrielmendes.cursomc.domain.Category;
import com.gabrielmendes.cursomc.domain.City;
import com.gabrielmendes.cursomc.domain.Product;
import com.gabrielmendes.cursomc.domain.State;
import com.gabrielmendes.cursomc.repositories.CategoryRespository;
import com.gabrielmendes.cursomc.repositories.CityRespository;
import com.gabrielmendes.cursomc.repositories.ProductRespository;
import com.gabrielmendes.cursomc.repositories.StateRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoryRespository categoryRespository;
    @Autowired
    private ProductRespository productRespository;
    @Autowired
    private StateRespository stateRespository;
    @Autowired
    private CityRespository cityRespository;

    public static void main(String[] args){
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Informatic");
        Category cat2 = new Category(null, "Office");

        Product p1 = new Product(null, "Computer", 2000.0);
        Product p2 = new Product(null, "Printer", 800.0);
        Product p3 = new Product(null, "Mouse", 80.0);

        cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProducts().addAll(Arrays.asList(p2));

        p1.getCategories().addAll(Arrays.asList(cat1));
        p2.getCategories().addAll(Arrays.asList(cat1, cat2));
        p3.getCategories().addAll(Arrays.asList(cat1));

        State st1 = new State(null, "Minas Gerais");
        State st2 = new State(null, "São Paulo");

        City ci1 = new City(null, "Uberlândia", st1);
        City ci2 = new City(null, "São Paulo", st2);
        City ci3 = new City(null, "Campinas", st2);

        st1.getCities().add(ci1);
        st2.getCities().addAll(Arrays.asList(ci2, ci3));

        categoryRespository.saveAll(Arrays.asList(cat1, cat2));
        productRespository.saveAll(Arrays.asList(p1, p2, p3));

        stateRespository.saveAll(Arrays.asList(st1, st2));
        cityRespository.saveAll(Arrays.asList(ci1, ci2, ci3));
    }
}
