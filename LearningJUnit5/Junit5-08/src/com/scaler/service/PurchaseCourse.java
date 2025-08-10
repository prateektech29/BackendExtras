package com.scaler.service;

import com.learning.service.Course;

public class PurchaseCourse 
{
	private Course course;
	
	public boolean proceedWithCourse(Course course)//Course course=new JavaCourse();
	{
		return course.coursePurchased();

	}

}
