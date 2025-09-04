package assignment;

public class Assignment1_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;          
        boolean hasID = true;  

        // If-Else check for age
        if (age >= 18) {
            // Nested If-Else for ID check
            if (hasID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are 18 or older but do not have valid ID. Cannot vote.");
            }
        } else {
            System.out.println("You are not eligible to vote (age must be 18 or above).");
        }
	}

}
