// It will normally compile and run..... 
// But after compiling if anyhow .class file of Test class is deleted and
// we still try to run the driver class then this error occurs at runtime.....

class Test {
	void m1() {

	}
}

class ClassNotFoundExceptionDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("Test"));
	}
}

/*
Output->

Exception in thread "main" java.lang.ClassNotFoundException: Test
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Unknown Source)
        at ClassNotFoundExceptionDemo.main(ClassNotFoundExceptionDemo.java:10)
*/