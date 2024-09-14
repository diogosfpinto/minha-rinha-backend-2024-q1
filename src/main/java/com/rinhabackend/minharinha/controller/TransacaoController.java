package com.rinhabackend.minharinha.controller;

import com.rinhabackend.minharinha.dto.RespostaTransacaoDTO;
import com.rinhabackend.minharinha.dto.TransacaoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacaoController {

    @PostMapping("/clientes/{id}/transacoes")
    public ResponseEntity<RespostaTransacaoDTO> novaTransacao(@RequestBody TransacaoDTO transacaoDTO){
        return ResponseEntity.ok(new RespostaTransacaoDTO(1, 1));
    }
}
