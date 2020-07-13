class MyThread extends Thread {

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			t.sleep(2000);
		}
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();

		t.interrupt();
		System.out.println("End of main");
	}
}
/*
public static void sleep() throws InterruptedException: 

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