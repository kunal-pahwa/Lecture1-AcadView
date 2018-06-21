package Assignment12;

import java.util.HashSet;
import java.util.Scanner;

public class Question1 {
	public static void main(String args[]) {
		HashSet<Integer>hs1 = new HashSet<Integer>();
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		while(a !=' ') {
//			hs1.add(a);
//			a=sc.nextInt();
//		}
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		hs2.add(6);
		hs2.add(7);
		System.out.println("hash set 1 contains"+hs1);
		hs1.retainAll(hs2);
		System.out.println("hash set 2 contains"+hs2);
		
		System.out.println("same elements are"+hs1);
		
		
	}
}
