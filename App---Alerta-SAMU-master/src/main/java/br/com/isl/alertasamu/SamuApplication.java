package br.com.isl.alertasamu;


import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.isl.alertasamu.model.Alerta;
import br.com.isl.alertasamu.model.Atendimento;
import br.com.isl.alertasamu.model.enums.StatusAlerta;
import br.com.isl.alertasamu.repository.AlertaRepository;
import br.com.isl.alertasamu.repository.AtendimentoRepository;


@SpringBootApplication
public class SamuApplication implements CommandLineRunner  {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SamuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

	

}
