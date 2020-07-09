import java.util.Scanner;

class LengthMismatchException extends RuntimeException {

	LengthMismatchException(String s) {
		super(s);
	}
}

class Q8 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

		String str = null;
		int start = -1;
		int end = -1;
		try {
			if(args.length != 3)
				throw new LengthMismatchException("Error in args: ");
			
			start = Integer.parseInt(args[1]);
			end = Integer.parseInt(args[2]);
			str = args[0].substring(start, end);
		
		} catch(StringIndexOutOfBoundsException soue) {
			System.out.println("Error: StringIndexOutOfBoundsException");
			System.exit(-1);
		
		} catch (NullPointerException npe) {
			System.out.println("Error: NullPointerException");
			System.exit(-1);
		
		} catch(LengthMismatchException lme) {
			System.out.println("Length of agruments don't match");
			System.exit(-1);
		
		} catch (Exception e) {
			System.out.println("Error: InputMismatchException\nInvalid input: Expected int found String");
			System.exit(-1);
		}
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}