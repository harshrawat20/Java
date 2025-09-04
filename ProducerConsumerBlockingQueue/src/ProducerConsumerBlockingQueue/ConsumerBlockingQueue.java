package ProducerConsumerBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable{
	public BlockingQueue<Integer> queue;
	
	
	public ConsumerBlockingQueue(BlockingQueue<Integer> queue) {
		this.queue=queue;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true)
			{
				int item=queue.take();//waits if queue is empty
				System.out.println("Taken Product: "+item);
				Thread.sleep(5000); // for consumption delay
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
