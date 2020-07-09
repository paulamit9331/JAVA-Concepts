class Test {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();	// creates object of String Buffer of capacity 16
		System.out.println(sb1.capacity());

		sb1.append("abcdefghijklmnop"); 		// capacity is still 16
		System.out.println(sb1.capacity());

		sb1.append("qrs"); 						// new object with new capacity = (old capacity + 1) * 2 = 34 
		System.out.println(sb1.capacity());		// and sb will point new object and old object will be destroyed by garbage collector

		StringBuffer sb2 = new StringBuffer(1000);		// creates a sb object of capacity 1000
		System.out.println(sb2.capacity());

		StringBuffer sb3 = new StringBuffer("Java");		// creates a sb object of 4 + 16 capacity
		System.out.println(sb3.length());
		System.out.println(sb3.charAt(3));
		sb3.setCharAt(0, 'j');
		System.out.println(sb3);

		StringBuffer sb = new StringBuffer();
		Test t = new Test();
		System.out.println(sb.append("Value of Pi is: ").append(3.14).append(" it's ").append(true).append(t));	
		// toString(Stringbuffer + StringBuffer + toString() of object class)

		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		System.out.println("Before appending char[] length = " + sb.length());
		System.out.println(sb.append(ch).append(ch, 2, 3));
		System.out.println("After appending char[] length = " + sb.length());
		System.out.println(sb.delete(1, 10));
		System.out.println("After deleting char[] length = " + sb.length());
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.reverse());
		sb.setLength(10);
		System.out.println(sb.length());
		System.out.println(sb);


		StringBuffer sb4 = new StringBuffer();
		
		sb4.ensureCapacity(34);
		System.out.println(sb4.capacity());	// 34

		sb4.ensureCapacity(50);
		System.out.println(sb4.capacity());	// 70 -> if provided > current, capacity = Max(provided, (current + 1) * 2) -> Max(50, 70)
		
		sb4.ensureCapacity(1000);
		System.out.println(sb4.capacity());	// 1000 -> capacity = Max(provided, (current + 1) * 2) -> Max(1000, 142)

		sb4.ensureCapacity(55);
		System.out.println(sb4.capacity());	// 1000 -> if provided < current, hence no change

		//									 01234567891011
		StringBuffer sb5 = new StringBuffer("Java@Program");
		//						  0    1    2    3    4    5    6    7    8    9   10   11   12   13
		char[] cha = new char[] {'S', 't', 'r', 'i', 'n', 'g', ' ', 'B', 'u', 'i', 'l', 'd', 'e', 'r'};
		sb5.getChars(4, 12, cha, 6);
		System.out.println(cha);
	}
}
/*
public synchronized StringBuffer append(int / float / double / long / char / boolean / String) {
	// code inside StringBuffer
}

Inside StringBuffer class toString() is overriden so that the returned StringBuffer object will be converted to String
so we can print string buffer object in the sopln statement which is converted to String.

public synchronized StringBuffer append(char[]) -> to append whole char[]

public synchronized StringBuffer append(char[], int start, int length) -> to append a subarray of the char[] 
																		int start -> starting index of char[]
																		int length -> length of the subarray

public synchronized StringBuffer delete(int begin, int end)		from begin index to (end index - 1) will be deleted

public synchronized StringBuffer deleteCharAt(int index)

public synchronized StringBuffer reverse()

public synchronized void setLength(int length)

public synchronized void ensureCapacity(int capacity)

public synchronized void getChars(int sourceStrat, int sourceEnd, char[] target, int targetStart)-> copies the characters
																									from sourceStart index
																									upto sourceEnd - 1 index
																									of StringBuffer
																									into the target[]
																									starting from targetStart index

sourceStart -> starting index of StringBuffer
sourceEnd -> ending index of String Buffer
char[] target -> copied to the target array from String Buffer
int targetStart -> starting index of target[] at the time of pasting the copied characters
*/