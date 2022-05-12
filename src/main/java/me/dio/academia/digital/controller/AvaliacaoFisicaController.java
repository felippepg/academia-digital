package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaService service;
    @GetMapping
    public List<AvaliacaoFisica> getAllAvaliacoes() {
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica createAvaliacaoFIsica(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }
}
