package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.EquipeDTO;
import dev.gildeonbs.champifs.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/equipes")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    @GetMapping
    public List<EquipeDTO> findAll() {
        List<EquipeDTO> result = equipeService.findAll();
        return result;
    }
}
