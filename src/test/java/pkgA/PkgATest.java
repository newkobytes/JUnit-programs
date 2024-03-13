package pkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Junits.StringFunctions;

@Tag("Sanity")
public class PkgATest {

	
	@Test
	@DisplayName("Part of Package Test A1")
	public void Test1() {
		
		assertTrue(StringFunctions.IsPalindrome("RAR"));
	}

	@Test
	@DisplayName("Part of Package Test A2")
	public void Test2() {
		
		assertTrue(StringFunctions.IsPalindrome("DAD"));
	}
}
