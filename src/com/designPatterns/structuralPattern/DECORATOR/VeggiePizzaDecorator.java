package com.designPatterns.structuralPattern.DECORATOR;

public class VeggiePizzaDecorator extends PizzaDecorator {

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
		
	}
	public void bake() {
		super.bake();
		System.out.println("Adding veggie toppings");
	}

}
