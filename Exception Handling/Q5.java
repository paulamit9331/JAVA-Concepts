import java.util.Scanner;

class YoungerAgeException extends Exception{	
	
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class Q5{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		try {
			if(age < 18)
				throw new YoungerAgeException("\nYou are not eligible for voting");
			else
				System.out.println("\nYou are eligible to vote");
		
		} catch(YoungerAgeException yae) {
			yae.printStackTrace();
		}
	}
}