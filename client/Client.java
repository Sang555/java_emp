package client;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.OperationNotSupportedException;

import java_training.Account;
import java_training.Address;
import java_training.CurrentAccount;
import java_training.Employee;
import java_training.SalaryAccount;
import java_training.SavingAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import client.Comparators;
import client.Comp;

public class Client {
	
	public static void operate( Account account)
	{
		Scanner scanner= new Scanner(System.in);
		boolean cont = true;
		while(cont)
		{
			System.out.println("Enter Choice:\n 0.create account 1.view balance \n 2.deposit\n 3. withdraw\n \n 4.exit\n");
			int choices = scanner.nextInt();
			
			switch(choices)
			{
			
			
			case 1:
			{
				System.out.println("Your Balance "+account.getBalance());
				
				break;
			}
			case 2:
			{
				System.out.println("Enter amount to be deposited \n");
				int amt= scanner.nextInt();
				
				System.out.println("Amount has been deposited \n Balance is "+ account.deposit(amt) );
				break;
			}
			case 3:
			{
				System.out.println("Enter amount to be withdrawn \n");
				int amt= scanner.nextInt();
				
				System.out.println("Amount has been withdrawn \n Balance is "+ account.withdraw(amt) );
				break;
			}
			case 4:
			{
				cont= false;
				break;
			}
			
			}
		
		}
	}
	
public static void main(String[] args)
{
	
	Scanner scanner= new Scanner(System.in);
	Set<Account> accounts=new TreeSet<>();
	String city, street, state;
	String name;
	Double salary;
	int id;
	int type;
	boolean cnt=true;
	while(cnt)
	{
	System.out.println("Choose :\n 1.add account\n 2.operate\n");
	int c= scanner.nextInt();

	if(c==1)
	{
	System.out.println("ENTER YOUR PERSONAL DETAILS");
	System.out.println("Enter city: ");
	city = scanner.nextLine();
	System.out.println("Enter street: ");
	street = scanner.nextLine();
	System.out.println("Enter state: ");
	state = scanner.nextLine();
	
	System.out.println("Enter name: ");
	name = scanner.nextLine();
	System.out.println("Enter id: ");
	id = scanner.nextInt();
	System.out.println("Enter salary: ");
	salary = scanner.nextDouble();
	
	
	/*
	Address address=new Address("J P Nagar", "Bangalore", "Karnataka");
	Employee sang= new Employee(3, "Sang", 5000,address);
	Employee keshu= new Employee(6, "Keshu", 5000,address);
	*/
	
	Address add = new Address(street, city, state);
	
	Employee emp1= new Employee(id, name, salary,add);
	System.out.println("YOUR PERSONAL DETAILS IS UPDATED SUCCESSFULLY");
	
	System.out.println("ENTER ACCOUNT TYPE:\n 0.SAVINGS_ACCOUNT \n 1.CURRENT_ACCOUNT \n 2.SALARY_ACCOUNT \n" );

	type= scanner.nextInt();

	if(type ==0)
	{
		System.out.println("Enter balance: ");
		double balance= scanner.nextDouble();
		Account  savingaccount=new SavingAccount(emp1, balance);
		accounts.add(savingaccount);
		savingaccount.printDetails();
	
	System.out.println("YOUR ACCOUNT IS CREATED SUCCESSFULLY\n YOUR ID IS "+ savingaccount.getAccountId());
	//operate(emp1, savingaccount);
	
	}
	else if( type==1 )
	{
		System.out.println("Enter balance: ");
		double balance= scanner.nextDouble();
		CurrentAccount  currentaccount=new CurrentAccount(emp1, balance);
		accounts.add(currentaccount);
		currentaccount.printDetails();
	
	System.out.println("YOUR ACCOUNT IS CREATED SUCCESSFULLY\n YOUR ID IS "+ currentaccount.getAccountId());
	//operate(emp1, currentaccount);
	}
	else if( type==2 )
	{
		System.out.println("Enter balance: ");
		double balance= scanner.nextDouble();
		SalaryAccount  salaryaccount=new SalaryAccount(emp1, balance);
		accounts.add(salaryaccount);
		salaryaccount.printDetails();
	
	System.out.println("YOUR ACCOUNT IS CREATED SUCCESSFULLY\n YOUR ID IS "+ salaryaccount.getAccountId());
	
	//operate(emp1, salaryaccount);

	}
	}
	else
	{
		List<Account> listAccount= new ArrayList<>(accounts);
		System.out.println(" Enter 1.ASC 2.DESC\n");
		int ch = scanner.nextInt();
        Collections.sort(listAccount, Comp.getComparators(ch));
        System.out.println(listAccount);
		int found=0;
		System.out.println("Enter id\n : ");
		int id1=  scanner.nextInt();
		for(Account acc : accounts)
		{
			if(acc.getAccountId()==id1)
				{
				operate(acc);
				found=1;
				}
			else
			{
				
			}
		}
		if(found==0)
			System.out.println("Account not found");
	}
	}
}

}
	/*
	System.out.println("Initial vacation days "+ sang.getVacationDays());
	sang.applyForLeave(20);
	System.out.println("After applying for leaves" + sang.getVacationDays());
	sang.applyForLeave(20);
	System.out.println("---------ACCOUNT DETAILS--------");
	account.printDetails();
	System.out.println("---------EMPLOYEE DETAILS--------");
	keshu.printDetails();
	*/
	
	//account.printDetails();
	
