package client;
import java.util.Comparator;


import java_training.Employee;
import java_training.Account;
public class Comparators
{
	

	public static class AccuontIdASCComparator implements Comparator<Account>
	{

		@Override
		public int compare(Account o1, Account o2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(o1.getAccountId()).compareTo(o2.getAccountId());
			
		}
	
	}
	public static class AccuontIdDESCComparator implements Comparator<Account>
	{

		@Override
		public int compare(Account o1, Account o2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(o2.getAccountId()).compareTo(o1.getAccountId());
			
		}
	
	}
	

}
	

