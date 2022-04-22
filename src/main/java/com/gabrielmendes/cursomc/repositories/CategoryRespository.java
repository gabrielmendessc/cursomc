package com.gabrielmendes.cursomc.repositories;

import com.gabrielmendes.cursomc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRespository extends JpaRepository<Category, Integer> {
}
