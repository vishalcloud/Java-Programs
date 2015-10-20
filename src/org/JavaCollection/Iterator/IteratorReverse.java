
//Use of ListIterator - for Reverse traversal of collection using hasPrevious()

package org.JavaCollection.Iterator;

import java.util.*;

public class IteratorReverse {
	public void iterate() {
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Ideas");
		arr.add("Pune");
		arr.add("India");

		ListIterator<String> list = arr.listIterator();
		System.out.println("Forward:");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println();
		
		System.out.println("Reverse :");

		while (list.hasPrevious()) {
			System.out.println(list.previous());
		}
	}

	public static void main(String[] args) {
		IteratorReverse itr = new IteratorReverse();
		itr.iterate();
	}

}
