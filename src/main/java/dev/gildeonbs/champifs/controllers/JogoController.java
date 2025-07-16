package dev.gildeonbs.champifs.controllers;

import dev.gildeonbs.champifs.dto.JogoDTO;
import dev.gildeonbs.champifs.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public List<JogoDTO> findAll() {
        List<JogoDTO> result = jogoService.findAll();
        return result;
    }

}
