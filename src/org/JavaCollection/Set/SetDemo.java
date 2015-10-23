package org.JavaCollection.Set;

import java.util.*;

public class SetDemo {
	
	public void set1()
	{
		String s1="X", s2="Y",s3="Z", s4="A",s5="B", s6="A";
		
			
		Set<String> newSet = new HashSet<String>();
		newSet.add(s1);
		newSet.add(s2);
		newSet.add(s3);
		newSet.add(s4);
		newSet.add(s5);
		newSet.add(s6);
		
		System.out.println("Set Contents :");
		Iterator<String> si = newSet.iterator();
		while(si.hasNext())
		{
			System.out.print(si.next()+ " ");
		}
		
		newSet.remove(s3);
		
		System.out.println("\n Set Contents After Removing " +s3);
		Iterator<String> si1 = newSet.iterator();
		while(si1.hasNext())
		{
			System.out.print(si1.next()+ " ");
		}
		
	}

	public static void main(String[] args) {

		SetDemo s = new SetDemo();
		s.set1();
	}

}
