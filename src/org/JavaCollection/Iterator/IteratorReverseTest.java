package org.JavaCollection.Iterator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class IteratorReverseTest {

	@Test
	public void testIterate() {
		List<String> expected = new ArrayList<String>();
		  expected.add("a");
		  expected.add("b");
		  expected.add("c");
		  Object n = expected;
		assertEquals(Arrays.asList("a", "b", "c"), n);
		  //Assert.assertEquals(expected.toArray(), new String[]{"India", "Pune", "India"});
	}

}
