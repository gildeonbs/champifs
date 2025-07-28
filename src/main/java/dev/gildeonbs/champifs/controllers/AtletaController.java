package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.AtletaDTO;
import dev.gildeonbs.champifs.services.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody AtletaDTO atletaDTO) {
        try {
            AtletaDTO dto =  atletaService.criar(atletaDTO);
            return ResponseEntity.ok().body(dto);
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
