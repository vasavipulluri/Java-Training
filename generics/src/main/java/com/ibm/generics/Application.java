package com.ibm.generics;

class Point<T> {
	private T x;
	private T y;
	
	public Point(T x,T y) {
		this.setX(x);
		this.setY(y);
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}
	
}

public class Application
{
	public static void main( String[] args )
	{
		Point<Float> point1=new Point<Float>(2.0f,4.0f);
		System.out.println(point1.getX()+","+point1.getY());
		
		Point<Integer> point2=new Point<Integer>(2,4);
		System.out.println(point2.getX()+","+point2.getY());
	}
}