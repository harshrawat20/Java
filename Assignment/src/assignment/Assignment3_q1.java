package assignment;
import java.io.FileWriter;
import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Assignment3_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your first name: ");
			String firstName=sc.nextLine();
			System.out.println("Enter your last name: ");
			String lastName=sc.nextLine();			
			String fullName=firstName+" "+lastName;
			
			//Prompting user for file name
			System.out.println("Enter the file name (e.g., data.txt):");
			String fileName=sc.nextLine();
			
			FileWriter writer=new  FileWriter(fileName,true);
			writer.write(fullName+"\n");
			writer.close();
			System.out.println("Name appended to file successfully");
			
			System.out.println("\nFile content:");
//			Scanner fileReader=new Scanner(new FileReader(fileName));
			File f1=new File(fileName);
			Scanner sc1=new Scanner(f1);
			
			while(sc1.hasNext())
			{
				System.out.println(sc1.nextLine());
			}
			sc1.close();
		}
		catch(IOException e){
			System.out.println("Error handling the file: "  + e.getMessage());
			e.printStackTrace();
			
		}
		finally {
			sc.close();
		}

	}

}
