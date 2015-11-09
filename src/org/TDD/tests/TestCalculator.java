package org.TDD.tests;

import static org.junit.Assert.*;

import org.TDD.Calculator;
import org.junit.Test;

public class TestCalculator {

	Calculator calc = new Calculator();
	
	@Test
	public void TestAdd() {
		assertEquals(5,calc.add(2,3));
	}
	@Test 
	public void  TestSubtract()
	{
		assertEquals(2,calc.Subtract(5,3));
	}
	@Test
	public void TestMultiplication()
	{
		assertEquals(12,calc.Multiplication(4,3));
	}
	@Test
	public void TestDivision()
	{
		assertEquals(4,calc.Division(8,2));
		
	}
}



