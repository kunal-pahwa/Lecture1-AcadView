import java.util.Scanner;

public class Ass4Question2 {
	static void even(int n) {
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		even(n);
	}
}
