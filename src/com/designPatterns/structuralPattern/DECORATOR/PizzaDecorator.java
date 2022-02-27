package com.designPatterns.structuralPattern.DECORATOR;

public class PizzaDecorator implements Pizza {

	private Pizza pizza;
	public PizzaDecorator(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();

	}

}
