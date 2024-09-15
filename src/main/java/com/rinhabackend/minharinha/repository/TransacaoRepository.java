package com.rinhabackend.minharinha.repository;

import com.rinhabackend.minharinha.model.Cliente;
import com.rinhabackend.minharinha.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {

    List<Transacao> findAllByCliente(Cliente cliente);

}
