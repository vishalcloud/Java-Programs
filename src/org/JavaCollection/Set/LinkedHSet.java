//Linked Hash Set implementation

package org.JavaCollection.Set;

import java.util.LinkedHashSet;

public class LinkedHSet {

	public void lsh() {
		LinkedHashSet<String> linked = new LinkedHashSet<String>();

		linked.add("test 1");
		linked.add("test 2");
		linked.add("test 3");
		System.out.println(linked);

		linked.remove("test 2");
		linked.add("test 5");
		System.out.println(linked);

	}

	public static void main(String[] args) {

		LinkedHSet l = new LinkedHSet();
		l.lsh();
	}
}
