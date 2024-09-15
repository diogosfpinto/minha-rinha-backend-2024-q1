package com.rinhabackend.minharinha.service;

import com.rinhabackend.minharinha.dto.ExtratoDTO;
import com.rinhabackend.minharinha.dto.HistoricoTransacaoDTO;
import com.rinhabackend.minharinha.dto.SaldoExtratoDTO;
import com.rinhabackend.minharinha.model.Cliente;
import com.rinhabackend.minharinha.model.Transacao;
import com.rinhabackend.minharinha.repository.ClienteRepository;
import com.rinhabackend.minharinha.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TransacaoRepository transacaoRepository;

    public Cliente getClienteById(Integer id){
        return clienteRepository.getReferenceById(id);
    }

    public ExtratoDTO geraExtratoTransacoes(Integer id){
        Cliente cliente = getClienteById(id);

        SaldoExtratoDTO saldoExtratoDTO = new SaldoExtratoDTO(cliente.getSaldo(), LocalDateTime.now(), cliente.getLimite());
        List<Transacao> transacoes = transacaoRepository.findAllByCliente(cliente);

        List<HistoricoTransacaoDTO> historicoTransacaoDTOS = transacoes.stream().map(transacao ->
                        new HistoricoTransacaoDTO(
                                transacao.getValor(),
                                transacao.getTipo(),
                                transacao.getDescricao(),
                                transacao.getRealizada_em()))
                .toList();

        return new ExtratoDTO(saldoExtratoDTO, historicoTransacaoDTOS);
    }
}
