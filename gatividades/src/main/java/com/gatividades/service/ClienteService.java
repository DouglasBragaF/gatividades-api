package com.gatividades.service;

import com.gatividades.model.Cliente;
import com.gatividades.repository.ClienteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  public Cliente salvarCliente(Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  public Cliente buscarClientePorId(Long id) {
    return clienteRepository.findById(id).orElse(null);
  }

  public void deletarCliente(Long id) {
    clienteRepository.deleteById(id);
  }

  public List<Cliente> listarClientes() {
    return clienteRepository.findAll();
  }
}
