package br.com.isl.alertasamu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isl.alertasamu.model.Alerta;

public interface AlertaRepository extends JpaRepository<Alerta, Long>{

}
