package com.techgeek.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {

	Shapes shape=new Shapes();
	@Test
	void test() 
	{
		assertEquals(6, 6);
	}
	
	@Test
	void testcomputeSquareArea()
	{

		assertEquals(574, shape.computeSquareArea(24) );
	}


	@Test
	void testcomputeRectangleArea()
	{
		assertEquals(30, shape.computeRectagangleArea(5,6));
	}
	@Test
	void testcomputeTriangleArea()
	{
		assertEquals(3, shape.computeTriangleArea(2,3));
	}


}
