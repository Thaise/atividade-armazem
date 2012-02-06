
public class Alimento extends Produto{

	private double calorias;
	private String dataValidade;
	private boolean gluten;
	private boolean perecivel;
	
	public Alimento(){
		
	}
	public Alimento(String data){
		this.dataValidade = data;
	}
	
	public Alimento(double calorias){
		this.calorias = calorias;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public boolean isGluten() {
		return gluten;
	}
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}
	public boolean isPerecivel() {
		return perecivel;
	}
	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
}
