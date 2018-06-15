package Asssignment8;

import java.util.Scanner;

public class Question6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine() ;
//		System.out.println(s);
		int l=s.length();
		int count=1;
		for(int i=0;i<l;i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
