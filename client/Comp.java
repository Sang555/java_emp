package client;

import java.util.Comparator;

import client.Comparators.AccuontIdASCComparator;
import client.Comparators.AccuontIdDESCComparator;
import java_training.Account;
import java_training.Employee;

public  class Comp
{
public  static Comparator<Account> getComparators(int choice)
{
	if(choice==1)
	return new AccuontIdASCComparator();
	else
		return new AccuontIdDESCComparator();
	/*
	 * switch(comptype)
	{
	case EMPIDASC :
	{
	return new AccuontIdASCComparator();

	}
	case EMPIDDESC:
	{
	return new AccuontIdDESCComparator();

	}
	default :
		return new AccuontIdASCComparator();
	}
}
	 */
	
}
}