package org.stringClass.testStringClass;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stringClass.HtmlTags;


public class HtmlTagsTest {

	@Test
	public void testHtml() {
		assertEquals("<i>vishal</i>",HtmlTags.html("i", "vishal"));
		assertEquals("<i>i</i>",HtmlTags.html("i", "i"));
		assertEquals("<cite>IDeaS</cite>",HtmlTags.html("cite", "IDeaS"));
		assertEquals("<html>homepage</html>",HtmlTags.html("html", "homepage"));
	}

}
