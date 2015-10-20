package org.JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterate {
	public void iterateMe() {
		ArrayList<String> myString = new ArrayList<String>();
		myString.add("Integrated");
		myString.add("Decisions");
		myString.add("And");
		myString.add("Systems");

		Iterator<String> itr = (Iterator<String>) myString.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {

		CollectionIterate iterate = new CollectionIterate();
		iterate.iterateMe();
	}

}
