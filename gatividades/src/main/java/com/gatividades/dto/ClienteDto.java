package com.gatividades.dto;

import com.gatividades.model.Cliente;

public record ClienteDto(
    Long id,
    String nome,
    String cnpj,
    String contato) {

  public static ClienteDto toDto(Cliente cliente) {
    return new ClienteDto(
        cliente.getId(),
        cliente.getNome(),
        cliente.getCnpj(),
        cliente.getContato());
  }

  public static Cliente toEntity(ClienteDto clienteDto) {
    return new Cliente(
        clienteDto.id(),
        clienteDto.nome(),
        clienteDto.cnpj(),
        clienteDto.contato());
  }
}
