package com.gatividades.service;

import com.gatividades.dto.AtividadeDto;
import com.gatividades.model.Atividade;
import com.gatividades.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AtividadeService {

  @Autowired
  private AtividadeRepository atividadeRepository;

  public AtividadeDto registrarAtividade(AtividadeDto atividadeDto) {
    Atividade atividade = mapToEntity(atividadeDto);
    Atividade savedAtividade = atividadeRepository.save(atividade);
    return AtividadeDto.toDto(savedAtividade);
  }

  public List<AtividadeDto> listarAtividades() {
    return atividadeRepository.findAll().stream()
        .map(AtividadeDto::toDto)
        .collect(Collectors.toList());
  }

  public Optional<AtividadeDto> obterAtividadePorId(Long id) {
    return atividadeRepository.findById(id).map(AtividadeDto::toDto);
  }

  public Optional<AtividadeDto> atualizarAtividade(Long id, AtividadeDto atividadeDto) {
    if (atividadeRepository.existsById(id)) {
      Atividade atividade = mapToEntity(atividadeDto);
      atividade.setId(id);
      Atividade updatedAtividade = atividadeRepository.save(atividade);
      return Optional.of(AtividadeDto.toDto(updatedAtividade));
    } else {
      return Optional.empty();
    }
  }

  public boolean deletarAtividade(Long id) {
    if (atividadeRepository.existsById(id)) {
      atividadeRepository.deleteById(id);
      return true;
    } else {
      return false;
    }
  }

  private Atividade mapToEntity(AtividadeDto atividadeDto) {
    return new Atividade(
        atividadeDto.id(),
        atividadeDto.data(),
        atividadeDto.horaInicio(),
        atividadeDto.horaFim(),
        atividadeDto.projeto(),
        atividadeDto.usuarioId(),
        atividadeDto.atividade(),
        atividadeDto.observacao());
  }
}
