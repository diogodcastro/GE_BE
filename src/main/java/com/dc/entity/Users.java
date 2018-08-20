package com.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name= "Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public long id;
	
	@NotNull
	public String username;
	
	public String password;
	
	public String nome;
	
	public String apelido;
	
	public boolean levantarDepositar;
	public boolean inspecionar;
	public boolean reparar;
	public boolean abater;
	public boolean gerirEquipamentos;
	public boolean gerirUtilizadores;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public boolean isLevantarDepositar() {
		return levantarDepositar;
	}
	public void setLevantarDepositar(boolean levantarDepositar) {
		this.levantarDepositar = levantarDepositar;
	}
	public boolean isInspecionar() {
		return inspecionar;
	}
	public void setInspecionar(boolean inspecionar) {
		this.inspecionar = inspecionar;
	}
	public boolean isReparar() {
		return reparar;
	}
	public void setReparar(boolean reparar) {
		this.reparar = reparar;
	}
	public boolean isAbater() {
		return abater;
	}
	public void setAbater(boolean abater) {
		this.abater = abater;
	}
	public boolean isGerirEquipamentos() {
		return gerirEquipamentos;
	}
	public void setGerirEquipamentos(boolean gerirEquipamentos) {
		this.gerirEquipamentos = gerirEquipamentos;
	}
	public boolean isGerirUtilizadores() {
		return gerirUtilizadores;
	}
	public void setGerirUtilizadores(boolean gerirUtilizadores) {
		this.gerirUtilizadores = gerirUtilizadores;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	

}
