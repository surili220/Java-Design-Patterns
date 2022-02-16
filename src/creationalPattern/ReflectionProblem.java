package creationalPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/* Break Singleton class using Reflection Api*/

//Solved with help of enums.

public class ReflectionProblem {
	
	public static void main( String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SingletonDemo sd1 = SingletonDemo.getInstance();
		SingletonDemo sd2 = null;
		
		Constructor[] constructors =SingletonDemo.class.getDeclaredConstructors(); //reflection api accessing all the constructors.
		
		for (Constructor constructor2 : constructors) {
			constructor2.setAccessible(true); // making the constructor of the Singleton class which is private , accessible.
			// now we can create the object.
			sd2=(SingletonDemo) constructor2.newInstance(); 
			break;
		}
		
		System.out.println(sd1.hashCode());
		System.out.println(sd2.hashCode());
		
		//hashcodes will be different. means diff obj are created . which defeats the entire purpose of singleton.
	}

}
