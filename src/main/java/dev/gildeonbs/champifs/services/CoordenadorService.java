package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.CoordenadorDTO;
import dev.gildeonbs.champifs.entities.CoordenadorEntity;
import dev.gildeonbs.champifs.repository.CoordenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoordenadorService {

    @Autowired
    private CoordenadorRepository coordenadorRepository;

    @Transactional(readOnly = true)
    public List<CoordenadorDTO> findAll() {
        List<CoordenadorEntity> result = coordenadorRepository.findAll();
        List<CoordenadorDTO> coordenadorDTOs = result.stream().map(x -> new CoordenadorDTO(x)).toList();
        return coordenadorDTOs;
    }
}
