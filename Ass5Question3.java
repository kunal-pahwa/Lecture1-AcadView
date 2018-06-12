import java.util.Scanner;

public class Ass5Question3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		SecondLarget s=new SecondLarget();
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		s.find(arr,n);
}
}
