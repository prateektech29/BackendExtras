package com.techgeek.learning;

public class Shapes 
{
	public double computeSquareArea(double length)
	{
//		double res=length*length;
//		return res;
		return length *length;
	}
	
	public double computeCircleArea(double radius)
	{
		return 3.14*radius *radius;
	}

	public double computeRectagangleArea(double length,double breadth)
	{
		return length*breadth;
	}

	public double computeTriangleArea(double base,double height)
	{
		return 0.5*base*height;
	}
}
