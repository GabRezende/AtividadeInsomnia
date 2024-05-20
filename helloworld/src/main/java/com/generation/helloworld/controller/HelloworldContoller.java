package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloworldContoller {

	@GetMapping
	public String ola() {
		return "Ola mundo! bom dia! ";
	}
	
	@GetMapping("BSM's")
	public String BSM () {
		return "persistência, "
				+ "\ntrabalho em equipe, "
				+ "\nproativiidade, "
				+ "\norientação ao futuro, "
				+ "\natenção ao detalhe, "
				+ "\nresponsabilidade pessoal, "
				+ "\ncomunicação, "
				+ "\nmentalidade de crescimento, "
				+ "\ncomunicação não violenta ";
		
	}
	
	@GetMapping("objetivos")
	public String objetivos () {
		return "Meu principal objetivo da semana é desenvolver a comunicação!";
		
	}
}
