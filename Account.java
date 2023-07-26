public class Account{  
	private int accNumber;
	private double balance;

	public void setAccNumber(int a){
		this.accNumber =a;
	}
	public int getAccNumber(){
		return this.accNumber;
	}

	public void setBalance(double a){
		this.balance=a;
	}
	public double getBalance(){
		return this.balance;
	}
	public void showDetails(){
		System.out.println("Account Number: "+ accNumber);
		System.out.println("Account Balance: "+ balance);
	}
 

}