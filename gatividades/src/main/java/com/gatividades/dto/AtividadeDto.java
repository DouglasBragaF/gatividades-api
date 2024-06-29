package com.gatividades.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import com.gatividades.model.Atividade;

public record AtividadeDto(
    Long id,
    LocalDate data,
    LocalTime horaInicio,
    LocalTime horaFim,
    String projeto,
    String cliente,
    String atividade,
    String observacao) {
  public static AtividadeDto toDto(Atividade atividade) {
    return new AtividadeDto(
        atividade.getId(),
        atividade.getData(),
        atividade.getHoraInicio(),
        atividade.getHoraFim(),
        atividade.getProjeto(),
        atividade.getCliente(),
        atividade.getAtividade(),
        atividade.getObservacao());
  }
}
