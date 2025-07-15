package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.ArbitroDTO;
import dev.gildeonbs.champifs.entities.ArbitroEntity;
import dev.gildeonbs.champifs.repository.ArbitroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ArbitroService {

    @Autowired
    private ArbitroRepository arbitroRepository;

    @Transactional(readOnly = true)
    public List<ArbitroDTO> findAll() {
        List<ArbitroEntity> result = arbitroRepository.findAll();
        List<ArbitroDTO> arbitroDTOS = result.stream().map(x -> new ArbitroDTO(x)).toList();
        return arbitroDTOS;
    }
}
