package NestedInnerClass;
/*
Nested Inner class can access any private instance variable of outer class. 
Like any other instance variable, we can have access modifier private, protected, public and default modifier.
Like class, interface can also be nested and can have access specifiers.
*/

class Outer { 
// Simple nested inner class 
	class Inner { 
		
		public void show() { 
			System.out.println("In a nested class method"); 
		} 
	} 
} 

public class Main { 
	
	public static void main(String[] args) { 
		Outer.Inner in = new Outer().new Inner(); 
		in.show(); 
	} 
} 

// o/p -> In a nested class method
/*
As a side note, we can’t have static method in a nested inner class 
because an inner class is implicitly associated with an object of its outer class 
so it cannot define any static method for itself. For example the following program doesn’t compile.

class Outer { 
	
	void outerMethod() { 
		System.out.println("inside outerMethod"); 
	}

	class Inner { 
		
		public static void main(String[] args){ 
			System.out.println("inside inner class Method"); 
		} 
	} 
}

o/p ->
Error illegal static declaration in inner class 
Outer.Inner public static void main(String[] args) 
modifier ‘static’ is only allowed in constant 
variable declaration
*/