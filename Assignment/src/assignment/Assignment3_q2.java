package assignment;

import java.util.Scanner;

public class Assignment3_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter nummerator");
			int numerator=sc.nextInt();
			
			System.out.print("Enter denominator");
			int denominator=sc.nextInt();
			
			int result=numerator/denominator;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not possible");
		}
		finally {
			sc.close();
		}

	}

}
