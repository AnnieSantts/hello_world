package com.generation.HelloWorld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	
    @GetMapping
    public String objetivos() {
            return "1- Estudar polimorfismo\n"
            		+ "2- Praticar banco de dados \n"
            		+ "3- Estudar mais sobre Spring\n"
            		+ "4-Finalizar exercícios pendentes\n";
	
    }
}
