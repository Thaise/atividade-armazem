
public class Seco extends Alimento{

	private String tipo;//frutas, arroz, feijão
	
	public Seco(){
		
	}
	
	public Seco(String tipo){
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
