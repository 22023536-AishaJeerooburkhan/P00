import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 3087;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testMultiple() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 5332114;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testDivide() {
		//fail("Not yet implemented");
		int a = 4000;
		int b = 2000;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 2;
		assertEquals (expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
