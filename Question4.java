import java.util.Scanner;

public class Question4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int greatest=c;
		if(a>greatest && a>b) {
			greatest=a;
		}
		else if(b>greatest && b>a) {
			greatest=b;
		}
		else {
			System.out.println("all are same ");
		}
		System.out.println(greatest);
	}
}
