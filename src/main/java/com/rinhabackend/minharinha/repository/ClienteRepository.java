package com.rinhabackend.minharinha.repository;

import com.rinhabackend.minharinha.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
