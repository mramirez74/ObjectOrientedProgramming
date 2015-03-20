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
