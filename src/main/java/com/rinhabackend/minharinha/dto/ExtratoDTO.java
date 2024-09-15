package com.rinhabackend.minharinha.dto;

import java.util.List;

public record ExtratoDTO(SaldoExtratoDTO saldo, List<HistoricoTransacaoDTO> ultimas_transacoes) {
}
