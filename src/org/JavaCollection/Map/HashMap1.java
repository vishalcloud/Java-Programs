// Basic HashMap Program to insert and display Keys and Values

package org.JavaCollection.Map;

import java.util.HashMap;

public class HashMap1 {

	public void mapDemo() {
		HashMap<Integer, String> employee = new HashMap<Integer, String>();
		employee.put(1, "Emp1");
		employee.put(2, "emp2");
		employee.put(3, "Employee 3");

		System.out.println("Display entire keys and Values of map:");
		System.out.println(employee);
		System.out.println();
		System.out.println("Check for presence of given value using containsValue() ");
		System.out.println(employee.containsValue("emp2"));
		System.out.println();
		System.out.println("Get value mapped to certain Key :");
		System.out.println(employee.get(3));
		System.out.println("Get Value at specified Key and if absent Print Default Value or message");
		System.out.println(employee.getOrDefault(2, "No Value at given key"));
		System.out.println(employee.getOrDefault(5, "No Value at given key"));
		
	}

	public static void main(String[] args) {

		HashMap1 emp = new HashMap1();
		emp.mapDemo();
	}

}
