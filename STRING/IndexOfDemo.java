class IndexOfDemo {

	public static void main(String[] args) {
		String str = new String("String is inmutable String");

		// Search from the specified index to the end
		System.out.println(str.indexOf('i'));			// 3
		System.out.println(str.indexOf('i', 4));		// g is inmutable String -> first occurance of 'i' = 7
		System.out.println(str.indexOf("in"));			// 3
		System.out.println(str.indexOf("in", 4));		// g is inmutable String -> first occurance of 'in' = 10

		// Search from the specified index to front
		System.out.println(str.lastIndexOf('i'));		// 23
		System.out.println(str.lastIndexOf('i', 4));	// Strin -> last occurance of 'i' = 3
		System.out.println(str.lastIndexOf("in"));		// 23
		System.out.println(str.lastIndexOf("in", 16));	// String is inmutab -> last occurance of "in" = 3
	}
}
