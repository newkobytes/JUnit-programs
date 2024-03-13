package pkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Junits.StringFunctions;

public class PkgBTest {
	
	@Tag("Regression")
	@Test
	@DisplayName("Part of Package Test B")
	public void Test1() {
		
		assertTrue(StringFunctions.IsPalindrome("RAR"));
	}
}
