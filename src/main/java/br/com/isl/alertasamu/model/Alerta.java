package br.com.isl.alertasamu.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import br.com.isl.alertasamu.model.enumeration.StatusAlerta;

@Entity
public class Alerta {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double latitude;
	private double longitude;
	@Lob
	private byte[] foto;
	private String observacao;
	@Enumerated(value = EnumType.STRING)
	private StatusAlerta status;
	
	
	public Long getId() {
		return id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setStatus(StatusAlerta status) {
		this.status = status;
	}
	public StatusAlerta getStatus() {
		return status;
	}
	
	
	
	
	
	
	
}
