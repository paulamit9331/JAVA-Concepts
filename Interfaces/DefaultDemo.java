// need of default is : if we implement an intercace with 3 methods by 1000 classes
// after that we realised that we need to add another method in the interface to increase functionality
// if we add that method then to use its implementing class, we have to implement that method inside 1000
// implementing class. So to remove this problem we can provide default method with implementation inside
// interface which is by default available to all the implementing class we can override that method as we need

interface Interf { 
	int f = 10;		// public static final variables are available to the implementing class so data hiding takes place
	void m1();
	void m2();
	void m3();
	
	static void m4() {		// only exists inside interface not the implementing class
		System.out.println("Inside m4() static method in interface");
	}

	default void m5() {		// by default available to all the implementing classes and can be overriden if needed
		System.out.println("Inside m5() default method in interface");
	}

	default void m6() {		// by default available to all the implementing classes and can be overriden if needed
		System.out.println("Inside m6() default method in interface");
	}

	// as main method is a static method so it can be written inside interface
}

class DefaultDemo implements Interf {
	public static final int f = 20;
	
	public void m1() {
		System.out.println("Inside m1() method with " + f);
	}

	public void m2() {
		System.out.println("Inside m2() method");
	}

	public void m3() {
		System.out.println("Inside m3() method");
	}

	public static void m4() {
		System.out.println("Inside m4() static method in class");
	}

	public void m5() {
		System.out.println("Inside overriden m5() default method in class");
	}

	public static void main(String[] args) {
		Interf o = new DefaultDemo();
		System.out.println("Using Interf interface ref.:");
		o.m1();
		o.m2();
		o.m3();
		// o.m4();		// m4() is a static method independently exist in the interface so ca be called only using Interface name it's not method hiding
		o.m5();
		o.m6();
		System.out.println(o.f);	// Interface static variable as Ref as Interf

		Interf.m4();	// interface static method
		DefaultDemo.m4();	// Class static method

		// Interf.m5();	// default methods are instance methods
		// Interf.m6();

		DefaultDemo p = new DefaultDemo();
		System.out.println("Using DefaultDemo class ref.:");
		p.m1();
		p.m2();
		p.m3();
		p.m4();		// as class can be instantiated so its static method can be called its instance
		p.m5();
		p.m6();
		System.out.println(p.f);	// class static variable as ref is DefaultDemo class type
	}

	// interface static method exist inside interface only and must be called using interface name only
	// data hiding concept doesnot belong to interface and its implementing class though its possible to write same signature method exist in both class and its interface
	// data hiding only applicable for extends not for implements
}