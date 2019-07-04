package java_training;

public abstract class Account {
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

	public abstract double deposit(double amount);
	
	public abstract double  withdraw(double amount);
	
	public abstract double getBalance();
	public abstract void setBalance(double balance);
	
	
	public abstract String getDetails();
	
	public abstract void printDetails();
	
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
