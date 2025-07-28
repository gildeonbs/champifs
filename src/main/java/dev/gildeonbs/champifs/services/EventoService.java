package dev.gildeonbs.champifs.services;

import dev.gildeonbs.champifs.dto.EventoDTO;
import dev.gildeonbs.champifs.entities.EventoEntity;
import dev.gildeonbs.champifs.repository.EventoRepository;
import dev.gildeonbs.champifs.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;
    @Autowired
    private GrupoRepository grupoRepository;
    @Autowired
    private GrupoService grupoService;

    @Transactional(readOnly = true)
    public List<EventoDTO> findAll() {
        List<EventoEntity> result = eventoRepository.findAll();
        List<EventoDTO> eventoDTOS = result.stream().map(x -> new EventoDTO(x)).toList();
        return eventoDTOS;
    }

    //@Transactional
    //public void sortearGrupos(Long idEvento) {
        //grupoService.sortear(idEvento);
    //}

}
