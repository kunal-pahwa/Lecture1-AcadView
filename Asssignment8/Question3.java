package Asssignment8;

import java.io.BufferedReader;
import java.util.Scanner;

public class Question3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String Without_Vowel="";
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				continue;
			}
			else {
				Without_Vowel=Without_Vowel+s.charAt(i);
			}
		}
		System.out.println(Without_Vowel);
	}
}
