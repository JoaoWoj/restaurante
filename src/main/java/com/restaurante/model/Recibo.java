package com.restaurante.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "financeiro")
public class Recibo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "num_recibo", length = 100)
	private String numRecibo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idfinanceiro")
	private Financeiro financeiro;
	
	@Column(length = 200)
	private String descricao;
	
	@Column(name = "data_cadastro")
	private Date dataCadastro;
	
	@Column(name = "data_pagamento")
	private Date dataPagamento;
	
	@Column(scale = 2)
	private BigDecimal desconto;
	
	@Column(scale = 2)
	private BigDecimal acrescimo;
	
	@Column(name = "valor_total", scale = 2)
	private BigDecimal valorTotal;

	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	String getNumRecibo() {
		return numRecibo;
	}

	void setNumRecibo(String numRecibo) {
		this.numRecibo = numRecibo;
	}

	Financeiro getFinanceiro() {
		return financeiro;
	}

	void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}

	String getDescricao() {
		return descricao;
	}

	void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	Date getDataCadastro() {
		return dataCadastro;
	}

	void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	Date getDataPagamento() {
		return dataPagamento;
	}

	void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	BigDecimal getDesconto() {
		return desconto;
	}

	void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	BigDecimal getAcrescimo() {
		return acrescimo;
	}

	void setAcrescimo(BigDecimal acrescimo) {
		this.acrescimo = acrescimo;
	}

	BigDecimal getValorTotal() {
		return valorTotal;
	}

	void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acrescimo == null) ? 0 : acrescimo.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((dataPagamento == null) ? 0 : dataPagamento.hashCode());
		result = prime * result + ((desconto == null) ? 0 : desconto.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((financeiro == null) ? 0 : financeiro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numRecibo == null) ? 0 : numRecibo.hashCode());
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		Recibo other = (Recibo) obj;
		if (acrescimo == null) {
			if (other.acrescimo != null)
				return false;
		} else if (!acrescimo.equals(other.acrescimo))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataPagamento == null) {
			if (other.dataPagamento != null)
				return false;
		} else if (!dataPagamento.equals(other.dataPagamento))
			return false;
		if (desconto == null) {
			if (other.desconto != null)
				return false;
		} else if (!desconto.equals(other.desconto))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (financeiro == null) {
			if (other.financeiro != null)
				return false;
		} else if (!financeiro.equals(other.financeiro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numRecibo == null) {
			if (other.numRecibo != null)
				return false;
		} else if (!numRecibo.equals(other.numRecibo))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
}