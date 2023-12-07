package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student s1 = new Student();
		
		// Get the name of class
		Class cls = s1.getClass();
		
		// Print the name of class
		System.out.println("Name of class is : "+cls.getName());
		
		//Print all methods in class
		System.out.println("\nClass contains following methods : ");
		Method methods[]= cls.getDeclaredMethods();
		for(Method method :methods) {
			System.out.println(method.getName());
		}
		
		// Print all fields in a class
		System.out.println("\nClass contains following fields : ");
		Field fields[] = cls.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getName());
		}
		System.out.println("\n");
		System.out.println("=====================================Class Loader=====================================");
		// Java code to demonstrate Class Loader subsystem
		// String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader());
 
        // Test class is loaded by Application loader
        System.out.println(Test.class.getClassLoader());
	}

}
