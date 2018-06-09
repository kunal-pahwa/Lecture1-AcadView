import java.util.Scanner;

public class Ass4Question1 {
	public static void pattern(int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=n-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				
		pattern(n);
	}
}
