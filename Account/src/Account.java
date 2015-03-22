//You are missing the date field. Date date; You have to create a date object in the constructor.
//date field will be used to show when the account was created

//withdraw and deposit fields should have arguments. What about if someone wants to deposit or withdraw
//any amount different then 2500 or 3000.

public class Account {

	int id;

	double balance;

	double annualInterestRate;

	public Account() {
		
	}

	public Account(int ID, double bal, double aIR) {
		id = ID;

		balance = bal;

		annualInterestRate = aIR;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public double withdraw(){
		return balance - 2500;
	}
	
	public double deposit(){
		return balance - 2500 + 3000;
	}

}
