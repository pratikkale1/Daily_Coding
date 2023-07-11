package javatest;

public class JavaTest {//JavaTest Class is created

	public static void main(String[] args) throws Exception {//Main method is created
		
		//Normal Account with positive balance Test
		Account account = new Account( "Saving", "101", 150, 200); //Data fields hard-coded using constructor
		System.out.println("Account Type : "+account.getAccountType());//Account Type is printed
		System.out.println("Account Number : "+account.getAccountNumber());// Account Number is printed
		System.out.println("Account Minimum Balance :"+account.getMinimumBalance());//Account Minimum Balance is printed
		System.out.println("Account Balance :"+account.getCurrentBalance());//Account Balance is printed
		account.calculateInterest();
		
		//Account with negative balance test
		Account accoutWithNegativeBalance = new Account( "Saving", "101", 150, -200);//Data fields hard-coded using constructor
		System.out.println("Account Type : "+accoutWithNegativeBalance.getAccountType());//Account Type is printed
		System.out.println("Account Number : "+accoutWithNegativeBalance.getAccountNumber());// Account Number is printed
		System.out.println("Account Minimum Balance :"+accoutWithNegativeBalance.getMinimumBalance());//Account Minimum Balance is printed
		System.out.println("Account Balance :"+accoutWithNegativeBalance.getCurrentBalance());//Account Balance is printed
		accoutWithNegativeBalance.calculateInterest();//calculateInterest method is called here
	}

}
