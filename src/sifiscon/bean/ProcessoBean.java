package sifiscon.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sifiscon.dao.ProcessoDAO;
import sifiscon.modelo.Processo;



@ManagedBean
@SessionScoped
public class ProcessoBean {
	
	private Processo processo = new Processo();
	private ProcessoDAO processoDao = new ProcessoDAO();
	
	public ProcessoBean(){
		
	}
	
	public String adicionarProcesso(){
		processoDao.addProcesso(processo);
		processo.setFornecedor(null);
		processo.setRelatoFiscalizacao(null);
		processo.setDataRelato(null);
		processo.setFiscalResponsavel(null);
		
		return "Processo";
		
	}
	
	public Processo getProcesso() {
		return processo;
	}
	
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((processo == null) ? 0 : processo.hashCode());
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
		ProcessoBean other = (ProcessoBean) obj;
		if (processo == null) {
			if (other.processo != null)
				return false;
		} else if (!processo.equals(other.processo))
			return false;
		return true;
	}
	
		

}
