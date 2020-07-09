class TestToString {

/*	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());	// inside Object class toString() implementation
	}																			// className@HexaDecimalStringRepresentationOfHashCode
*/
	public static void main(String[] args) {
		
		TestToString t1 = new TestToString();
		System.out.println(t1);

		TestToString t2 = new TestToString();
		System.out.println(t2);
	}
}