package com.designPatterns.structuralPattern.DECORATOR;

//concrete component
public class NormalPizza implements Pizza {

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking-normal pizza");
	}

}
