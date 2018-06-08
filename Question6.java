import java.util.Scanner;

public class Question6 {
	public static int prime(int n) {
		int i;
		double b=Math.sqrt(n);
		int flag=0;
		for(i=2;i<=b;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
			else {
				continue;
			}
		}
		return flag;
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		
		int flag=0;
		flag=prime(n);
		if(flag==0) {
			System.out.println("no is prime "+n);
			
		}
		else {
			System.out.println("no is not a prime no "+n);
		}
	}
}
