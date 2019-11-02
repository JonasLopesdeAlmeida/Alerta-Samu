package br.com.isl.alertasamu.model;

import java.io.Serializable;

import java.text.SimpleDateFormat;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import br.com.isl.alertasamu.model.enums.StatusAlerta;

@Entity
public class Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String observacaoadm;
	private Integer status;
	
	@OneToOne
	@JoinColumn(name="alerta_id")
	@MapsId
	private Alerta alerta;
	
    public Atendimento() {
    	
    	
    }
	
	public Atendimento(Long id,String observacaoadm, StatusAlerta status) {
		super();
		this.id = id;
		this.observacaoadm = observacaoadm;
		this.status = status.getCod();
	}
	


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	public StatusAlerta getStatus() {
		return StatusAlerta.toEnum(status);
	}


	public void setStatus(StatusAlerta status) {
		this.status = status.getCod();
	}


	public Alerta getAlerta() {
		return alerta;
	}


	public void setAlerta(Alerta alerta) {
		this.alerta = alerta;
	}
	


	public String getObservacaoadm() {
		return observacaoadm;
	}

	public void setObservacao(String observacaoadm) {
		this.observacaoadm = observacaoadm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendimento other = (Atendimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	

}
