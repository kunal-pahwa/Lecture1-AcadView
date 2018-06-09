import java.util.Scanner;

public class Ass4Question5 {
	static void reverse(int n) {
		int x=n;
		int reverse=0;
		 while(n != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
		System.out.println(reverse);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		reverse(n);
	}
}
