package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.CursoDTO;
import dev.gildeonbs.champifs.entities.CursoEntity;
import dev.gildeonbs.champifs.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Transactional(readOnly = true)
    public List<CursoDTO> findAll() {
        List<CursoEntity> result = cursoRepository.findAll();
        List<CursoDTO> cursoDTOS = result.stream().map(x -> new CursoDTO(x)).toList();
        return cursoDTOS;
    }
}
