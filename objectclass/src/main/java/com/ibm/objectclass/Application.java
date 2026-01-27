package com.ibm.objectclass;

class Point{
	public int x;
	public int y;
	@Override
	public boolean equals(Object target) {
		if(target!=null && target instanceof Point) {
			Point point2=(Point) target;
			if(this.x==point2.x && this.y==point2.y)
			{
				return true;
			}
		}
		return false;
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Point point1=null,point2=null;
		point1=new Point();
		point2=new Point();
		System.out.println(point1.equals(point2));
	}
}