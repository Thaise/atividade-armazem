
public class Roupa extends Bazar{

	private String tecido;
	private String tamanho;
	private String padrao;
	private boolean conjunto;//conjunto lençol e fronha...
	
	public Roupa(){
		
	}
	
	public Roupa(String tamanho){
		this.tamanho = tamanho;
	}
	
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getPadrao() {
		return padrao;
	}
	public void setPadrao(String padrao) {
		this.padrao = padrao;
	}
	public void setConjunto(boolean conjunto){
		this.conjunto = conjunto;
	}
	public boolean isConjunto(){
		return conjunto;
	}
}
