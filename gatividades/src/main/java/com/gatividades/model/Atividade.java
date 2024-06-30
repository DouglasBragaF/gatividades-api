package com.gatividades.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity
@Table(name = "atividades")
public class Atividade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private LocalDate data;

  @Column(nullable = false)
  private LocalTime horaInicio;

  @Column(nullable = false)
  private LocalTime horaFim;

  @Column(nullable = false)
  private String projeto;

  @Column(nullable = false)
  private Long usuarioId;

  @Column(nullable = false)
  private String atividade;

  @Column(nullable = false)
  private String observacao;

  public Atividade() {
  }

  public Atividade(Long id, LocalDate data, LocalTime horaInicio, LocalTime horaFim, String projeto, Long usuarioId,
      String atividade, String observacao) {
    this.id = id;
    this.data = data;
    this.horaInicio = horaInicio;
    this.horaFim = horaFim;
    this.projeto = projeto;
    this.usuarioId = usuarioId;
    this.atividade = atividade;
    this.observacao = observacao;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public LocalTime getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(LocalTime horaInicio) {
    this.horaInicio = horaInicio;
  }

  public LocalTime getHoraFim() {
    return horaFim;
  }

  public void setHoraFim(LocalTime horaFim) {
    this.horaFim = horaFim;
  }

  public String getProjeto() {
    return projeto;
  }

  public void setProjeto(String projeto) {
    this.projeto = projeto;
  }

  public Long getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Long usuarioId) {
    this.usuarioId = usuarioId;
  }

  public String getAtividade() {
    return atividade;
  }

  public void setAtividade(String atividade) {
    this.atividade = atividade;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }
}
