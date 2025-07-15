package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.AtletaDTO;
import dev.gildeonbs.champifs.services.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/atletas")
public class AtletaController {

    @Autowired
    private AtletaService atletaService;

    @GetMapping
    public List<AtletaDTO> findAll() {
        List<AtletaDTO> result = atletaService.findAll();
        return result;
    }

}
