class FirstException extends RuntimeException {
	
	FirstException(String s){
		super(s);
	}
}

class SecondException extends RuntimeException {
	
	SecondException(String s1){
		super(s1);
	}
}

public class Q7 {
	
	static void f() {
		try {
			try {
				g();
			
			} catch(FirstException fe) {
				System.out.println("Caught FirstException of g() inside f()");
				throw new SecondException("from f(): ");
			}
		
		} catch(SecondException se) {
			System.out.println("Caught SecondException of f() inside f()");
		}
	}

	static void g() {
		throw new FirstException("from g(): ");
	}

	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");
		
		f();
	}
}