
public class Bazar extends Produto{

	private String tipo;//feminino, moda praia, lou�a, vaso
	
	public Bazar(){
		
	}
	
	public Bazar(String tipo){
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
