import java.util.Scanner;

public class Q3 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

		System.out.print("Enter the size of the array = ");
		int n = sc.nextInt();
		try {
			int[] arr = new int[n];

		} catch(NegativeArraySizeException e) {
			System.out.println("\nNegativeArraySizeException caught");
		}
	}
}