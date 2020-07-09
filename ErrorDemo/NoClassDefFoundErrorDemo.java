// It will normally compile and run..... 
// But after compiling if anyhow .class file of Test class is deleted and
// we still try to run the driver class then this error occurs at runtime.....

class Test {
	void m1() {

	}
}

class NoClassDefFoundErrorDemo {
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}

/*
Output->

Exception in thread "main" java.lang.NoClassDefFoundError: Test
        at Main.main(Main.java:10)
Caused by: java.lang.ClassNotFoundException: Test
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more
*/