package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.ArbitroDTO;
import dev.gildeonbs.champifs.services.ArbitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody ArbitroDTO arbitroDTO) {
        try {
            ArbitroDTO dto = arbitroService.criar(arbitroDTO);
            return ResponseEntity.ok().body(dto);
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
