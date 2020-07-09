class SuperQ9 { 
    
    void show() { 
        System.out.println("SuperClass: SuperQ9 show() method"); 
    } 
} 
// SuperDemo4 inherited by the Demo4 
class Q9 extends SuperQ9 { 
  
    // show() declaring Unchecked Exception ArithmeticException 
    void show() throws ArithmeticException {
        System.out.println("SubClass: Q9 show() method"); 
    }

    public static void main(String[] args) { 
        System.out.println("Name: AMIT PAUL");
		System.out.println("Roll: 16900317142\n");

        SuperQ9 ob = new Q9(); 
        ob.show(); 
    } 
} 
