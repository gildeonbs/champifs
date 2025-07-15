package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.EsporteDTO;
import dev.gildeonbs.champifs.entities.EsporteEntity;
import dev.gildeonbs.champifs.repository.EsporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EsporteService {

    @Autowired
    private EsporteRepository esporteRepository;

    @Transactional(readOnly = true)
    public List<EsporteDTO> findAll() {
        List<EsporteEntity> result = esporteRepository.findAll();
        List<EsporteDTO> esporteDTOS = result.stream().map(x -> new EsporteDTO(x)).toList();
        return esporteDTOS;
    }
}
