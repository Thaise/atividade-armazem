
public class Higiene extends Produto{

	private boolean alergicos;
	private boolean risco;
	private String finalidade;// para cabelos, rosto / limpeza, roupa
	
	public Higiene(){
		
	}
	
	public Higiene(boolean alergicos){
		this.alergicos = alergicos;
	}
	
	public boolean isAlergicos() {
		return alergicos;
	}
	public void setAlergicos(boolean alergicos) {
		this.alergicos = alergicos;
	}
	public boolean isRisco() {
		return risco;
	}
	public void setRisco(boolean risco) {
		this.risco = risco;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
}
