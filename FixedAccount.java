public class FixedAccount extends Account{  
	private double tenure;
	
	public void setTenure(double a){
		this.tenure =a;
	}
	public double getTenure(){
		return this.tenure;
	}
	public String toString(){
		 return "Tenure : " +this.getTenure(); 
	}
}