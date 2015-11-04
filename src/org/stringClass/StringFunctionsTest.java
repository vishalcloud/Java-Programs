package org.stringClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringFunctionsTest {

	@Test
	public void testStringCase() {

	assertEquals("      integrated decisions and systems   ",StringFunctions.my_String.toLowerCase());
	assertEquals("      INTEGRATED DECISIONS AND SYSTEMS   ",StringFunctions.my_String.toUpperCase());
	}

	@Test
	public void testStrTrim() {
		assertEquals("Integrated Decisions And Systems",StringFunctions.my_String.trim());

	}

	@Test
	public void testStrStartEnd() {
		assertEquals(true,StringFunctions.my_String.startsWith("      Int"));

	
	
	}

	@Test
	public void testStrCharAt() {
		assertEquals('g',StringFunctions.my_String.charAt(10));
	}

	@Test
	public void testSubString() {
		StringFunctions st = new StringFunctions();
		String str = null;
		st.subString(str);
		assertEquals('g',StringFunctions.my_String.charAt(10));

	}

}
