package org.stringClass;



public class StringFunctions {
	
	static String my_String ="      Integrated Decisions And Systems   " ;
	
	public String stringCase(String str)
	{
		str=my_String;
	
	System.out.println("Sting Case Functions - toLowerCase & toUpperCase :");
	String str1=my_String.toLowerCase();
	System.out.println(my_String.toLowerCase());
	System.out.println(my_String.toUpperCase());
	
	return str1;
		}
	
	public String strTrim(String str)
	{str=my_String;
	System.out.println("\n String Trim Function : trims spaces before and after string");	
	System.out.println(my_String.trim());
	String str1=my_String.trim();
	return str1;	
	}
	
	public boolean strStartEnd(String str)
	{str=my_String;
		System.out.println("\n Check Start or End of String : startsWith or EndsWith Functions");
		boolean str1=my_String.startsWith("      Int");

		System.out.println(my_String.startsWith("      Int"));
		System.out.println(my_String.endsWith("Pune"));
		return str1;
	}
	
	public char strCharAt(String str)
	{	str = my_String;
		System.out.println("Display Character at certain postion using charAt function");
		char c = my_String.charAt(10);
		System.out.println(my_String.charAt(10));
		return c;
		
	}
	public String subString(String str)
	{
		str = my_String;
		System.out.println("Substring From index 10 :"+my_String.substring(10));
		System.out.println("Substring From index 25 to 35 :"+my_String.substring(25, 35));
		return (my_String.substring(25, 35));
	}
	
	
	public static void main(String[] args) {

		System.out.println("Original Input String : "+my_String);
		StringFunctions sc = new StringFunctions();
		sc.stringCase(my_String);
		StringFunctions st = new StringFunctions();
		st.strTrim(my_String);
		StringFunctions sse = new StringFunctions();
		sse.strStartEnd(my_String);
		StringFunctions sca = new StringFunctions();
		sca.strCharAt(my_String);
		StringFunctions sub = new StringFunctions();
		sub.subString(my_String);	
		}
	
	
}	
