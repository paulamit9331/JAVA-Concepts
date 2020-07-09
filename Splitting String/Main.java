import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		String str = new Scanner(System.in).nextLine();

		String[] str1 = str.split(",");

		for(String i : str1)
			System.out.print(i + "\t");

		System.out.println();
		System.out.println("length of str1 : " + str1.length);
	}
}