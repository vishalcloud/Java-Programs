package org.stringClass;

public class StringFunctions {
	
	static String my_String ="      Integrated Decisions And Systems   " ;
	
	public void stringCase()
	{
	System.out.println("Sting Case Functions - toLowerCase & toUpperCase :");
	System.out.println(my_String.toLowerCase());
	System.out.println(my_String.toUpperCase());
		}
	
	public void strTrim()
	{
	System.out.println("\n String Trim Function : trims spaces before and after string");	
	System.out.println(my_String.trim());	
	}
	
	public void strStartEnd()
	{
		System.out.println("\n Check Start or End of String : startsWith or EndsWith Functions");
		System.out.println(my_String.startsWith("      Int"));
		System.out.println(my_String.endsWith("Pune"));
	}
	
	public void strCharAt()
	{
		System.out.println("Display Character at certain postion using charAt function");
		System.out.println(my_String.charAt(10));
		
	}
	public static void main(String[] args) {

		System.out.println("Original Input String : "+my_String);
		StringFunctions sc = new StringFunctions();
		sc.stringCase();
		StringFunctions st = new StringFunctions();
		st.strTrim();
		StringFunctions sse = new StringFunctions();
		sse.strStartEnd();
		StringFunctions sca = new StringFunctions();
		sca.strCharAt();
	}
	
	
}	
