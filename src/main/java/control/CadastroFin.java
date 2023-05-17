package control;

import javax.faces.bean.ManagedBean;
import model.Cadastro;

@ManagedBean
public class CadastroFin {
	
Cadastro cad = new Cadastro();
	
	public CadastroFin() {
		
	}
	
	public String getCodigo() {
		return String.valueOf(cad.getId());
	}
	
	public void setCodigo(String codigo) {
		cad.setId(Integer.parseInt(codigo));
	}
	
	public String getDat() {
		return cad.getData();
	}
	
	public void setDat(String dat) {
		cad.setData(dat);
	}
	
	public String getTipoTran() {
		return cad.getTipoTransacao();
	}
	
	public void setTipoTran(String tipoTran) {
		cad.setTipoTransacao(tipoTran);
	}
	
	public String getTipoCon() {
		return cad.getTipoConta();
	}
	
	public void setTipoCon(String tipoCon) {
		cad.setTipoConta(tipoCon);
	}

}
