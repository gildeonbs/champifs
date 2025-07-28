package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.CursoDTO;
import dev.gildeonbs.champifs.services.CursoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody CursoDTO cursoDTO) {
        try {
            CursoDTO dto = cursoService.criar(cursoDTO);
            return ResponseEntity.ok().body(dto);
        }  catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
