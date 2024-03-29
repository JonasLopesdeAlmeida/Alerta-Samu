package br.com.isl.alertasamu.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.isl.alertasamu.model.Atendimento;
import br.com.isl.alertasamu.services.AtendimentoService;


@RestController
@RequestMapping(value="/Atendimentos")
public class AtendimentoController {

	
	@Autowired
	private AtendimentoService aten;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Atendimento>> listar() {
		List<Atendimento> atendimento = aten.buscartodos();
		return ResponseEntity.ok().body(atendimento);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Atendimento>find(@PathVariable Long id) {
		Atendimento obj = aten.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Atendimento obj) {
		obj = aten.inserir(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void>update(@RequestBody Atendimento obj,@PathVariable Long id) {
		obj.setId(id);
		aten.atualizar(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void>delete(@PathVariable Long id) {
		aten.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
}
