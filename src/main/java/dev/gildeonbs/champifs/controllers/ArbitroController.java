package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.ArbitroDTO;
import dev.gildeonbs.champifs.services.ArbitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/arbitros")
public class ArbitroController {

    @Autowired
    private ArbitroService arbitroService;

    @GetMapping
    public List<ArbitroDTO> findAll() {
        List<ArbitroDTO> result = arbitroService.findAll();
        return result;
    }

}
