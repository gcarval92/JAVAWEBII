package sifiscon.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sifiscon.dao.HibernateUtil;

import sifiscon.modelo.Fornecedor;

public class FornecedorDAO {
	
	private Session sessao;
	private Transaction trans;
	
	public void addFornecedor(Fornecedor f){
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			trans = sessao.beginTransaction();
			
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setCnpj(f.getCnpj());
			fornecedor.setRazaoSocial(f.getRazaoSocial());
			fornecedor.setInscricaoMunicipal(f.getInscricaoMunicipal());
			fornecedor.setReceitaBruta(f.getReceitaBruta());
			fornecedor.setEndereco(f.getEndereco());
			
			sessao.save(fornecedor);
			trans.commit();
		}catch (Exception e){
		
			e.printStackTrace();
		}finally {
			sessao.close();
		}
			
			
		
		}
	}
	
	
		
	


