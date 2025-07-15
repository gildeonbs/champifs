package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.GrupoDTO;
import dev.gildeonbs.champifs.entities.GrupoEntity;
import dev.gildeonbs.champifs.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    @Transactional(readOnly = true)
    public List<GrupoDTO> findAll() {
        List<GrupoEntity> result = grupoRepository.findAll();
        List<GrupoDTO> grupoDTOS = result.stream().map(x -> new GrupoDTO(x)).toList();
        return grupoDTOS;
    }
}
