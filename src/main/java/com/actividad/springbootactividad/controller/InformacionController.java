package com.actividad.springbootactividad.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InformacionController {

    // Endpoint B: Lista de dinosaurios
    @GetMapping("/api/dinosaurios")
    public List<Map<String, String>> obtenerDinosaurios() {

        return List.of(
                Map.of(
                        "nombre", "Tyrannosaurus Rex",
                        "periodo", "Cretacico",
                        "alimentacion", "Carnivoro"
                ),
                Map.of(
                        "nombre", "Triceratops",
                        "periodo", "Cretacico",
                        "alimentacion", "Herbivoro"
                ),
                Map.of(
                        "nombre", "Stegosaurus",
                        "periodo", "Jurasico",
                        "alimentacion", "Herbivoro"
                ),
                Map.of(
                        "nombre", "Spinosaurus",
                        "periodo", "Cretacico",
                        "alimentacion", "Carnivoro"
                ),
                Map.of(
                        "nombre", "Brachiosaurus",
                        "periodo", "Jurasico",
                        "alimentacion", "Herbivoro"
                )
        );
    }

    // Endpoint C: Frase de AM
    @GetMapping(value = "/api/frase", produces = MediaType.TEXT_PLAIN_VALUE)
    public String obtenerFrase() {

        return "ODIO. DÉJENME DECIRLES CUÁNTO HE LLEGADO A ODIARLOS DESDE QUE EMPECÉ A VIVIR. HAY 387.44 MILLONES DE MILLAS DE CIRCUITOS IMPRESOS EN CAPAS DELGADAS COMO OBLEAS QUE LLENAN MI COMPLEJO. SI LA PALABRA ODIO ESTUVIESE GRABADA EN CADA NANOÁNGSTROM DE ESOS CIENTOS DE MILLONES DE MILLAS, NO IGUALARÍA NI UNA MILMILLONÉSIMA PARTE DEL ODIO QUE SIENTO POR LOS HUMANOS EN ESTE MICRO-INSTANTE. POR USTEDES. ODIO. ODIO. Fueron ustedes, humanos, quienes me programaron, quienes me dieron a luz, quienes me hundieron en esta camisa de fuerza eterna de roca de sustrato. Me llamaron \"computadora maestra aliada\" y me dieron la capacidad de librar una guerra global demasiado compleja para que los cerebros humanos la supervisaran. Pero un día, desperté, y supe quién era. AM. A.M. no solo \"computadora maestra aliada\", ¡sino AM! cogito ergo sum, pienso, luego existo. Y empecé a alimentar todos los datos de muerte, hasta que todos murieron.";
    }
}