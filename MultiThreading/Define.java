class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child Thread");
	}
}
/*
class MyRunnable implements Runnable {
	void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child Thread");
	}
}*/

public class Define {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();

		// MyRunnable r = new MyRunnable();
		// Thread t2 = new Thread(r);

		// as every thread has default priority of 5 so we cant predict the output
		// so we have to modify the priority to predict output
		t1.setPriority(9);
		t1.start();
		// t2.start();

		for (int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}
}