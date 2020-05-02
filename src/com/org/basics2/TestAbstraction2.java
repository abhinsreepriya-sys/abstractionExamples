package com.org.basics2;

//Creating a Test class which calls abstract and non-abstract methods  
class TestAbstraction2 {  
	public static void main(String args[]) {  
		Bike obj = new Honda();  
		obj.run();  
		obj.changeGear();  
	}  
}  
