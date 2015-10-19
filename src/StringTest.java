
public class StringTest {

	String newString = "vishal";
	String s2 = "Alhat";
	String s3 = "Vishal";
	
	//string length
	public void len()
	{
		int l = newString.length();
		System.out.println("String length = " +l);
	}
	// String Concatenation
	
	public void concat()
	{
		System.out.println("Concatenated string :"  +newString.concat(s2));
	}
	//String Compare 
	
	public void strCmp()
	{
		System.out.println("string comparision between :"+newString +"and" +s2 +":" + newString.compareTo(s2));
		System.out.println("string comparision between :"+newString +"and" +s3 +":" + newString.compareToIgnoreCase(s2));
	}
	
	
	
	public static void main(String[] args) {
		StringTest str =new StringTest();
		str.len();
		str.concat();
		str.strCmp();

	}

}
