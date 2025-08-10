package com.scaler;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.learning.service.JavaCourse;
import com.scaler.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testproceedWithCourse() 
	{
		PurchaseCourse pc=new PurchaseCourse();
		boolean status=pc.proceedWithCourse(new JavaCourse());
		//assertTrue(status);
		//assertTrue(false);
		assertFalse(status,"its failed cause the status is true");
	}
	


}
