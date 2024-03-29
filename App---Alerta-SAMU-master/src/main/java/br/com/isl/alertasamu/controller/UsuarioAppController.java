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
import br.com.isl.alertasamu.model.UsuarioApp;
import br.com.isl.alertasamu.services.UsuarioAppService;

@RestController
@RequestMapping(value="/usuarioApp")
public class UsuarioAppController {
	
	@Autowired
	private UsuarioAppService usuario;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List< UsuarioApp>> listar() {
		List< UsuarioApp>  UsuarioApp = usuario.buscartodos();
		return ResponseEntity.ok().body( UsuarioApp);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity< UsuarioApp>find(@PathVariable Long id) {
		 UsuarioApp obj = usuario.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody UsuarioApp obj) {
		obj = usuario.inserir(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void>update(@RequestBody UsuarioApp obj,@PathVariable Long id) {
		obj.setId(id);
		usuario.atualizar(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void>delete(@PathVariable Long id) {
		usuario.deletar(id);
		return ResponseEntity.noContent().build();
	}
	


}
