package assignment5;

public class Question1 {
	    public static void main(String args[]) {
	 
	       
	       Test t1 = new Test();
	       
	    }
	
}
class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called "+i);
    }
    
}