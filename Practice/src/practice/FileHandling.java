package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		
//		Scanner sc =new Scanner (System.in);
//		int n=sc.nextInt();
//		System.out.println(n);
//		String s=sc.nextLine();
//		System.out.println(s);
		
		File f1=new File("testing.txt");
		Scanner sc=new Scanner(f1);
		while(sc.hasNext())
		{
			String s=sc.next();
			System.out.println(s);
		}
		

	}

}
