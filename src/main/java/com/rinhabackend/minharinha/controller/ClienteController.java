package com.rinhabackend.minharinha.controller;

import com.rinhabackend.minharinha.dto.ExtratoDTO;
import com.rinhabackend.minharinha.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes/{id}/extrato")
    public ResponseEntity<ExtratoDTO> gerarExtrato(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(clienteService.geraExtratoTransacoes(id));
    }
}
