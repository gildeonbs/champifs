package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.EquipeDTO;
import dev.gildeonbs.champifs.entities.EquipeEntity;
import dev.gildeonbs.champifs.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    EquipeRepository equipeRepository;

    @Transactional(readOnly = true)
    public List<EquipeDTO> findAll() {
        List<EquipeEntity> result = equipeRepository.findAll();
        List<EquipeDTO> equipeDTOS = result.stream().map(x -> new EquipeDTO(x)).toList();
        return equipeDTOS;
    }
}
