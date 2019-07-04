package java_training;

public class Account {
	final public  int accountId;
	//private double balance=1000;

	private  static int id=100;
	public Employee employee;
	//public accountType accounttype;
	
	/*
	public enum accountType
	{
		SAVINGS_ACCOUNT,
		CURRENT_ACCOUNT,
		SALARY_ACCOUNT
	}
	*/

	public double deposit(double amount)
	{
		return 0;
	}
	
	public double  withdraw(double amount)
	{
		return 0;
	}
	public double getBalance() {
		return 0;
	}

	public void setBalance(double balance) {

	}
	
	
	public String getDetails()
	{
		return "";
	}
	public void printDetails()
	{
	
	}
	public Account(Employee employee)
	{
		this.accountId=++id;

		this.employee=employee;
		this.employee.setAccount(this);
		
		
	}

	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public  int getAccountId() {
		return accountId;
	}


	
	

}
