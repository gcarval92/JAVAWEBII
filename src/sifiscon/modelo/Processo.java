package sifiscon.modelo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name="processo")
public class Processo implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer processoId;
	private Fornecedor fornecedor;
	private StringBuilder relatoFiscalizacao;
	private Date dataRelato;
	private String fiscalResponsavel;
	
	@ManyToMany
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public StringBuilder getRelatoFiscalizacao() {
		return relatoFiscalizacao;
	}
	public void setRelatoFiscalizacao(StringBuilder relatoFiscalizacao) {
		this.relatoFiscalizacao = relatoFiscalizacao;
	}
	public Date getDataRelato() {
		return dataRelato;
	}
	public void setDataRelato(Date dataRelato) {
		this.dataRelato = dataRelato;
	}
	public String getFiscalResponsavel() {
		return fiscalResponsavel;
	}
	public void setFiscalResponsavel(String fiscalResponsavel) {
		this.fiscalResponsavel = fiscalResponsavel;
	}
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	public void adicionarFornecedor(Fornecedor fornecedor){
		this.fornecedores.add(fornecedor);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((processoId == null) ? 0 : processoId.hashCode());
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
		Processo other = (Processo) obj;
		if (processoId == null) {
			if (other.processoId != null)
				return false;
		} else if (!processoId.equals(other.processoId))
			return false;
		return true;
	}
		
	

}
