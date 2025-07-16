package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.AtletaDTO;
import dev.gildeonbs.champifs.entities.AtletaEntity;
import dev.gildeonbs.champifs.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    @Transactional(readOnly = true)
    public List<AtletaDTO> findAll() {
        List<AtletaEntity> result = atletaRepository.findAll();
        List<AtletaDTO> atletaDTOs = result.stream().map(x -> new AtletaDTO(x)).toList();
        return atletaDTOs;
    }
}
