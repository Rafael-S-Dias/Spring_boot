package com.example.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Integer>{
    
}
