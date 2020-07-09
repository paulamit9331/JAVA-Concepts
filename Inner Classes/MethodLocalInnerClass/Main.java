package MethodLocalInnerClass;
/*
Inner class can be declared within a method of an outer class. 
In the following example, Inner is an inner class in outerMethod().
*/

class Outer { 
	
	void outerMethod() { 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
			
			void innerMethod() { 
				System.out.println("inside innerMethod"); 
			} 
		} 
		
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
}

class Main { 
	
	public static void main(String[] args) { 
		Outer x = new Outer(); 
		x.outerMethod(); 
	} 
} 

// o/p ->
// Inside outerMethod
// Inside innerMethod

/*
Method Local inner classes can’t use local variable of outer method 
until that local variable is not declared as final. For example, the following code generates compiler error 
(Note that x is not final in outerMethod() and innerMethod() tries to access it)

class Outer { 
	
	void outerMethod() { 
		int x = 98; 
		System.out.println("inside outerMethod"); 
		
		class Inner { 
			
			void innerMethod() { 
				System.out.println("x= "+x); 
			} 
		} 
		
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
}

class MethodLocalVariableDemo { 

	public static void main(String[] args) { 
		Outer x=new Outer(); 
		x.outerMethod(); 
	} 
}

o/p ->
local variable x is accessed from within inner class; 
needs to be declared final

Note : Local inner class cannot access non-final local variable till JDK 1.7. 
Since JDK 1.8, it is possible to access the non-final local variable in method local inner class.

But the following code compiles and runs fine (Note that x is final this time)
*/

class Outer { 
	
	void outerMethod() { 
		final int x=98; 
		System.out.println("inside outerMethod"); 
	
		class Inner { 
	
			void innerMethod() { 
				System.out.println("x = "+x); 
			} 
		} 
	
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
}

class Main { 

	public static void main(String[] args){ 
		Outer x = new Outer(); 
		x.outerMethod(); 
	} 
}

// Inside outerMethod
// X = 98

/*
The main reason we need to declare a local variable as 
a final is that local variable lives on stack till method is on the stack 
but there might be a case the object of inner class still lives on the heap.
Method local inner class can’t be marked as private, protected, static and transient 
but can be marked as abstract and final, but not both at the same time.
*/