class MyThread extends Thread {
	public void run() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("I'm a lazy thread");
			Thread.sleep(2000);
		}
	}
}

public class Method {
	
	public static void main(String[] args) throws InterruptedException {
		/*System.out.println(Thread.currentThread().getName());

		MyThread t1 = new MyThread();
		System.out.println(t1.getName());					// to get the name of the threads

		Thread.currentThread().setName("AMIT Thread");		// change name of any thread

		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.currentThread().getPriority()); // default is 5

		Thread.currentThread().setPriority(9);
		MyThread t2 = new MyThread();
		System.out.println(t2.getName());

		System.out.println(t1.getPriority());	// 5 -> old priority of main thread before setting 
		System.out.println(t2.getPriority());	// 9 -> new priority of main thread after setting 
												//		because t2 is created after modification of the priority


		// t2 has higher priority than t1

		// as every thread has default priority of 5 so we cant predict the output
		// so we have to modify the priority to predict output

		// to stop execution of Thread -> sleep(), join(), yield();


		1. public static void sleep() throws InterruptedException: 

		it's an overloaded method i. native sleep(long ms);
			   					 ii. sleep(long ms, int ns);

		it will sleep untill it is throwing InterruptedException then it goes to ready state waiting to go to running state

		for (int i = 0; i < 10; i++) {		it will print 0 - 9 in 5000ms interval
			System.out.println(i);
			Thread.sleep(5000);
		}

		A thread can interrupt a sleeping or waiting thread by using interrupt method:

		public void interrupt():
		*/

		MyThread t = new MyThread();
		t.start();

		System.out.println("End of main");
	}
}