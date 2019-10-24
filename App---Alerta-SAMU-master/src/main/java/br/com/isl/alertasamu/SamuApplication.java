package br.com.isl.alertasamu;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.isl.alertasamu.model.Alerta;
import br.com.isl.alertasamu.repository.AlertaRepository;


@SpringBootApplication
public class SamuApplication implements CommandLineRunner  {

	@Autowired
	private AlertaRepository alertarepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SamuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Alerta ale1 = new Alerta(null, 2345666, 456667, "acidente de moto", null);
		Alerta ale2 = new Alerta(null, 1345666, 456667,"acidente de carro", null);
	
		alertarepository.saveAll(Arrays.asList(ale1,ale2));
		
	}

	

}
