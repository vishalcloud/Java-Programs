// Basic HashMap Program to insert and display Keys and Values

package org.JavaCollection.Map;

import java.util.HashMap;

public class HashMap1 {

	public void mapDemo() {
		HashMap<Integer, String> employee = new HashMap<Integer, String>();
		employee.put(1, "Emp1");
		employee.put(2, "emp2");
		employee.put(3, "Employee 3");

		System.out.println(employee);

	}

	public static void main(String[] args) {

		HashMap1 emp = new HashMap1();
		emp.mapDemo();
	}

}
