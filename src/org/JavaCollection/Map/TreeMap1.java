package org.JavaCollection.Map;
import java.util.*;
public class TreeMap1 {

	
	public void treeMapDemo()
	{
		TreeMap<String, String> tmd = new TreeMap<String, String>();
		tmd.put("Keyboards", "10");
		tmd.put("Mice", "54");
		tmd.put("Monitors", "24");
	
		Set<Map.Entry<String, String>> set =tmd.entrySet();
		
		for(Map.Entry<String, String> me:set)
		{
			System.out.println(me.getKey()+" :-");
			System.out.println(me.getValue());
			System.out.println();
		}
				
		
		
	}
	public static void main(String[] args) {
		TreeMap1 td = new TreeMap1();
		td.treeMapDemo();
	}

}
