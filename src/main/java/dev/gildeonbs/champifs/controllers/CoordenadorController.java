package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.CoordenadorDTO;
import dev.gildeonbs.champifs.services.ArbitroService;
import dev.gildeonbs.champifs.services.CoordenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody CoordenadorDTO coordenadorDTO) {
        try {
            CoordenadorDTO dto = coordenadorService.criar(coordenadorDTO);
            return ResponseEntity.ok().body(dto);
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
