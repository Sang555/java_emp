import java.util.Comparator;

import java_training.Employee;



	class EmployeeIdASCComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(o1.getId()).compareTo(o2.getId());
			
		}
	
	}
	
	class EmployeeIdDESCComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(o2.getId()).compareTo(o1.getId());
			
		}
	
	}
	class EmployeeNameASCComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return String.valueOf(o1.getName()).compareTo(o2.getName());
			
		}
	
	}
	
	class EmployeeNameDESCComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return String.valueOf(o2.getName()).compareTo(o1.getName());
			
		}
	
	}
	

