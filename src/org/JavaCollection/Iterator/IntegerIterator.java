
// Integer Iteration using Iterator

package org.JavaCollection.Iterator;

import java.util.*;

public class IntegerIterator<integer> {

	public void integerIterator() {
		ArrayList<integer> myInt = new ArrayList<integer>();

		myInt.add((integer) "1");
		myInt.add((integer) "3");
		myInt.add((integer) "4");
		myInt.add((integer) "7");
		myInt.add((integer) "9");

		Iterator<integer> itr = myInt.iterator();
		ListIterator<integer> itr1 = myInt.listIterator();

		while (itr.hasNext())

		{
			System.out.println(itr.next());
		}
		System.out.println("Reverse order");
		while (itr1.hasPrevious()) {
			System.out.println(itr1.next());

		}

	}

	public static void main(String[] args) {

		IntegerIterator<Object> iterate = new IntegerIterator<Object>();
		iterate.integerIterator();
	}

}
