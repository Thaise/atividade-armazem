
public class Cama extends Roupa{

	private boolean casal;
	
	public Cama(){
		
	}
	
	public Cama(boolean casal){
		this.setCasal(casal);
	}

	public boolean isCasal() {
		return casal;
	}

	public void setCasal(boolean casal) {
		this.casal = casal;
	}
}
