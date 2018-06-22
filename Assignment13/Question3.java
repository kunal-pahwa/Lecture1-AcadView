package Assignment13;

public class Question3 {
	public static class GenericMethodTest {
        
        public static < type > void print( type[] inputArray ) {
        
            for(type i : inputArray) {
                System.out.printf("%s ", i);
            }
            System.out.println();
        }

        public static void main(String args[]) {
            
            Integer[] intArray = { 15,465,135,4561,65 };
            Double[] doubleArray = { 5451.541, 542.2545, 34.351, 45615.4 };
            Character[] charArray = { 't', 'y', 'p', 'e', 's' };
            print(intArray);
            print(doubleArray); 
            print(charArray);       
        }
    }
}	
