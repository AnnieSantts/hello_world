package com.generation.HelloWorld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BsmController {

	    @GetMapping
	    public String helloWorld() {
	            return " PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades\r\n"
	                    + " PT - BSM-GM - Mentalidade de Crescimento\r\n"
	                    + " PT - BSM-P - Persistência\r\n"
	                    + " PT - BSM-PR - Responsabilidade Pessoal\r\n"
	                    + "PT - BSM-FO - Orientação ao Futuro\r\n"
	                    + " PT - BSM-C - Comunicação\r\n"
	                    + "PT - BSM-OD - Orientação ao Detalhe\r\n"
	                    + "PT - BSM-PA - Proatividade"
	                    + "PT - BSM-T - Trabalho em Equipe"
	                    + " PT - C-GG - Dar e Receber"
	                    + " PT - SA-CS1 - Estudo de Caso 1: Força de Trabalho Distribuída"
	                    + "PT - SA-CS2 - Estudo de Caso 2: Entregável Urgente"
	                    + " PT - SA-CS3 - Estudo de Caso 3: Novas Habilidades Necessárias"
	                    + "PT - SA-CS4 - Estudo de Caso 4: Aprender e Compartilhar;\n"
	                    + "PT - SSM-TM - Gestão do Tempo;\n"
	                    + "PT - SSM-IV - Introdução à VIA e a Descoberta das Forças de Caráter VIA;\n"
	                    + "PT - SSM-RLW - Maximizar a Aprendizagem Online e o Trabalho Remoto;\n\n"

	                    + "----------------------------Encerramento-----------------------------------";

	        
	    
	    }
}
