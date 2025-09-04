package practice;

public class ThreadJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Happy");
		
		Task t1=new Task("First Thread ");
		t1.start();
		
        System.out.println("Happy");
		
		Task t2=new Task("Second Thread ");
		t2.start();
		
		
//		Different way to call 
		Task2 t3=new Task2("Third Thread ");
//		t3.start(); Doesn't exist 
//		t3.run();// No parallel execution occurs or no new thread formed
	    Thread ta=new Thread(t3);
	    ta.start();

	}

}
class Task extends Thread{
	String name;
	
	public Task(String name)
	{
		this.name=name;
	}
	@Override
	public void run()
	{
		Thread.currentThread().setName(this.name);
		for(int i=0;i<100;i++)
		{
			System.out.println("i = "+i + " "+ Thread.currentThread().getName());
		}
	}
}
class Task2 implements Runnable{
String name;
	
	public Task2(String name)
	{
		this.name=name;
	}
	@Override
	public void run()
	{
		Thread.currentThread().setName(this.name);
		for(int i=0;i<100;i++)
		{
			System.out.println("i = "+i + " "+ Thread.currentThread().getName());
		}
	}	
}
