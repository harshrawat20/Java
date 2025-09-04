package practice;

public class Message implements Runnable {

	int message;
	public Message(int message)
	{
		this.message=message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Message : " +message+" received by : " + Thread.currentThread().getName());
        try {
        	Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
        	e.printStackTrace();
        }
	}

}
