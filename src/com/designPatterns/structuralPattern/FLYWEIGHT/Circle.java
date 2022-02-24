package com.designPatterns.structuralPattern.FLYWEIGHT;

public class Circle extends Shapes{

	private String label; //unique to circle
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Circle(){
		label ="Circle";
	}
	
	@Override
	public void draw(int radius) {
		// TODO Auto-generated method stub
		System.out.println("Circle radius is " +  radius);
	}

	

}
