package com.designPatterns.structuralPattern.DECORATOR;

public class ChessePizzaDecorator extends PizzaDecorator{

	public ChessePizzaDecorator(Pizza pizza) {
		super(pizza);
		
	}
	public void bake() {
		super.bake();
		System.out.println("Chesse added in toppings");
	}

}
