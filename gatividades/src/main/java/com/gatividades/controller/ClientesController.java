package com.gatividades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatividades.dto.ClienteDto;
import com.gatividades.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

  @Autowired
  private ClienteService clienteService;

  @GetMapping
  public ResponseEntity<List<ClienteDto>> listarClientes() {
    List<ClienteDto> clientes = clienteService.listarClientes();
    return ResponseEntity.ok(clientes);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ClienteDto> buscarClientePorId(@PathVariable Long id) {
    return clienteService.buscarClientePorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }
}
