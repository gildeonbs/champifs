package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.CoordenadorDTO;
import dev.gildeonbs.champifs.services.CoordenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/coordenadores")
public class CoordenadorController {

    @Autowired
    private CoordenadorService coordenadorService;

    @GetMapping
    public List<CoordenadorDTO> findAll() {
        List<CoordenadorDTO> result = coordenadorService.findAll();
        return result;
    }
}
