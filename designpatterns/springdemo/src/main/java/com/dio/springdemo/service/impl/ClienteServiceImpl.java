package com.dio.springdemo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.springdemo.model.Cliente;
import com.dio.springdemo.model.Endereco;
import com.dio.springdemo.repository.ClienteRepository;
import com.dio.springdemo.repository.EnderecoRepository;
import com.dio.springdemo.service.ClienteService;
import com.dio.springdemo.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> resp = clienteRepository.findById(id);
        if (resp.isPresent()){
            salvarDados(cliente);
        }
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> resp = clienteRepository.findById(id);
        return resp.get();
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarDados(cliente);
    }

    private void salvarDados(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEnderco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEnderco);
            return novoEnderco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
    
}
