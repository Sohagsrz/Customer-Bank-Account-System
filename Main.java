import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
		FixedAccount myAccount ;
		SavingsAccount myAccount2 ;
		
		System.out.println("How Many Account you want to create? ");
		int accNumbers = inp.nextInt();
		Customer[] customers = new Customer[accNumbers];
		
		for (int i=0; i < accNumbers; i++) {
			customers[i]= new Customer(); 
			System.out.println("Customer ID for Customer "+(i+1)+": ");
			customers[i].setId(inp.nextInt());
			//fix auto enter issue
			inp.nextLine();
			
			System.out.println("Customer Name for Customer "+(i+1)+": ");
			customers[i].setName(inp.nextLine());

			System.out.println("Account Type ?\n1.Fixed Account\n2.Savings Account\n\nEnter the Option:");
			int option = inp.nextInt();

			switch(option){
			case 1:
				//customer FixedAccount
				 myAccount = new FixedAccount();

				System.out.println("Fixed Account Number for Account "+(i+1)+": ");
				myAccount.setAccNumber(inp.nextInt());

				System.out.println("Account Balance for Account "+(i+1)+": ");
				myAccount.setBalance(inp.nextInt());

				System.out.println("Fixed Account Tunure for Account "+(i+1)+": ");
				myAccount.setTenure(inp.nextInt());

				customers[i].setAcc(myAccount);
				break;
			case 2:
				//SavingsAccount
				myAccount2 = new SavingsAccount();
				
				System.out.println("Savings Account Number for Account "+(i+1)+": ");
				myAccount2.setAccNumber(inp.nextInt());

				System.out.println("Account Balance for Account "+(i+1)+": ");
				myAccount2.setBalance(inp.nextInt());

				System.out.println("Savings Account Interest Rate "+(i+1)+": ");
				myAccount2.setInterestRate(inp.nextFloat());

				customers[i].setAcc(myAccount2);
				break;
			default:
				System.out.println("Wrong Number!");
			}
			//result
			customers[i].showDetails();
		}

		// //customer 1
		// FixedAccount myAccount = new FixedAccount();
		// myAccount.setAccNumber(2441139);
		// myAccount.setBalance(475487);
		// myAccount.setTenure(1045646);

		// //customer 
		// Customer cu1 = new Customer();
		// cu1.setId(1121);
		// cu1.setName("Md Sohag islam");
		// cu1.setAcc(myAccount);
		// // info
		// cu1.showDetails();


		// // customer 2

		// SavingsAccount myAccount2 = new SavingsAccount();
		// myAccount2.setAccNumber(2441139);
		// myAccount2.setBalance(475487);
		// myAccount2.setInterestRate(1045646);

		// //customer 
		// Customer cu2 = new Customer();
		// cu2.setId(1121);
		// cu2.setName("Md Mahin islam");
		// cu2.setAcc(myAccount2);
		// // info
		// cu2.showDetails();


	}
}