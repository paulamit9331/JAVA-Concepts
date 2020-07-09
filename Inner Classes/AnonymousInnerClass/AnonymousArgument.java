package AnonymousInnerClass;
/*
Anonymous Inner class that defines inside method/constructor argument : 
Anonymous inner classes in method/constructor arguments are often used in graphical user interface (GUI) 
applications. To get you familiar with syntax lets have a look on the following program 
that creates a thread using this type of Anonymous Inner class :
*/

//Java program to illustrate defining a thread 
//Using Anonymous Inner class that define inside argument 
class MyThread { 
	
	public static void main(String[] args) { 
		//Here we are using Anonymous Inner class 
		//that define inside argument, here constructor argument 
		Thread t = new Thread(new Runnable() { 
			
			public void run() { 
				System.out.println("Child Thread"); 
			} 
		}); 
		
		t.start(); 
		System.out.println("Main Thread"); 
	} 
} 

// Main Thread
// Child Thread