package edu.ifmt.cobrancaifmt2.model;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //Uma entidade JPA
@Table(name = "titulo") // Nome da tabela no banco de dados
public class Titulo {
	
	@Id //identifica a Entidade
	@GeneratedValue(strategy=GenerationType.IDENTITY) //estratégia - fica por conta do DB
	private Long codigo;
	private String descricao;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)//so da data
	private Date dataVencimento;
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private StatusTitulo status;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
	this. codigo = codigo;
	}
	
	public String getDescricao() {
	return descricao;
	}
	
	public void setDescricao(String descricao) {
	this. descricao = descricao;
	}
	
	public Date getDataVencimento() {
	return dataVencimento;
	}
	
	public void setDataVencimento(Date dataVencimento) {
	this.dataVencimento = dataVencimento;
	}
	
	public BigDecimal getValor() {
	return valor;
	}
	
	public void setValor(BigDecimal valor) {
	this.valor = valor;
	}
	
	public StatusTitulo getStatus() {
	return status;
	}
	
	public void setStatus(StatusTitulo status) {
	this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		return Objects.equals(codigo, other.codigo);
	}


	
}