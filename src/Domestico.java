
public class Domestico extends Higiene{
 
	private String tipoVenda;// embalado ou a granel
	
	public Domestico(){
		
	}
	
	public Domestico(String tipoVenda){
		this.tipoVenda = tipoVenda;
	}

	public String getTipoVenda() {
		return tipoVenda;
	}

	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}

}
