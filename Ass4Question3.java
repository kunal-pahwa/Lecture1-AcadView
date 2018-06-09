import java.util.Scanner;

public class Ass4Question3 {
	static void prime(int n) {
		double x=Math.sqrt(n);
		for(int j=2;j<=n;j++) {
			int flag=0;
			for(int i=2;i<=x;i++) {
				if(j%i==0 && j!=i) {
					flag=0;
					break;
				}
				else {
					flag=1;
					break;
				}
					
				
				
			}
			if(flag==1) {
				System.out.println(j);
			}
		}
	}
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime(n);
	}
}
