
// Implementation of comparable in collection.


package org.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class EmployeeComparable implements Comparable<Object> {

	private String firstname;
	private String lastname;
	private int id;
	private int salary;

	public EmployeeComparable(String firstname, String lastname, int id, int salary) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setId(id);
		this.setSalary(salary);

	}

	public void disp() {
		System.out.println(firstname + " " + lastname + " " + id + " " + salary);
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

	public static void main(String[] args) {

		// System.out.println();

		List<EmployeeComparable> listEmployees = new ArrayList<EmployeeComparable>();
		listEmployees.add(new EmployeeComparable("abc", "zxc", 10, 100));
		listEmployees.add(new EmployeeComparable("pqr", "qwe", 50, 400));
		listEmployees.add(new EmployeeComparable("def", "lmn", 20, 200));
		listEmployees.add(new EmployeeComparable("ghi", "stu", 40, 500));

		Collections.sort(listEmployees);
		ListIterator<EmployeeComparable> itr = listEmployees.listIterator();
		while (itr.hasNext()) {
			EmployeeComparable e = (EmployeeComparable) itr.next();
			e.disp();

			// System.out.println((Employee)e);

		}

	}

	@Override
	public int compareTo(Object obj) {
		EmployeeComparable emp = (EmployeeComparable) obj;
		if (id > emp.id)
			return 1;
		else
			return -1;

	}
}