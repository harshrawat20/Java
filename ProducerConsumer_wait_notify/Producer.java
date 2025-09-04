package practice;

import java.util.*;

public class Producer implements Runnable {
List<Integer>product_list=null;
int limit=5;
int product_no=0;

public Producer(List<Integer> product_list)
{
	this.product_list=product_list;
}

public void produceProduct(int product_no) throws InterruptedException{
	synchronized(product_list)
	{
		while(product_list.size()==limit)
		{
			System.out.println("Demand Overload! Producer Waiting..");
			product_list.wait();
		}
	
		System.out.println("New Product: "+product_no);
		product_list.add(product_no);
	
		product_list.notify();
		
	}
	Thread.sleep(100);
}
@Override
public void run() {
	while(true)
	{
		try {
			produceProduct(product_no);
			product_no++;
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
}
