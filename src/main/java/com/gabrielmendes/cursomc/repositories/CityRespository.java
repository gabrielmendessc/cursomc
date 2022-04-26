package com.gabrielmendes.cursomc.repositories;

import com.gabrielmendes.cursomc.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRespository extends JpaRepository<City, Integer> {
}
