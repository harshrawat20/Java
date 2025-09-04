package practice;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadOnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mine m1=new Mine();
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run()
			{
				m1.add();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run()
			{
				m1.print();
			}
		});
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t2.start();//This will throw an error as collections in Java aren't allowed read and add values at the same time

	}

}
class Mine{
//	List<Integer> arr=new ArrayList<>(); The normal list will have Concurrent modification exception
	List<Integer> arr=new CopyOnWriteArrayList<>();
	public void add() {
		for(int i=0;i<1000;i++)
		{
			arr.add(i);
			System.out.println("Added");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void print() {
		for(int i:arr)
		{
			System.out.println(i);
			System.out.println("Printed");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
