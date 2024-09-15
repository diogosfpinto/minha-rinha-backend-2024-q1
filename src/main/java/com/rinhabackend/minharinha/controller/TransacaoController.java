package com.rinhabackend.minharinha.controller;

import com.rinhabackend.minharinha.dto.RespostaTransacaoDTO;
import com.rinhabackend.minharinha.dto.TransacaoDTO;
import com.rinhabackend.minharinha.model.Cliente;
import com.rinhabackend.minharinha.service.ClienteService;
import com.rinhabackend.minharinha.service.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransacaoController {


    @Autowired
    private ClienteService clienteService;
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/clientes/{id}/transacoes")
    public ResponseEntity<RespostaTransacaoDTO> novaTransacao(@Valid @RequestBody TransacaoDTO transacaoDTO,
                                                              @PathVariable(name = "id") Integer id) {

        Cliente cliente = clienteService.getClienteById(id);

        return ResponseEntity.ok(transacaoService.novaTransacao(transacaoDTO, cliente));
    }
}
