package java_training;

import java.util.Objects;

public abstract class Account implements Comparable<Account>{
	 public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public  int accountId;
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

	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj.getClass() != Account.class)
			return false;
		Account a1=(Account)obj;
		
		// TODO Auto-generated method stub
		return Objects.equals(this.accountId,a1.accountId);
	}

	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.id);
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.accountId).compareTo(o.accountId);
		
	}


	public String toString()
	{
		return ("Account Id" + String.valueOf(this.accountId));
		
	}
	

}
