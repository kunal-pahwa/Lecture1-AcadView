package Assignment13;

import java.util.Arrays;

public class Question2 {
	 
	
	public static <G> void sortArray(G[] arr){
		Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	System.out.println();
	}
	
	
	public static void main(String args[]) {
		   
		    Integer[] integerArray = { 511,465,46,465,46,4 };
		    Double[] doubleArray = { 6541.6481, 42.65482, 893.65843, 484.41321, 5546.6515, 6546.6456, 7654.457 };
		    Character[] characterArray = { 'G', 'e', 'n', 'r', 'i','c' };

		   
		    sortArray(integerArray);
		   
		    sortArray(doubleArray); 
		   
		    sortArray(characterArray); 
	    }

}