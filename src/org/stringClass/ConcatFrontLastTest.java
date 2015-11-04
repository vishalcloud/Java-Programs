package org.stringClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatFrontLastTest {

	@Test
	public void testFront22() {
		
		assertEquals("IdIdeasId",ConcatFrontLast.front22("Ideas"));
		assertEquals("vivishalvi",ConcatFrontLast.front22("vishal"));
		
	}

}
