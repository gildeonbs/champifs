package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.EquipeDTO;
import dev.gildeonbs.champifs.entities.CursoEntity;
import dev.gildeonbs.champifs.entities.EquipeEntity;
import dev.gildeonbs.champifs.entities.EsporteEntity;
import dev.gildeonbs.champifs.entities.EventoEntity;
import dev.gildeonbs.champifs.repository.CursoRepository;
import dev.gildeonbs.champifs.repository.EquipeRepository;
import dev.gildeonbs.champifs.repository.EsporteRepository;
import dev.gildeonbs.champifs.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private EsporteRepository esporteRepository;
    @Autowired
    private EventoRepository eventoRepository;

    @Transactional(readOnly = true)
    public List<EquipeDTO> findAll() {
        List<EquipeEntity> result = equipeRepository.findAll();
        List<EquipeDTO> equipeDTOS = result.stream().map(x -> new EquipeDTO(x)).toList();
        return equipeDTOS;
    }

    @Transactional
    public EquipeDTO criar(EquipeDTO dto) {
        if (equipeRepository.existsByCurso_IdAndEsporte_IdAndEvento_Id(dto.getCurso().getId(), dto.getEsporte().getId(), dto.getEvento().getId())) {
            throw new RuntimeException("Já existe equipe para esse curso, esporte e evento.");
        }

        CursoEntity curso = cursoRepository.findById(dto.getCurso().getId())
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));
        EsporteEntity esporte = esporteRepository.findById(dto.getEsporte().getId())
                .orElseThrow(() -> new RuntimeException("Esporte não encontrado"));
        EventoEntity evento = eventoRepository.findById(dto.getEvento().getId())
                .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

        EquipeEntity entity = new EquipeEntity();
        entity.setCurso(curso);
        entity.setEsporte(esporte);
        entity.setEvento(evento);

        entity = equipeRepository.save(entity);
        return new EquipeDTO(entity);
    }

}
