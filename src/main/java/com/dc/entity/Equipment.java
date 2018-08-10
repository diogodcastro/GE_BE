package com.dc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Equipment {
	
	@Id
	public String codigo; 
	
	public String localizacao;
	
	@Enumerated(EnumType.STRING)
	public Family familia;
	
	public String equipamento;
	public String caracteristicas;
	public String marca; 
	public String modelo;
	public String nrSerie;
		
	@Enumerated(EnumType.STRING)
	public States estado;
	
	public Date ultimaInspecao;
	public Date proximaInspecao;
	public boolean inspecaoValida;
	public Date dataFabrico;
	public Date dataServico;
	public Date dataValidade;
	public String nrPo;
	public String fornecedor;
	public boolean ativo;
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
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
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNrSerie() {
		return nrSerie;
	}
	public void setNrSerie(String nrSerie) {
		this.nrSerie = nrSerie;
	}
	public States getEstado() {
		return estado;
	}
	public void setEstado(States estado) {
		this.estado = estado;
	}
	public Date getUltimaInspecao() {
		return ultimaInspecao;
	}
	public void setUltimaInspecao(Date ultimaInspecao) {
		this.ultimaInspecao = ultimaInspecao;
	}
	public Date getProximaInspecao() {
		return proximaInspecao;
	}
	public void setProximaInspecao(Date proximaInspecao) {
		this.proximaInspecao = proximaInspecao;
	}
	public boolean isInspecaoValida() {
		return inspecaoValida;
	}
	public void setInspecaoValida(boolean inspecaoValida) {
		this.inspecaoValida = inspecaoValida;
	}
	public Date getDataFabrico() {
		return dataFabrico;
	}
	public void setDataFabrico(Date dataFabrico) {
		this.dataFabrico = dataFabrico;
	}
	public Date getDataServico() {
		return dataServico;
	}
	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getNrPo() {
		return nrPo;
	}
	public void setNrPo(String nrPo) {
		this.nrPo = nrPo;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getCodigo() {
		return codigo;
	}
}
