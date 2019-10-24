package br.com.isl.alertasamu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isl.alertasamu.model.Alerta;
import br.com.isl.alertasamu.repository.AlertaRepository;
import br.com.isl.alertasamu.services.exceptions.ObjectNotFoundException;



@Service
public class AlertaService {
	
	@Autowired
	private AlertaRepository repo;
	
	public List<Alerta> buscartodos(){
		List<Alerta> Alerta = repo.findAll();
		return Alerta;
	}
	
	public Alerta buscar(Long id) {
		Optional<Alerta>obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Alerta não encontrado! Id: " + id + ", Tipo: " + Alerta.class.getName()));
		}
	
	public Alerta inserir(Alerta obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	public Alerta atualizar(Alerta obj) {
		buscar(obj.getId());
		return repo.save(obj);
	}

}