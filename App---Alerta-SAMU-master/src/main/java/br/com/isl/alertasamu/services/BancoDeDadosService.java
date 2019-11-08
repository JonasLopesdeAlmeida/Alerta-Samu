package br.com.isl.alertasamu.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isl.alertasamu.model.Alerta;
import br.com.isl.alertasamu.model.Atendimento;
import br.com.isl.alertasamu.model.enums.StatusAlerta;
import br.com.isl.alertasamu.repository.AlertaRepository;
import br.com.isl.alertasamu.repository.AtendimentoRepository;

@Service
public class BancoDeDadosService {

	@Autowired
	private AlertaRepository alertarepository;
	
	@Autowired
	private AtendimentoRepository atendimentorepository;
	
	public void instanciaTestBancoDeDados() throws ParseException {
		
		
		
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Alerta ale1 = new Alerta(null,sdf.parse("31/10/2019 12:00"), 2345666, 456667, "acidente de moto", "");
		Alerta ale2 = new Alerta(null,sdf.parse("01/11/2019 14:30"), 1345666, 456667,"acidente de carro", "");
	    
		Atendimento A1 = new Atendimento(null,"visualizado e sem obs", StatusAlerta.FINALIZADO);
		A1.setAlerta(ale1);
		
		Atendimento A2 = new Atendimento(null,"visualizado e verificado mais de uma pessoa acidentada", StatusAlerta.PENDENTE);
		A2.setAlerta(ale2);

		
    	atendimentorepository.saveAll(Arrays.asList(A1,A2));
		alertarepository.saveAll(Arrays.asList(ale1,ale2));
	
		
	}
}
