package practice;

import java.util.*;

public class Consumer implements Runnable {
List<Integer>product_list=null;
int limit=5;


public Consumer(List<Integer> product_list)
{
	this.product_list=product_list;
}

public void TakeProduct() throws InterruptedException{
	
	
	synchronized(product_list)
	{
		while(product_list.isEmpty())
		{
			System.out.println("No Products to take!! Consumer Waiting...");
			product_list.wait();
		}
	
		
		System.out.println("Taken Product: "+product_list.remove(0));
		 
		product_list.notify();
		
	}
	Thread.sleep(5000);
}
@Override
public void run() {
	while(true)
	{
		try {
			TakeProduct();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
}
