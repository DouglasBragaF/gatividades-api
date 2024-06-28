package com.gatividades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatividades.dto.AtividadeDto;
import com.gatividades.service.AtividadeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    AtividadeDto atividade = service.obterAtividadePorId(id);
    if (atividade != null) {
      return ResponseEntity.ok(atividade);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<AtividadeDto> registrarAtividade(@RequestBody AtividadeDto atividadeDto) {
    return ResponseEntity.ok(service.registrarAtividade(atividadeDto));
  }

  @PutMapping("/{id}")
  public ResponseEntity<AtividadeDto> atualizarAtividade(@PathVariable Long id,
      @RequestBody AtividadeDto atividadeDto) {
    AtividadeDto atividadeAtualizada = service.atualizarAtividade(id, atividadeDto);
    if (atividadeAtualizada != null) {
      return ResponseEntity.ok(atividadeAtualizada);
    } else {
      return ResponseEntity.notFound().build();
    }
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
