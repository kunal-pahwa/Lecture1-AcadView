package Asssignment8;

import java.util.Scanner;

public class Question5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n1=s1.length();
		int n2=s2.length();
		int flag=0;
		int count=0;
		flag=s1.indexOf(s2);
		
		if(flag==1) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}
}
