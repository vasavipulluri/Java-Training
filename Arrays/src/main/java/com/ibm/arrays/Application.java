package com.ibm.arrays;

class Point{
	public int x;
	public int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point[] points;
		points =new Point[3];
		
		points[0] = new Point(2,4);
		points[1] = new Point(3,6);
		points[2] = new Point(4,8);
		
		for(Point point:points) {
			System.out.println(point.x+","+point.y);
		}
	}
}