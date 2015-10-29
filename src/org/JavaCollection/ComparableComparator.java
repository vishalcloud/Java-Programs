package org.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ComparableComparator implements Comparable<Object> {

	private String firstname;
	private String lastname;
	private int id;
	private Integer salary;

	public ComparableComparator(String firstname, String lastname, int id, int salary) {
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

		List<ComparableComparator> listEmployees = new ArrayList<ComparableComparator>();
		listEmployees.add(new ComparableComparator("abc", "zxc", 10, 100));
		listEmployees.add(new ComparableComparator("pqr", "qwe", 50, 400));
		listEmployees.add(new ComparableComparator("def", "lmn", 20, 200));
		listEmployees.add(new ComparableComparator("ghi", "stu", 40, 500));
		listEmployees.add(new ComparableComparator("def", "lmn", 20, 200));

		Collections.sort(listEmployees, new Comparator<ComparableComparator>() {

			@Override
			public int compare(ComparableComparator arg0, ComparableComparator arg1) {
				return arg0.salary.compareTo(arg1.salary);
			}

		});
		ListIterator<ComparableComparator> itr = listEmployees.listIterator();
		System.out.println("\n Using comparable -Salary:");
		while (itr.hasNext()) {
			ComparableComparator e = (ComparableComparator) itr.next();
			e.disp();

			// System.out.println((Employee)e);

		}

		Collections.sort(listEmployees, new Comparator<ComparableComparator>() {

			@Override
			public int compare(ComparableComparator arg0, ComparableComparator arg1) {
				return arg0.lastname.compareTo(arg1.lastname);
			}

		});
		itr = listEmployees.listIterator();
		System.out.println("\n Using comparator -last name:");
		while (itr.hasNext()) {
			ComparableComparator e = (ComparableComparator) itr.next();
			e.disp();

			// System.out.println((Employee)e);

		}

	}

	@Override
	public int compareTo(Object obj) {
		ComparableComparator emp = (ComparableComparator) obj;
		if (id == emp.id)
			return 0;
		else if (id > emp.id)
			return 1;
		else
			return -1;

	}
}