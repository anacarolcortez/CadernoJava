package com.dio.springdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.springdemo.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
