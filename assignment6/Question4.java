package Assingnment6;

import java.util.Scanner;

public class Question4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int max=1;
		int count=1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) {
				count++;
//				System.out.println(count);
				if(max<=count) {
					max=count;
				}
				
				
			}
			else {
				
				count=1;
				
			}
			
		}
		System.out.println(max);
	}
}
