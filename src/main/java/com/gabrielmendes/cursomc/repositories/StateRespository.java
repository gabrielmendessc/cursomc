package com.gabrielmendes.cursomc.repositories;

import com.gabrielmendes.cursomc.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRespository extends JpaRepository<State, Integer> {
}
