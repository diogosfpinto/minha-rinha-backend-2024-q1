package com.rinhabackend.minharinha.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record TransacaoDTO(
        @Min(0)
        @NotNull
        Integer valor,
        @Pattern(regexp = "^[dc]$")
        @NotNull
        @NotBlank
        String tipo,
        @NotNull
        @NotBlank
        String descricao) {
}
