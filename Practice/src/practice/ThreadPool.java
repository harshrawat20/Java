package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
public static void main(String[] args) {
	ExecutorService executor= Executors.newFixedThreadPool(2);
	
	Runnable message0=new Message(0);
	executor.execute(message0);
	
	Runnable message1=new Message(1);
	executor.execute(message1);
	
	Runnable message2=new Message(2);
	executor.execute(message2);
	
	Runnable message3=new Message(3);
	executor.execute(message3);
	executor.shutdown();
	
//	try {
//		executor.awaitTermination(20, TimeUnit.SECONDS);
//	}
//	catch(InterruptedException e)
//	{
//		e.printStackTrace();
//	}
	while(!executor.isTerminated())
	{
		
	}
	System.out.println("Everything done!");
}
}
