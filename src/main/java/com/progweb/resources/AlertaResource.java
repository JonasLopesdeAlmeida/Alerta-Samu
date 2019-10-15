package com.progweb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.progweb.domain.Alerta;

@RestController
@RequestMapping(value="/alertas")
public class AlertaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Alerta> listar() {
		
		Alerta A1 = new Alerta(1,"Acidente de Moto",null);
		Alerta A2 = new Alerta(2,"Atropelamento de Pedestre",null);
		
		List<Alerta>lista = new ArrayList<>();
		lista.add(A1);
		lista.add(A2);
		
		return lista;
		
	}

}
