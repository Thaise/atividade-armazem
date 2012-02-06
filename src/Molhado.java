
public class Molhado extends Alimento{

	private boolean alcoolico;
	private double temperaturaConservacao;
	
	public Molhado(){
		
	}
	
	public Molhado(boolean alcoolico){
		this.alcoolico = alcoolico;
	}

	public boolean isAlcoolico() {
		return alcoolico;
	}

	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

	public double getTemperaturaConservacao() {
		return temperaturaConservacao;
	}

	public void setTemperaturaConservacao(double temperaturaConservacao) {
		this.temperaturaConservacao = temperaturaConservacao;
	}

}
