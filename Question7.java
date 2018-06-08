import java.util.Scanner;

public class Question7 {
	public static int reverse(int n) {
		int x=n;
		int reverse=0;
		 while(n != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
		return reverse;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=reverse(n);
		System.out.println("reverse no is "+x);
	}
}
