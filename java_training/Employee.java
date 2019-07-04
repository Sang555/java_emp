package java_training;

public class Employee {

	private int id;
	public String name;
	public Account account;
	public Address address;
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public int getId() {
		return id;
	}

	private double salary;
	private int vacationDays=30;
	/*
	public Employee(int id,String name,double salary,Account account,Address address)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.account=account;
		this.address=address;
		
	}*/
	public Employee(int id,String name,double salary,Address address)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void applyForLeave(int noOfDays)
	{
		if(vacationDays >= noOfDays)
		{
			vacationDays-=noOfDays;
		}
		else
		{
			System.out.println("You do not have sufficient leave balance to apply");
		}
	}
	
	public void printDetails()
	{
		if(this.account == null)
		{
			System.out.print("Name: " + this.name +" \n");
			System.out.print("Address: "+ this.address.printAddress()+"\n ");
				
		}
		else
		{
			System.out.print("Name: " + this.name +" \n");
			System.out.print("Address: "+ this.address.printAddress()+"\n ");

		}
		
	}
	
}
