/*
//main wants to wait for child thread
class MyThread extends Thread {

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				System.out.println("Child got Interrupted");
			}
		}
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		// main wants to wait for child so main will call the join method
		
		//t.join(); // child will execute first after that main, main will wait until child completes

		t.join(10000); // main will for child for 10000ms but after that unpredictable output first five o/p -> child (5 * 2000) = 10000

		for (int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}
}
/*
public void final join() throws InterruptedException:
public void final join(long ms) throws InterruptedException
public void final join(long ms, int ns) throws InterruptedException

if two thread is there t1 and t2 then if t1 wants to wait until t2 finishes then the syntax :
t2.join() -> t1 will wait until t2 executes
*/




// child will wait for main so child have to call inside run() because child have the job inside run() only
class MyThread extends Thread {
	public static Thread mt;
	
	public void run() {
		try {
			mt.join();		// join will be called by main thread reference after main completion child will execute
		} catch(InterruptedException ie) {
			System.out.println("Child got Interrupted");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class JoinExample {
	
	public static void main(String[] args) {
		MyThread.mt = Thread.currentThread();

		MyThread t = new MyThread();
		t.start();

		for(int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}
}