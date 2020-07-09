import java.util.Scanner;

class PayOutOfBoundsException extends Exception{	
	
	PayOutOfBoundsException(String msg){
		super(msg);
	}
}
public class Q6{
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");
		
		double salary;
		System.out.print("What is your expected salary: ");
		salary = sc.nextDouble();
		try {
			if(salary > 10000.0)
				throw new PayOutOfBoundsException("Asking for too migh Salary");
			else
				System.out.println("\nSalary is in the range");
		
		} catch(PayOutOfBoundsException pobe) {
			pobe.printStackTrace();
		}
	}
}