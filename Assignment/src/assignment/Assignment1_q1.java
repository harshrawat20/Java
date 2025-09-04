package assignment;

public class Assignment1_q1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
        int num2 = 10;
        double d1 = 31.0;
        double d2 = 2.0;
        char letter = 'A';
//        boolean status = true;
        String text = "Hello, ";
        String text2 = "world!";

        // Performing arithmetic operations
        int intResult = num1 + num2; // addition
        double doubleResult = d1 / d2; // division

        // String concatenation
        String concatenated = text + text2;
     // Displaying results
        System.out.println("Integer result of addition: " + intResult);
        System.out.println("Double result of division: " + doubleResult);
        System.out.println("Character: " + letter);
//        System.out.println("Boolean value: " + status);
        System.out.println("String concatenation result: " + concatenated);

	}

}
