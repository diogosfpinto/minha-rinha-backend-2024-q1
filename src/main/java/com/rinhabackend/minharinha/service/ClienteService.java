package com.rinhabackend.minharinha.service;

import com.rinhabackend.minharinha.model.Cliente;
import com.rinhabackend.minharinha.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente getClienteById(Integer id){
        Cliente cliente = clienteRepository.getReferenceById(id);
        return cliente;
    }
}
