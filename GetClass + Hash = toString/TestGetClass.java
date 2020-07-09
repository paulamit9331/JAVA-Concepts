import java.lang.reflect.*;

class Test {
	int r, s;
	static int t;

	void m1() {

	}

	static void m2() {

	}

	public static void main(String[] args) {
		
		Test t = new Test();

		Class c = t.getClass();
		System.out.println("\nFully Qualified name of the class: " + c.getName());

		System.out.println("\nMethods' names:");
		Method[] m = c.getDeclaredMethods();
		for(Method i : m) {
			System.out.println(i.getName());
		}

		System.out.println("\nFields' names:");
		Field[] f = c.getDeclaredFields();
		for(Field i : f) {
			System.out.println(i.getName());
		}

		System.out.println("\nConstructors' names:");
		Constructor[] cns = c.getDeclaredConstructors();
		for(Constructor i : cns) {
			System.out.println(i.getName());
		}
	}
}