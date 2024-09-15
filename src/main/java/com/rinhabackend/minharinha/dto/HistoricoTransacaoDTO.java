package com.rinhabackend.minharinha.dto;

import java.time.LocalDateTime;

public record HistoricoTransacaoDTO(Integer valor, String tipo, String descricao, LocalDateTime realizada_em) {
}
