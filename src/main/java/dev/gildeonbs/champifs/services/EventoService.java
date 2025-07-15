package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.EquipeDTO;
import dev.gildeonbs.champifs.dto.EventoDTO;
import dev.gildeonbs.champifs.entities.EventoEntity;
import dev.gildeonbs.champifs.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Transactional(readOnly = true)
    public List<EventoDTO> findAll() {
        List<EventoEntity> result = eventoRepository.findAll();
        List<EventoDTO> eventoDTOS = result.stream().map(x -> new EventoDTO(x)).toList();
        return eventoDTOS;
    }
}
