class P {

	int x = 10;
	static int y = 10;
	
	void m1() {		// overriden method
		System.out.println("Inside P class m1() method");
	}

	static void m2() {
		System.out.println("Inside P class m2() method");
	}
}

class C extends P {

	int x = 20;
	static int y = 20;

	void m1() {		// overriding method
		System.out.println("Inside C class m1() method");
	}

	static void m2() {
		System.out.println("Inside C class m2() method");
	}

	public static void main(String[] args) {
			
		P p1 = new P();		// Parent reference parent object
		p1.m1();			// Compiler will find m1() in P class then no error and JVM will call runtime object of P class m1() method	
		p1.m2();			// Compiler will check the reference type and finds it's of P type then compiler will call P class m1() method
		System.out.println("x = " + p1.x + ", y = " + p1.y);

		C c = new C();		// Child reference child object
		c.m1();				// Compiler will find m1() in C class then no error and JVM will call runtime object of C class m1() method
		c.m2();				// Compiler will check the reference type and finds it's of C type then compiler will call C class m1() method
		System.out.println("x = " + c.x + ", y = " + c.y);

		P p2 = new C();		// Parent reference child object
		p2.m1();			// Compiler will find m1() in P class then no error and JVM will call runtime object of C class m1() method
		p2.m2();			// Compiler will check the reference type and finds it's of P type then compiler will call P class m1() method
		System.out.println("x = " + p2.x + ", y = " + p2.y);
	}	
}

/* for compile time polymorphism or early binding compiler will take responsibility of method resolution that is method hiding, in this case
 both the parent and child method are available to the child class we need to specify the reference type.

 for run time polymorphism or late binding JVM will take responsibility of method resolution that is method overriding, in this case
 only overriden method is available to the child class we need to specify the object type.

 for variables, overriding is not applicable, it is data hiding. So it's compile time polymorphism or variable resolution will be taken
 care by compiler. It's applicable for both instance and static variable. It's called variable shadowing.*/