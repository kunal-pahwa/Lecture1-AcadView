import java.util.Arrays;
import java.util.Scanner;

public class Ass4Question7 {
	static void binary_search(int arr[],int x) {
		int low=0;
		int n=arr.length;
		int mid=n/2;
		int right=n-1;
		Arrays.sort(arr);
//	System.out.println("hello");
		int search=x;
		int flag=0;
		while(right>0) {
//		System.out.println("hi");
			if(search>=arr[low] && search<=arr[right]) {
				if(search>=arr[right/2]) {
					low = right/2;
					
				}
				else {
					right=right/2;
				}
			}
			if(arr[low]==x || arr[right]==x) {
				System.out.println("element is present in the array");
				flag=1;
				break;
			}
		else {
//			System.out.println("element is not in the array");
			break;
		}
			
		}
		if(flag==0) {
			System.out.println("element is not present in the array");
		}
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the no to search");
		int x=sc.nextInt();
		binary_search(arr,x);
	}
}
