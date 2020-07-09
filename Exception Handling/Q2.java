import java.util.Scanner;

public class Q2 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print("Enter an index to get its number: ");
		int i = sc.nextInt();

		String str = "Hello World";
		System.out.print("Enter an index to get its character: ");
		int j = sc.nextInt();

		try {
			System.out.println(i + "th element in array: " + array[i]);
			System.out.println(j + "th element in array: " + str.charAt(j));

	    } catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("\nArrayIndexOutOfBoundsException caught");
	    
	    }catch(StringIndexOutOfBoundsException e) {
        	 System.out.println("\nStringIndexOutOfBoundsException caught");
        
        } catch(Exception e) {
	         System.out.println("SomeOther Exception");
	    }
    }
}