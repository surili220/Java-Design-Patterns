package com.designPatterns.structuralPattern.FLYWEIGHT;

public class PaintApp {
	
	public void render(int noOfShapes) {
		Shapes shape=null;
		
		for (int i=0; i<noOfShapes; i++) {
			if(i%2==0) {
				shape= ShapesFactory.getShape("circle");
				shape.draw(i);
			}
			else {
				shape = ShapesFactory.getShape("rectangle");
				shape.draw(i+1, i);
			}
		}
	}
}
