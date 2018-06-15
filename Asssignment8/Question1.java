package Asssignment8;

import java.util.Scanner;

public class Question1 {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
//		System.out.println(n);
		String reversed = "";
		for(int i=n-1;i>=0;i--) {
			reversed=reversed+s.charAt(i);
		}
		System.out.println(reversed);
	}
}
