package com.gatividades.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import com.gatividades.model.Atividade;

public record AtividadeDto(
    Long id,
    LocalDate data,
    LocalTime horaInicio,
    LocalTime horaFim,
    String descricao,
    String observacoes) {
  public static AtividadeDto toDto(Atividade atividade) {
    return new AtividadeDto(
        atividade.getId(),
        atividade.getData(),
        atividade.getHoraInicio(),
        atividade.getHoraFim(),
        atividade.getDescricao(),
        atividade.getObservacoes());
  }

  public Atividade toEntity() {
    return new Atividade(
        this.data(),
        this.horaInicio(),
        this.horaFim(),
        this.descricao(),
        this.observacoes());
  }
}
