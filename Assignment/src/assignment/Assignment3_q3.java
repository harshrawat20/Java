package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter your name: \n");
			String name=br.readLine();
			
			System.out.print("Enter your age: \n");
			int age=Integer.parseInt(br.readLine());
			
			System.out.println("Hello, "+ name+"! You are "+age+" years old.");
		}
		catch(IOException e)
		{
			System.out.println("An error occured while reading input: "+e.getMessage());
		}
	}

}
