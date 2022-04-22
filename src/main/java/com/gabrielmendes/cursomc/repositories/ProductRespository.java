package com.gabrielmendes.cursomc.repositories;

import com.gabrielmendes.cursomc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<Product, Integer> {
}
