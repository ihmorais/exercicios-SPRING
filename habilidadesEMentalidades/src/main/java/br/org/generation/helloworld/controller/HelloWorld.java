/*A aplicação deverá conter um end-point que retorna
uma string com as habilidades e mentalidades que você
utilizou para realizar essa atividade.

 */package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloWorld {
	@GetMapping
	public String hello() {
		return "Habilidades e Mentalidades trabalhadas: Persistência, Atenção aos detalhes, Orientação ao futuro e Comunicação";
	}
}
