public class SavingsAccount extends Account{
	private float interestRate; 
	
	public void setInterestRate(float a){
		this.interestRate =a;
	}
	public float getInterestRate(){
		return this.interestRate;
	}
	public String toString(){
		 return "Interest : " +this.getInterestRate(); 
	}

}