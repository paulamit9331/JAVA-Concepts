interface A {

	void methodA();
}

interface B extends A {

	void methodB();
}

interface C extends A {

	void methodC();
}

interface D extends B, C {

}

class HybridInheritance implements D {

	public void methodA() {
		System.out.println("methodA() is implemented");
	}

	public void methodB() {
		System.out.println("methodB() is implemented");
	}

	public void methodC() {
		System.out.println("methodC() is implemented");
	}
}

class Test {

	public static void main(String[] args) {
		
		HybridInheritance h = new HybridInheritance();

		h.methodA();
		h.methodB();
		h.methodC();
	}
}