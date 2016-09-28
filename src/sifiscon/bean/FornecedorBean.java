package sifiscon.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



import sifiscon.dao.FornecedorDAO;
import sifiscon.modelo.Fornecedor;

@ManagedBean
@SessionScoped
public class FornecedorBean {
	
	


	private Fornecedor fornecedor = new Fornecedor();
	private FornecedorDAO fornecedorDao = new FornecedorDAO();
	
	
	public FornecedorBean(){
		
	}
	
	public String adicionarFornecedor(){
		fornecedorDao.addFornecedor(fornecedor);
		fornecedor.setCnpj(null);
		fornecedor.setRazaoSocial(null);
		fornecedor.setInscricaoMunicipal(null);
		fornecedor.setReceitaBruta(null);
		fornecedor.setEndereco(null);
		return "Fornecedor";
		
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fornecedor == null) ? 0 : fornecedor.hashCode());
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
		FornecedorBean other = (FornecedorBean) obj;
		if (fornecedor == null) {
			if (other.fornecedor != null)
				return false;
		} else if (!fornecedor.equals(other.fornecedor))
			return false;
		return true;
	}
	
	

}
