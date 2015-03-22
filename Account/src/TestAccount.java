//OK. O.Aktunc
public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();
		
		a.id = 1122;
		a.balance = 20000;
		a.annualInterestRate = 4.5;
		
		System.out.println("id: " +a.id);
		System.out.println("Current balance: $" +a.balance);
		System.out.println("Annual interest rate: " +a.annualInterestRate+ "%");
		System.out.println("Monthly interest rate: " +a.getMonthlyInterestRate()+ "%");
		
		a.withdraw();
		System.out.println("New balance after withdrawl: $" +a.withdraw());
		
		a.deposit();
		System.out.println("Final balance after deposit: $" +a.deposit());
		
		//date information missing


		
	}

}
