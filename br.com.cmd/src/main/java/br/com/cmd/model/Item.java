package br.com.cmd.model;

import java.time.LocalDate;



public class Item {

	
	private int idItem;
	private String partNumber, sistemasOperacional, hostname, situacao, ip;
	private String macAdress, login, localidade, centroCusto, chamadoRelcionado, descricao;
	private LocalDate dataInicioOperacao, dataFimSuporte, dataEquipamento;
	private Equipamento idEquipamento;
	private Setor idSetor;

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getSistemasOperacional() {
		return sistemasOperacional;
	}

	public void setSistemasOperacional(String sistemasOperacional) {
		this.sistemasOperacional = sistemasOperacional;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMacAdress() {
		return macAdress;
	}

	public void setMacAdress(String macAdress) {
		this.macAdress = macAdress;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}

	public String getChamadoRelcionado() {
		return chamadoRelcionado;
	}

	public void setChamadoRelcionado(String chamadoRelcionado) {
		this.chamadoRelcionado = chamadoRelcionado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicioOperacao() {
		return dataInicioOperacao;
	}

	public void setDataInicioOperacao(LocalDate dataInicioOperacao) {
		this.dataInicioOperacao = dataInicioOperacao;
	}

	public LocalDate getDataFimSuporte() {
		return dataFimSuporte;
	}

	public void setDataFimSuporte(LocalDate dataFimSuporte) {
		this.dataFimSuporte = dataFimSuporte;
	}

	public LocalDate getDataEquipamento() {
		return dataEquipamento;
	}

	public void setDataEquipamento(LocalDate dataEquipamento) {
		this.dataEquipamento = dataEquipamento;
	}

	public Equipamento getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Equipamento idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public Setor getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(Setor idSetor) {
		this.idSetor = idSetor;
	}

}
