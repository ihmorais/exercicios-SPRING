/* A aplicação deverá conter um end-point que retorna
uma string com os seus objetivos de aprendizagem para
essa semana.*/
package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping	
	public String hello() {
		return "Objetivos de aprendizadem para essa semana: Compreender o básico de Spring e criar minha primeira API! ";
	}
}
