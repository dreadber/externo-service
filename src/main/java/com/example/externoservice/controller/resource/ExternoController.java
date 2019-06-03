package com.example.externoservice.controller.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ExternoController {

    @GetMapping(path = "/externo")
    public String obtenerExterno() {
        return "Mensaje Externo";
    }

}
