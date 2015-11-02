package org.stringClass;

public class ConcatFrontLast {
	public static String front22(String str) {
		String str1 = "";
		if (str.length() < 2)
			return (str + str + str);
		else {
			str1 = str.substring(0, 2);
			return (str1 + str + str1);
			
		}

	}

	public static void main(String[] args) {

		
		ConcatFrontLast.front22("");
		System.out.println("string is : " +front22("Ideas") );
	}

}
