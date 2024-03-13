package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {

	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.IsPalindrome("RAR"));
	}
	
	@Test
	public void Test2() {
		
		assertFalse(StringFunctions.IsPalindrome("RADARE"));
	}

	@DisplayName("Example of repeated test")
	@RepeatedTest(2)
	public void Test3()
	{
		
		assertTrue(StringFunctions.IsPalindrome("MOM"));
	}
}
