package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {

	@ValueSource(strings = {"MoM","dad","mam"})
	@ParameterizedTest
	public void Test1(String arg1)
	{
		assertTrue(StringFunctions.IsPalindrome(arg1));
	}
	
	@CsvSource(value = {"radar:radar:this is comparison"}, delimiter = ':')
	@ParameterizedTest
	public void Test2(String arg1,String arg2, String arg3)
	{
		assertEquals(arg1,arg2);
	
		System.out.println(arg3);
	}
}

