package com.rinhabackend.minharinha.repository;

import com.rinhabackend.minharinha.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {

}
