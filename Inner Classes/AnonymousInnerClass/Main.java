package AnonymousInnerClass;
/*
It is an inner class without a name and for which only a single object is created. 
An anonymous inner class can be useful when making an instance of an object 
with certain “extras” such as overloading methods of a class or interface, 
without having to actually subclass a class.

Anonymous inner classes are useful in writing implementation classes 
for listener interfaces in graphics programming.

Anonymous inner class are mainly created in two ways:
1. Class (may be abstract or concrete)
2. Interface

Syntax: The syntax of an anonymous class expression is like the invocation of a constructor, 
except that there is a class definition contained in a block of code.

// Test can be interface,abstract/concrete class
Test t = new Test() 
{
   // data members and methods
   public void test_method() 
   {
      ........
      ........
    }   
};

To understand anonymous inner class, let us take a simple program
*/

//Java program to demonstrate need for Anonymous Inner class 
interface Age { 
	int x = 21; 
	void getAge(); 
} 

// Myclass implement the methods of Age Interface 
class MyClass implements Age { 

	@Override
	public void getAge() { 
		// printing the age 
		System.out.print("Age is "+x); 
	} 
} 

class Main { 

	public static void main(String[] args) { 
		// Myclass is implementation class of Age interface 
		MyClass obj=new MyClass(); 

		// calling getage() method implemented at Myclass 
		obj.getAge();	 
	} 
} 

/*
In the program, interface Age is created with getAge() method and x=21.  
Myclass is written as implementation class of Age interface. As done in Program, 
there is no need to write a  separate class Myclass. Instead,   
directly copy the code of Myclass into this parameter, as shown here:

Age oj1 = new Age() {
    @Override
    public void getAge() {
        System.out.print("Age is "+x);
    }
};

Here, an object to Age is not created but an object of Myclass is created and 
copied in the entire class code as shown above. This is possible only with anonymous inner class. 
Such a class is called ‘anonymous inner class’, so here we call ‘Myclass’ as anonymous inner class.

Anonymous inner class version of the above Program:
*/

//Java program to demonstrate Anonymous inner class 
interface Age { 
	int x = 21; 
	void getAge(); 
} 

class Main { 
	
	public static void main(String[] args) { 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		Age oj1 = new Age() { 
			
			@Override
			public void getAge() { 
				// printing age 
				System.out.print("Age is "+x); 
			} 
		}; 
		oj1.getAge(); 
	} 
} 

// Age is 21