package com.gatividades.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatividades.dto.UsuarioDto;
import com.gatividades.repository.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public List<UsuarioDto> listarUsuarios() {
    return usuarioRepository.findAll().stream()
        .map(UsuarioDto::toDto)
        .collect(Collectors.toList());
  }

  public Optional<UsuarioDto> obterUsuarioPorId(Long id) {
    return usuarioRepository.findById(id).map(UsuarioDto::toDto);
  }
}
