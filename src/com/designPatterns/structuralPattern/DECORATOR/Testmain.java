package com.designPatterns.structuralPattern.DECORATOR;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new NormalPizza();
		Pizza orderedPizza = new ChessePizzaDecorator(pizza);
		orderedPizza.bake();
		System.out.println("*************************************************************************************");
		
		Pizza veggiePizzaWithChesse = new VeggiePizzaDecorator(orderedPizza);
		veggiePizzaWithChesse.bake();
		//here we have passed the chesse pizza to veggie pizza decorator
		
		//we can wrap one decorator inside other
	}

}
