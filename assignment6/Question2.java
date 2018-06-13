package assignment5;

public class Question2 {
	static void print() {
		System.out.println("i am null");
		
	}
	static void print(int a) {
		System.out.println("i am integer");
	}
	static void print( float a) {
		System.out.println("i am flaot");
	}
	public static void main(String args[]) {
		int a=10;
		float b=(float) 20.20;
		print();
		print(a);
		print(b);
	}
}
