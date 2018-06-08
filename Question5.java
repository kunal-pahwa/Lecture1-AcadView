import java.util.Scanner;

public class Question5 {
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
		int x=n;
		int reverse=reverse(n);
		 if(x==reverse) {
			 System.out.println("no is palindrome");
		 }
		 else
			 System.out.println("no is not a palindrome");
	}
}
