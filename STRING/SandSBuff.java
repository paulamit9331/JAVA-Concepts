class SandSBuff {
	
	public static void main(String[] args) {

		// String and StringBuffer is final class so it can't be inherited
		
		String s = new String("Java");
		s.concat(" Software");		// Creation a new String object as Java Software with no reference variable and will be destroyed by garbage collector
		System.out.println(s);		// Java

		StringBuffer sb = new StringBuffer("Java");
		sb.append(" Software");		// Modification of sb object with same reference variable
		System.out.println(sb);		// Java Software

		// equal() is present inside the Object class for reference comparison

		String s1 = new String("Java");
		String s2 = new String("Java");	
		System.out.println(s1.equals(s2));		// true as s1 and s2 contains same content and String overrides equals() 
												// present inside Object class for content comparison

		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");	
		System.out.println(sb1.equals(sb2));	// false as s1 and s2 doesn't point to same object and StringBuffer doesn't 
												// overrides equals()
	}
}