import java.util.Scanner;

public class Q1 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

		System.out.print("Enter the First Integer - ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter the Second Integer - ");
		int n2 = sc.nextInt();

		int result = -1;
		try {
			result = n1 / n2;
		
		} catch(ArithmeticException ae) {
			System.out.println("Can't devide by zero");	
		}

		System.out.println("Result = " + result);
	}
}