package dev.gildeonbs.champifs.controllers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import dev.gildeonbs.champifs.dto.EventoDTO;
import dev.gildeonbs.champifs.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<EventoDTO> findAll() {
        List<EventoDTO> result = eventoService.findAll();
        return result;
    }
}
