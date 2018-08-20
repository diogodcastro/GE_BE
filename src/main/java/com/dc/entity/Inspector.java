package com.dc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Inspector")
public class Inspector {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	public Users users;

	public boolean eletrico;
	public boolean hidraulico;
	public boolean pneumatico;
	public boolean elevacao;
	public boolean maquinaFerramenta;
	public boolean epiEpc;
	public boolean escadasEscadotes;
	public boolean ferramentasAt;
	public boolean gases;
	public boolean cestaInspecao;
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public boolean isEletrico() {
		return eletrico;
	}
	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}
	public boolean isHidraulico() {
		return hidraulico;
	}
	public void setHidraulico(boolean hidraulico) {
		this.hidraulico = hidraulico;
	}
	public boolean isPneumatico() {
		return pneumatico;
	}
	public void setPneumatico(boolean pneumatico) {
		this.pneumatico = pneumatico;
	}
	public boolean isElevacao() {
		return elevacao;
	}
	public void setElevacao(boolean elevacao) {
		this.elevacao = elevacao;
	}
	public boolean isMaquinaFerramenta() {
		return maquinaFerramenta;
	}
	public void setMaquinaFerramenta(boolean maquinaFerramenta) {
		this.maquinaFerramenta = maquinaFerramenta;
	}
	public boolean isEpiEpc() {
		return epiEpc;
	}
	public void setEpiEpc(boolean epiEpc) {
		this.epiEpc = epiEpc;
	}
	public boolean isEscadasEscadotes() {
		return escadasEscadotes;
	}
	public void setEscadasEscadotes(boolean escadasEscadotes) {
		this.escadasEscadotes = escadasEscadotes;
	}
	public boolean isFerramentasAt() {
		return ferramentasAt;
	}
	public void setFerramentasAt(boolean ferramentasAt) {
		this.ferramentasAt = ferramentasAt;
	}
	public boolean isGases() {
		return gases;
	}
	public void setGases(boolean gases) {
		this.gases = gases;
	}
	public boolean isCestaInspecao() {
		return cestaInspecao;
	}
	public void setCestaInspecao(boolean cestaInspecao) {
		this.cestaInspecao = cestaInspecao;
	}
	
}
