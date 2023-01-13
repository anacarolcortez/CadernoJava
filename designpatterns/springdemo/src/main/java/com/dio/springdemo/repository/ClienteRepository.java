package com.dio.springdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.springdemo.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
