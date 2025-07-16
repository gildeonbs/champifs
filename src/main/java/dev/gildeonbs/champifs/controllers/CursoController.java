package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.CursoDTO;
import dev.gildeonbs.champifs.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<CursoDTO> findAll() {
        List<CursoDTO> result = cursoService.findAll();
        return result;
    }
}
