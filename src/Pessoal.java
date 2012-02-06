
public class Pessoal extends Higiene{

	private String usoPorFaixaEtaria;
	
	public Pessoal(){
		
	}
	
	public Pessoal(String uso){
		this.usoPorFaixaEtaria = uso;
	}

	public String getUsoPorFaixaEtaria() {
		return usoPorFaixaEtaria;
	}

	public void setUsoPorFaixaEtaria(String usoPorFaixaEtaria) {
		this.usoPorFaixaEtaria = usoPorFaixaEtaria;
	}
}
