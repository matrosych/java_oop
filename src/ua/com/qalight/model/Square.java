package ua.com.qalight.model;

import ua.com.qalight.abstraction.Shape;

public class Square implements Shape {
	
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
