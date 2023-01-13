package com.dio.springdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dio.springdemo.model.Endereco;


@FeignClient(name="viacep", url="https://viacep.com.br/ws")
public interface ViaCepService {
    
    @RequestMapping(value="/{cep}/json/", method=RequestMethod.GET)
    public Endereco consultarCep(@PathVariable("cep") String cep);
    
}
