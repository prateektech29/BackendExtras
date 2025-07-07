package com.techgeek.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testcomputeSquareArea() 
	{

		
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void testcomputeCicleArea()
	{
		assertEquals(78.5, shape.computeCircleArea(5), "Ares of circle calculation is wrong");
	}

	@Test
	void testcomputeCicleAreaSupplier()
	{
		assertEquals(78.5, shape.computeCircleArea(5), ()->"Ares of circle calculation is wrong");
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
