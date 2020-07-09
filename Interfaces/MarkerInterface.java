/*
public class MarkerInterfaceDemo {
	int a = 10, b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		MarkerInterfaceDemo ob1 = new MarkerInterfaceDemo();
		MarkerInterfaceDemo ob2 = (MarkerInterfaceDemo) ob1.clone();	// exception as Clonnable is not implemented

		System.out.println(ob1.a + " " + ob1.b);
		System.out.println(ob2.a + " " + ob2.b);
	}
}
*/

public class MarkerInterfaceDemo implements Clonnable {		// Clonnable is a Marker Interface which enables objects the clonnable ability
	int a = 10, b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		MarkerInterfaceDemo ob1 = new MarkerInterfaceDemo();
		MarkerInterfaceDemo ob2 = (MarkerInterfaceDemo) ob1.clone();

		System.out.println(ob1.a + " " + ob1.b);
		System.out.println(ob2.a + " " + ob2.b);
	}
}