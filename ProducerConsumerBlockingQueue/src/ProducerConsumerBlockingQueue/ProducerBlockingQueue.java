package ProducerConsumerBlockingQueue;
import  java.util.concurrent.*;
public class ProducerBlockingQueue implements Runnable{
	
	public BlockingQueue<Integer> queue;
	public int productNo=0;
	
	public ProducerBlockingQueue(BlockingQueue<Integer> queue) {
		this.queue=queue;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true)
			{
				System.out.println("New Product: "+productNo);
				queue.put(productNo++); //waits if queue is full
				Thread.sleep(1000); // for production delay
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
 
}
