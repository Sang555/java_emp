
package java_training;

public class CurrentAccount extends Account{

	final double min_balance=1000;
	final double withdrawal_limit=2000;
	final double deposit_limit=3000;
	double balance;
	
	public CurrentAccount(Employee employee, double balance)
	{
		super(employee);
		this.balance = balance;
	}
	
	public double deposit(double amount)
	{
		this.balance+=amount;
		return this.balance;
	}
	
	public double  withdraw(double amount)
	{
		if(this.balance-amount>=0)
		{
			this.balance-=amount;
			return amount;
		}
		else
		{
			System.out.println("Insufficient funds");
		}
		return 0;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public String getDetails()
	{
		String detail= "ID: "+super.accountId+ "balance "+this.balance;
		return detail;
	}
	public void printDetails()
	{
		   super.employee.printDetails();	
		   System.out.println(this.getDetails());
	}
}

