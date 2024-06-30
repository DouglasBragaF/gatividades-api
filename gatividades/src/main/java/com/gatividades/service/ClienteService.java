package com.gatividades.service;

import com.gatividades.dto.ClienteDto;
import com.gatividades.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  public Optional<ClienteDto> buscarClientePorId(Long id) {
    return clienteRepository.findById(id).map(ClienteDto::toDto);
  }

  public List<ClienteDto> listarClientes() {
    return clienteRepository.findAll().stream()
        .map(ClienteDto::toDto)
        .collect(Collectors.toList());
  }
}
