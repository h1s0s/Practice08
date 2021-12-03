package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(this.x == p.x) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
