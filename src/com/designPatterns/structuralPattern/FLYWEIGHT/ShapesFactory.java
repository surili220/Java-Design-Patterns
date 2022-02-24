package com.designPatterns.structuralPattern.FLYWEIGHT;

import java.util.HashMap;
import java.util.Map;

//Factory pattern to create shape object
public class ShapesFactory {
	
	private static Map<String, Shapes> map = new HashMap<>(); //for caching mechanism
	
	public static Shapes getShape(String type) {
		
		Shapes shape=null;
		if(map.get(type)!= null) {
			shape=map.get(type); //if the shape is present in hashmap, means its already created , then return it.
		}else
		{
			if(type.equals("circle")) {
				shape= new Circle(); //else create a new object based on type
			}
			else {
				shape= new Rectangle();
			}
			map.put(type, shape);
		}
		
		return shape;
	}

}
