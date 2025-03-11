package com.utad.examen.concesonario.controller;


import com.utad.examen.concesonario.dto.CocheDTO;
import com.utad.examen.concesonario.dto.UsuarioDTO;
import com.utad.examen.concesonario.service.CocheService;
import com.utad.examen.concesonario.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coche")
public class CocheController {

    @Autowired
    private CocheService cocheService;

    @GetMapping
    public List<CocheDTO> getAll() {
        return cocheService.findAll();
    }

    @PostMapping
    public ResponseEntity<CocheDTO> createCoche(@Valid @RequestBody CocheDTO cocheDTO) {
        return ResponseEntity.ok(cocheService.createCoche(cocheDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> createCoche(@PathVariable Long id) {
        cocheService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
