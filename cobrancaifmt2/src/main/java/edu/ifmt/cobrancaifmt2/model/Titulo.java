package edu.ifmt.cobrancaifmt2.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.Date;


@Entity //Uma entidade JPA
@Table(name = "titulo") // Nome da tabela no banco de dados
public class Titulo {
	
	@Id //identifica a Entidade
	@GeneratedValue(strategy=GenerationType.IDENTITY) //estratégia - fica por conta do DB
	private Long codigo;
	private String descricao;
	@Temporal(TemporalType.DATE)//so da data
	private Date dataVencimento;
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)//salvara no db como String
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