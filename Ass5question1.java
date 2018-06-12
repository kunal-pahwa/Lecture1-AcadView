import java.util.Scanner;

public class Ass5question1 {
	
	public static void main(String args[]) {
		Rectangle r=new Rectangle();
		int length,width;
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		width=sc.nextInt();
//		System.out.println(length + "" +width);
		int area=r.Area(length, width);
		System.out.println(area);
	}
}
