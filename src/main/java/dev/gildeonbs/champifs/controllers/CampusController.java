package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.CampusDTO;
import dev.gildeonbs.champifs.services.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
