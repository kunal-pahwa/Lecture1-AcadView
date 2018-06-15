package Asssignment8;

import java.util.Scanner;

public class Question2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int l=s.length();
		System.out.println(" ");
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<=l;j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}
}
