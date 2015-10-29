package org.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeComparator implements Comparator<Object> {

	private String firstname;
	private String lastname;
	public int id;
	private int salary;

	public EmployeeComparator(String firstname, String lastname, int id, int salary) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setId(id);
		this.setSalary(salary);

	}

	public void disp() {
		System.out.println("|"+firstname + "|\t| " + lastname + "|\t| " + id + "|\t| " + salary+"\t|");
	}

	public static void main(String[] Args) {
		List<EmployeeComparator> listEmployees = new ArrayList<EmployeeComparator>();
		listEmployees.add(new EmployeeComparator("emp1", "Emp6L", 11 , 100));
		listEmployees.add(new EmployeeComparator("emp4", "Emp5L", 18, 1200));
		listEmployees.add(new EmployeeComparator("emp3", "Emp4L", 12, 800));
		listEmployees.add(new EmployeeComparator("emp2", "Emp3L", 21, 200));
		listEmployees.add(new EmployeeComparator("emp5", "Emp2L", 13 , 2000));
		listEmployees.add(new EmployeeComparator("emp6", "Emp1L", 40, 50));
		System.out.println("\t\t Sorting Using Comparator : Given Input Data ");
		
		ListIterator<EmployeeComparator> i = listEmployees.listIterator();
		while (i.hasNext()) {
			EmployeeComparator em = (EmployeeComparator) i.next();
			em.disp();
		}
		
		Collections.sort(listEmployees, new IdComparator());
		ListIterator<EmployeeComparator> itr = listEmployees.listIterator();
		System.out.println("\n Sorting Based on Employee ID:");

		while (itr.hasNext()) {
			EmployeeComparator e = (EmployeeComparator) itr.next();
			e.disp(); 
		}
			Collections.sort(listEmployees, new SalComparator());	
			ListIterator<EmployeeComparator> itr1 = listEmployees.listIterator();
			System.out.println("\n Sorting Based on Salalry:");

			while (itr1.hasNext()) {
				EmployeeComparator e1 = (EmployeeComparator) itr1.next();
				e1.disp(); 
			}

			Collections.sort(listEmployees, new FnameComparator());
			ListIterator<EmployeeComparator> itr2 = listEmployees.listIterator();
			System.out.println("\n Sorting Based on First Name :");

			while (itr2.hasNext()) {
				EmployeeComparator e2 = (EmployeeComparator) itr2.next();
				e2.disp(); 
			}
			Collections.sort(listEmployees, new LnameComparator());
			ListIterator<EmployeeComparator> itr3 = listEmployees.listIterator();
			System.out.println("\n Sorting Based on Last Name :");

			while (itr3.hasNext()) {
				EmployeeComparator e3 = (EmployeeComparator) itr3.next();
				e3.disp(); 
			}


	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	static class IdComparator implements Comparator<Object> {   // ?? is there any other alternative than using static
		   public int compare(Object e1, Object e2) {
			   EmployeeComparator emp1 = (EmployeeComparator)e1;
			   EmployeeComparator emp2 = (EmployeeComparator)e2;
		      if(emp1.id > emp2.id)
		         return 1;
		      else
		         return -1;
		   }
		   
		   
		   
		}
	static class SalComparator implements Comparator<Object> {   // ?? is there any other alternative than using static
		   public int compare(Object e1, Object e2) {
			   EmployeeComparator emp1 = (EmployeeComparator)e1;
			   EmployeeComparator emp2 = (EmployeeComparator)e2;
		      if(emp1.salary > emp2.salary)
		         return 1;
		      else
		         return -1;
		   }
	}
	static class LnameComparator implements Comparator<Object> {   // ?? is there any other alternative than using static
		   public int compare(Object e1, Object e2) {
			   EmployeeComparator emp1 = (EmployeeComparator)e1;
			   EmployeeComparator emp2 = (EmployeeComparator)e2;
			   return emp1.lastname.compareTo(emp2.lastname);
		   }
	}
	static class FnameComparator implements Comparator<Object> {   // ?? is there any other alternative than using static
		   public int compare(Object e1, Object e2) {
			   EmployeeComparator emp1 = (EmployeeComparator)e1;
			   EmployeeComparator emp2 = (EmployeeComparator)e2;
		      return emp1.firstname.compareTo(emp2.firstname);
		   }
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
