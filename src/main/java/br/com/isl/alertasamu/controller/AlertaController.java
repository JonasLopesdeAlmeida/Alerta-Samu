package br.com.isl.alertasamu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isl.alertasamu.model.Alerta;
import br.com.isl.alertasamu.repository.AlertaRepository;

@RestController
@RequestMapping("/alertas")
public class AlertaController {
	
	@Autowired
	private AlertaRepository alertaRepository;
	
	@GetMapping
	public ResponseEntity<List<Alerta>> listar() {
		List<Alerta> alertas = alertaRepository.findAll();
		return new ResponseEntity<>(alertas, HttpStatus.OK);
	}
	
	
	
}
