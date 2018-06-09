import java.util.Scanner;

public class Ass4Question4 {
	static void armstrong(int n) {
		double length= Math.log10(n);
		if(length!=1)
		length=Math.ceil(length);
//		System.out.println(length);
		double sum=0;
		double remainder=0;
		double x=n;
		while(n>0) {
			remainder=n%10;
			n=n/10;
			int z=(int) Math.pow( remainder,length);
			sum=sum+z;
		}
//		System.out.println(sum);
		if(sum==x) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not a armstrong number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		armstrong(n);
	}

}
