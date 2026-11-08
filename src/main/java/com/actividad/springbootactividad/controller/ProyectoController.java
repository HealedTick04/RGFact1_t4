package com.actividad.springbootactividad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProyectoController {

    @GetMapping("/api/proyecto")
    public Map<String, String> obtenerProyecto() {
        return Map.of(
                "proyecto", "SpringBootActividad",
                "estudiante", "Fernando Rojas",
                "mensaje", "Spring Boot Funciona"
        );
    }
}