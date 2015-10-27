/*Given a string, return a new string where the 
  first and last chars have been exchanged. 

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

*/


package org.stringClass;

public class Pract {

	public static void main(String[] args) {

		String s = "IdeaS";
		int l = s.length();
		if (l > 1) 
		{
			String s1 = s.substring(0, 1);
			String s2 = s.substring(1, (l - 1));
			String s3 = s.substring((l - 1), l);

			System.out.println(s3 + s2 + s1);
		}
		else 
			System.out.println(s);
	}
}