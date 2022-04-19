package com.gabrielmendes.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource implements Serializable {

    @GetMapping
    public String list(){
        return "Rest is working!";
    }

}
