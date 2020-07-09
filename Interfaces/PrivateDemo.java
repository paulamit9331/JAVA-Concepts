// non-static private methods inside interface is used to reduce code redundency in default methods
// static private methods inside interface is used to reduce code redundency in static methods

interface Interf {
	void m1();

	static void m2() {
		m6();
		System.out.println("m2() static method functions\n");
	}

	static void m3() {
		m6();
		System.out.println("m3() static method functions\n");
	}

	default void m4() {
		m7();
		System.out.println("m4() default method functions\n");
	}

	default void m5() {
		m7();
		System.out.println("m5() default method functions\n");
	}

	private static void m6() {
		System.out.println("m6() private static method functions");
	}

	private void m7() {
		System.out.println("m7() private method functions");
	}
}

class PrivateDemo implements Interf {
	public void m1() {
		System.out.println("m1() static method functions\n");
	}

	public static void main(String[] args) {
		Interf i = new PrivateDemo();

		i.m1();
		Interf.m2();
		Interf.m3();
		i.m4();
		i.m5();
		// i.m6();
		// i.m7();
	}
}