package com.dc.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EquipmentsInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	@Enumerated(EnumType.STRING)
	public Family familia;

	public String equipamento;
	
	public int periodicidade;
	
	public String observacoes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Family getFamilia() {
		return familia;
	}

	public void setFamilia(Family familia) {
		this.familia = familia;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public int getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	
	
	
	
}
