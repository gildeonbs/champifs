package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.ArbitroDTO;
import dev.gildeonbs.champifs.entities.ArbitroEntity;
import dev.gildeonbs.champifs.repository.ArbitroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArbitroService {

    @Autowired
    private ArbitroRepository arbitroRepository;

    @Transactional(readOnly = true)
    public List<ArbitroDTO> findAll() {
        List<ArbitroEntity> result = arbitroRepository.findAll();
        List<ArbitroDTO> arbitroDTOs = result.stream().map(x -> new ArbitroDTO(x)).toList();
        return arbitroDTOs;
    }

    @Transactional
    public ArbitroDTO criar(ArbitroDTO dto) {
        if (arbitroRepository.existsByMatricula(dto.getMatricula())) {
            throw new IllegalStateException("Já existe árbitro para esse matricula.");
        }

        ArbitroEntity arbitroEntity = new ArbitroEntity();
        arbitroEntity.setNome(dto.getNome());
        arbitroEntity.setMatricula(dto.getMatricula());
        arbitroEntity.setSenha(dto.getNome());

        return new ArbitroDTO(arbitroRepository.save(arbitroEntity));
    }
}
