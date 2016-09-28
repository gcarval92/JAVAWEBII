package sifiscon.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.convert.FacesConverter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="fornecedor")
public class Fornecedor implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer fornecedorId;
	private String cnpj;
	private String razaoSocial;	
	private String inscricaoMunicipal;
	private BigDecimal receitaBruta;
	private Endereco endereco;
	
	
	public Integer getFornecedorId() {
		return fornecedorId;
	}
	public void setFornecedorId(Integer fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public BigDecimal getReceitaBruta() {
		return receitaBruta;
	}
	public void setReceitaBruta(BigDecimal receitaBruta) {
		this.receitaBruta = receitaBruta;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fornecedorId == null) ? 0 : fornecedorId.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (fornecedorId == null) {
			if (other.fornecedorId != null)
				return false;
		} else if (!fornecedorId.equals(other.fornecedorId))
			return false;
		return true;
	}
	
	
	

}
