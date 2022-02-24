package com.designPatterns.structuralPattern.FLYWEIGHT;

public class Rectangle extends Shapes {
	
	private String label ;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Rectangle(){
		label ="Rectangle";
	}

	public void draw(int length, int breadth) {
		System.out.println("Length is  "+ length +"  Breadth is  "+ breadth);
	}
}
