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

import br.com.isl.alertasamu.model.Alerta;
import br.com.isl.alertasamu.services.AlertaService;

@RestController
@RequestMapping(value="/Alertas")
public class AlertaController {

	
	
		
		@Autowired
		private AlertaService serv;
		
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<List<Alerta>> listar() {
			List<Alerta> Alerta = serv.buscartodos();
			return ResponseEntity.ok().body(Alerta);
		}
		
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<Alerta>find(@PathVariable Long id) {
			Alerta obj = serv.buscar(id);
			return ResponseEntity.ok().body(obj);
		}
		@RequestMapping(method = RequestMethod.POST)
		public ResponseEntity<Void> inserir(@RequestBody Alerta obj) {
			obj = serv.inserir(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
			
			return ResponseEntity.created(uri).build();
		}
		
		@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
		public ResponseEntity<Void>update(@RequestBody Alerta obj,@PathVariable Long id) {
			obj.setId(id);
			serv.atualizar(obj);
			return ResponseEntity.noContent().build();
		}
	
	
	
}
