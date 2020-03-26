package com.project.duplicatestdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCharactersTest {
	/*TODO list for my feature
	 * 1.n chars :BACD =>BCD
	 */

	@Test
	void testnchars() {
		RemoveNChars removeNChars =new RemoveNChars();
		String actual=removeNChars.remove("BACD");
		assertEquals("BCD",actual);
	}

}
