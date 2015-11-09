package org.TDD;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ChangeTest {


	@Test
	public void test_getTotalAmount() {
		
		  Change ct = new Change(1, 0, 0, 0, 13);
		  long expected = 113;
		  long actual = ct.getTotalChange();
		  assertEquals(expected, actual);
		  
		  ct = new Change(1, 1, 1, 1, 1);
		  expected = 141;
		  actual = ct.getTotalChange();
		 assertEquals(expected, actual);
		  
		  ct = new Change(0, 0, 0, 0, 0);
		  expected = 0;
		  actual = ct.getTotalChange();
		 assertEquals(expected, actual);
		
		  ct = new Change(-1, 0, 0, 0, 0);
		  expected = 0;
		  actual = ct.getTotalChange();
		  assertEquals(expected, actual);
		
	}


}
