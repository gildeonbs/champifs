package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.CampusDTO;
import dev.gildeonbs.champifs.entities.CampusEntity;
import dev.gildeonbs.champifs.services.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/campi")
public class CampusController {

    @Autowired
    private CampusService campusService;

    @GetMapping
    public List<CampusDTO> findAll() {
        List<CampusDTO> result = campusService.findAll();
        return result;
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody CampusDTO campusDTO) {
        try {
            CampusDTO dto = campusService.criar(campusDTO);
            return ResponseEntity.ok().body(dto);
        } catch (IllegalStateException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

}
