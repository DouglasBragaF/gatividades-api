package com.gatividades.dto;

import com.gatividades.model.Usuario;

public record UsuarioDto(Long id, String nome, String email) {

  public static UsuarioDto toDto(Usuario usuario) {
    return new UsuarioDto(
        usuario.getId(),
        usuario.getNome(),
        usuario.getEmail());
  }

  public static Usuario toEntity(UsuarioDto usuarioDto) {
    return new Usuario(
        usuarioDto.id(),
        usuarioDto.nome(),
        usuarioDto.email());
  }
}
