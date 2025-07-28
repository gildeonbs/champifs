package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.AtletaDTO;
import dev.gildeonbs.champifs.entities.AtletaEntity;
import dev.gildeonbs.champifs.entities.EquipeEntity;
import dev.gildeonbs.champifs.repository.AtletaRepository;
import dev.gildeonbs.champifs.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AtletaService {

   @Autowired
    private AtletaRepository atletaRepository;
    @Autowired
    private EquipeRepository equipeRepository;

    @Transactional(readOnly = true)
    public List<AtletaDTO> findAll() {
        List<AtletaEntity> result = atletaRepository.findAll();
        List<AtletaDTO> atletaDTOs = result.stream().map(x -> new AtletaDTO(x)).toList();
        return atletaDTOs;
    }

    @Transactional
    public AtletaDTO criar(AtletaDTO dto) {
        if (atletaRepository.existsByMatricula(dto.getMatricula())) {
            throw new IllegalStateException("Já existe atleta para esse matricula.");
        }

        AtletaEntity entity = new AtletaEntity();
        entity.setNomeCompleto(dto.getNomeCompleto());
        entity.setApelido(dto.getApelido());
        entity.setMatricula(dto.getMatricula());
        entity.setTelefone(dto.getTelefone());
        entity.setSenhaHash(dto.getSenhaHash());
        entity.setTipo(dto.getTipo());

        if ("tecnico".equalsIgnoreCase(dto.getTipo()) && dto.getEquipe().getId() == null) {
            throw new IllegalStateException("Técnico precisa estar vinculado a uma equipe.");
        }

        if (dto.getEquipe().getId() != null) {
            EquipeEntity equipe = equipeRepository.findById(dto.getEquipe().getId())
                    .orElseThrow(() -> new IllegalStateException("Equipe não encontrada"));
            entity.setEquipe(equipe);
        }

        entity = atletaRepository.save(entity);
        return new AtletaDTO(entity);
    }



}
