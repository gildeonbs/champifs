package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.GrupoDTO;
import dev.gildeonbs.champifs.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/grupos")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping
    public List<GrupoDTO> findAll() {
        List<GrupoDTO> result = grupoService.findAll();
        return result;
    }
}
