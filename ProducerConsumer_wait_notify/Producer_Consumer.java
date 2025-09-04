package practice;

import java.util.*;

public class Producer_Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> product_list=new ArrayList<>();
		Thread t1=new Thread(new Producer(product_list));
		Thread t2=new Thread(new Consumer(product_list));
		t1.start();
		t2.start();
		
	}

}
