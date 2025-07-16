package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.EsporteDTO;
import dev.gildeonbs.champifs.services.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/esportes")
public class EsporteController {

    @Autowired
    private EsporteService esporteService;

    @GetMapping
    public List<EsporteDTO> findAll() {
        List<EsporteDTO> result = esporteService.findAll();
        return result;
    }
}
