public class Customer{ 
	private int id;
	private String name;
	private Account acc;
	Customer(){
		
	}
	public void setId(int i){
		this.id=i;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String n){
		this.name=n;
	}
	public String getName(){
		return this.name;
	}
	public void setAcc(Account aa){
		this.acc=aa;
	}
	public Account getAcc(){
		return this.acc;
	}

	public void showDetails(){
		System.out.println("Customer Id: "+ id);
		System.out.println("Customer Name: "+ name);
		// Account info
		if(acc != null){
		System.out.println("Account Type is: "+ acc.getClass().getName());
		System.out.println("Account Number: "+ acc.getAccNumber());
		System.out.println("Account Balance: "+ acc.getBalance()); 

		String accountType = (String) acc.getClass().getName();

		//class check and output based on the class name
		if(accountType =="SavingsAccount"){ 
			//SavingsAccount
			SavingsAccount saAccount= (SavingsAccount) acc; 
			System.out.println( "Savings Account Interest Rate: " + saAccount.getInterestRate() );
		}else if(accountType == "FixedAccount"){
			//FixedAccount 
			FixedAccount fxAccount= (FixedAccount) acc;  
			System.out.println("Fixed Account Tenure is: " +fxAccount.getTenure() );
		} 
		}
	}

}