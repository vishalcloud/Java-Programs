/*Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' 
and include the second only if it is 'z', so "ozymandias" yields "oz". 

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
package org.stringClass;

public class StartOz {

	public String startWithOz(String str) {
		String str1 = "";
		// char str2 = 0;
		// str2=str.charAt(1);

		if (str.length() >= 1 && str.charAt(0) == 'o') {
			str1 = str1 + str.charAt(0);

		}

		if (str.length() >= 2 && str.charAt(1) == 'z') {
			str1 = str1 + str.charAt(1);
		}
		return str1;
		

	}

}
