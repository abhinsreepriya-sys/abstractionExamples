package com.org.basics2;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  
	Bike() {
		System.out.println("bike is created");
	 	}  
	
	abstract void run();  
	void changeGear() {
		System.out.println("gear changed");
		}  
}  
