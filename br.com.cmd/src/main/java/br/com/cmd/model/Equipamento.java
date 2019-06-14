package br.com.cmd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equipamento {

	@Id
	@GeneratedValue
	private int idEquipamento;
	private String marca, modelo, tipo, descricao;
	private float valorDepreciacaoAnual;
	@ManyToOne
	private Contrato contrato;

	public int getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(int idEquipamento) {
		this.idEquipamento = idEquipamento;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorDepreciacaoAnual() {
		return valorDepreciacaoAnual;
	}

	public void setValorDepreciacaoAnual(float valorDepreciacaoAnual) {
		this.valorDepreciacaoAnual = valorDepreciacaoAnual;
	}

	public Contrato getIdContrato() {
		return contrato;
	}

	public void setIdContrato(Contrato idContrato) {
		this.contrato = idContrato;
	}

}
