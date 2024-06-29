package com.gatividades.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atividade")
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
  private String atividade;

  @Column(nullable = false)
  private String observacao;

  @Column(nullable = false)
  private String projeto;

  @Column(nullable = false)
  private String cliente;

  public Atividade() {
  }

  public Atividade(LocalDate data, LocalTime horaInicio, LocalTime horaFim, String projeto, String cliente,
      String atividade, String observacao) {
    this.data = data;
    this.horaInicio = horaInicio;
    this.horaFim = horaFim;
    this.projeto = projeto;
    this.cliente = cliente;
    this.atividade = atividade;
    this.observacao = observacao;
  }

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

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
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
