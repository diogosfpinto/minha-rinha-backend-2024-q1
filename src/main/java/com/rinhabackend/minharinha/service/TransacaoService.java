package com.rinhabackend.minharinha.service;

import com.rinhabackend.minharinha.dto.RespostaTransacaoDTO;
import com.rinhabackend.minharinha.dto.TransacaoDTO;
import com.rinhabackend.minharinha.model.Cliente;
import com.rinhabackend.minharinha.model.Transacao;
import com.rinhabackend.minharinha.repository.ClienteRepository;
import com.rinhabackend.minharinha.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public RespostaTransacaoDTO novaTransacao(TransacaoDTO transacaoDTO, Cliente cliente) {
        Integer saldo = cliente.getSaldo();

        Transacao transacao = new Transacao();
        transacao.setDescricao(transacaoDTO.descricao());
        transacao.setTipo(transacaoDTO.tipo());
        transacao.setValor(transacaoDTO.valor());
        transacao.setRealizada_em(LocalDateTime.now());

        if(transacaoDTO.tipo().equals("c")){
            saldo = saldo + transacaoDTO.valor();
            cliente.setSaldo(saldo);
            transacaoRepository.save(transacao);
        } else if (transacaoDTO.tipo().equals("d")){
            saldo = saldo - transacaoDTO.valor();
            cliente.setSaldo(saldo);
            transacaoRepository.save(transacao);
        }

        return new RespostaTransacaoDTO(cliente.getLimite(), cliente.getSaldo());
    }
}
