package com.techgeek.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse =new ReverseString();
		
		assertEquals("avaJ", reverse.reverseString("Java"));
		//assertEquals("toobgnirps", reverse.reverseString("Springboot"));
		assertEquals("toobgnirpS", reverse.reverseString("Springboot"));
	}

}
