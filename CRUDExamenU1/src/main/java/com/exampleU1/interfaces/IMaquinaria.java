package com.exampleU1.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleU1.models.Maquinaria;

@Repository
public interface IMaquinaria extends CrudRepository<Maquinaria, Integer> {

}
