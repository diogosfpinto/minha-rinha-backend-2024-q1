package com.rinhabackend.minharinha.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Cliente cliente;
    private Integer valor;
    private String tipo;
    private String descricao;
    private LocalDateTime realizada_em;
}
