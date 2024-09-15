package com.rinhabackend.minharinha.dto;

import java.time.LocalDateTime;

public record SaldoExtratoDTO(Integer total, LocalDateTime data_extrato, Integer limite) {
}
