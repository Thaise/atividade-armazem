
public class Banho extends Roupa{
	
	private boolean impermeavel;

	public Banho(){
		
	}
	
	public Banho(boolean impermeavel){
		this.impermeavel = impermeavel;
	}

	public boolean isImpermeavel() {
		return impermeavel;
	}

	public void setImpermeavel(boolean impermeavel) {
		this.impermeavel = impermeavel;
	}
}
