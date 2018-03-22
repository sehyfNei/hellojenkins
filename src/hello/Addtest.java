package hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.TestCase;

public class Addtest extends TestCase {

	@Test
	public void test() {
		fail("Not yet implemented");
		
		int total = 8;
		int sum = adder.addd(4, 4);
		assertEquals(sum, total);
			
	}
}
