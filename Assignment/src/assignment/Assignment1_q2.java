package assignment;

public class Assignment1_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10, 20, 30, 40, 50};
        
		int sum=0,largest=numbers[0],smallest=numbers[0];
		
        // Display array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
            sum=sum+numbers[i];
            if(numbers[i]>largest) largest=numbers[i];
            if(numbers[i]<smallest) smallest=numbers[i];
            
        }
        double average= sum / numbers.length;
        System.out.println();
        
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + (int)average);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
	}

}
