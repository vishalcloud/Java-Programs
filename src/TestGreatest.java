import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGreatest {

	@Test
	public void testFindGreatestNumber() {
		Greatest newGreatest = new Greatest();
		System.out.println(newGreatest.getMax());
		newGreatest.findGreatestNumber(2, 69, 200);
		System.out.println(newGreatest.getMax());
		
		assertEquals(200,newGreatest.getMax()); // how to access instance variables outside class
		
	}

}
