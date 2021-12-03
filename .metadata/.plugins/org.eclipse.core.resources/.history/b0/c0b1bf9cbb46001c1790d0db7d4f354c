package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)
public class ExtensionPointExample {
	
	@Test
	@DisplayName("Positive Test")
	public void test1() {
		
		assertTrue(StringFunction.isPlaindrome("oppo"));
	}
	
	//@Disabled fordisabling test case
	@Test
	@DisplayName("Negetive Test")
	public void test2() {
		
		assertFalse(StringFunction.isPlaindrome("abcd"));
	}

}