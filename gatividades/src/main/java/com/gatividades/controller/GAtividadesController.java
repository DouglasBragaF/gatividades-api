package com.gatividades.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gatividades.dto.AtividadeDto;
import com.gatividades.service.AtividadeService;

@RestController
@RequestMapping("/gatividades")
public class GAtividadesController {

  @Autowired
  private AtividadeService service;

  @GetMapping
  public ResponseEntity<List<AtividadeDto>> listarAtividades() {
    return ResponseEntity.ok(service.listarAtividades());
  }

  @GetMapping("/{id}")
  public ResponseEntity<AtividadeDto> obterAtividadePorId(@PathVariable Long id) {
    Optional<AtividadeDto> atividade = service.obterAtividadePorId(id);
    return atividade.map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<AtividadeDto> registrarAtividade(@RequestBody AtividadeDto atividadeDto) {
    AtividadeDto atividadeSalva = service.registrarAtividade(atividadeDto);
    return ResponseEntity.ok(atividadeSalva);
  }

  @PutMapping("/{id}")
  public ResponseEntity<AtividadeDto> atualizarAtividade(@PathVariable Long id,
      @RequestBody AtividadeDto atividadeDto) {
    Optional<AtividadeDto> atividadeAtualizada = service.atualizarAtividade(id, atividadeDto);
    return atividadeAtualizada.map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletarAtividade(@PathVariable Long id) {
    if (service.deletarAtividade(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
