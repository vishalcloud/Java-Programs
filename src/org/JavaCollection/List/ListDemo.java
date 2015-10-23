package org.JavaCollection.List;

import java.util.*;

public class ListDemo {

	public void List1()

	{
		List<String> a1 = new ArrayList<String>();

		a1.add("Test 1 ");
		a1.add("Test 2");
		a1.add("test 2");

		System.out.println("Elements in Array List Collection are:");
		System.out.print("   " + a1);

		List<String> a2 = new LinkedList<String>();
		a2.add("Linked List1");
		a2.add("Linked List2");
		a2.add("Linked List3");
		System.out.println();
		System.out.println("Elements in Linked List Collection are:");
		System.out.print("   " + a2);

		Collections.reverse(a2);
		ListIterator<String> li = a2.listIterator();
		System.out.println("\n \nReverse order of linked list :");
		while (li.hasNext())

			System.out.print(" \t " + li.next());

	}

	public static void main(String[] args)

	{
		ListDemo l1 = new ListDemo();
		l1.List1();

	}
}
