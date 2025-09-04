package ProducerConsumerBlockingQueue;
import java.util.concurrent.*;

public class Producer_ConsumerBlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);
		Thread t1=new Thread(new ProducerBlockingQueue(queue),"Producer");
		Thread t2=new Thread(new ConsumerBlockingQueue(queue),"Producer");
        
		t1.start();
		t2.start();
	}

}
