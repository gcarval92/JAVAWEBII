package sifiscon.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sifiscon.dao.HibernateUtil;

import sifiscon.modelo.Processo;

public class ProcessoDAO {

	private Session sessao;
	private Transaction trans;

	public void addProcesso(Processo p) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			trans = sessao.beginTransaction();

			Processo processo = new Processo();
			processo.setFornecedor(p.getFornecedor());
			processo.setRelatoFiscalizacao(p.getRelatoFiscalizacao());
			processo.setDataRelato(p.getDataRelato());
			processo.setFiscalResponsavel(p.getFiscalResponsavel());

			sessao.save(processo);
			trans.commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			sessao.close();
		}

	}

}
