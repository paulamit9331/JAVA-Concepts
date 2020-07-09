public class Q4 {
	
	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

		String str = null;
		int len = -1;
		try {
			len = str.length();
		
		} catch(NullPointerException npe) {
			System.out.println("Error: Null value reference can't call any method");
		}

		System.out.println("Length of the string is: " + len);
	}
}