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
    Long idCliente,
    Long usuarioId,
    String atividade,
    String observacao) {

  public static AtividadeDto toDto(Atividade atividade) {
    return new AtividadeDto(
        atividade.getId(),
        atividade.getData(),
        atividade.getHoraInicio(),
        atividade.getHoraFim(),
        atividade.getProjeto(),
        atividade.getIdCliente(),
        atividade.getUsuarioId(),
        atividade.getAtividade(),
        atividade.getObservacao());
  }

  public static Atividade toEntity(AtividadeDto atividadeDto) {
    return new Atividade(
        atividadeDto.id(),
        atividadeDto.data(),
        atividadeDto.horaInicio(),
        atividadeDto.horaFim(),
        atividadeDto.projeto(),
        atividadeDto.idCliente(), // Mapeamento do campo idCliente
        atividadeDto.usuarioId(),
        atividadeDto.atividade(),
        atividadeDto.observacao());
  }
}
