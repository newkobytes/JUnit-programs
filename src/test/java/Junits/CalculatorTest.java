package Junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	@Test
	public void Test1()
	{
		assertEquals(10,Calculator.Add(5, 5));
	}
	@Test
	public void Test2()
	{
		assertEquals(0,Calculator.Sub(5, 5));
	}
}
