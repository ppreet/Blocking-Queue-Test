//Test the BlockingQueue structure for a multi-threaded architecture

package blockingQueue;

import java.util.concurrent.*;

public class BQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start Program");
		
		//Create a new blocking queue
		//USE A LINKEDLISTBLOCKINGQUEUE IF THE CAPACITY NEEDS TO BE OPTIONALLY BOUNDED
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(20);
		
		//Create new parser class that pops the queue
		ParserThread pt = new ParserThread(bq);
		pt.start();
		
		//Create new Producer
		//Producer p = new Producer(bq);
		//p.start();
		
		
		//Put items in the queue
		for(int i = 5; i >= 0; i-=2){			

			try {
				bq.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(bq);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Put more items in the queue
		for(int i = 10; i >= 5; i-=2){			

			try {
				bq.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(bq);
		
		//Take items out of the queue
		//while(!bq.isEmpty()){
			
		//	try {
		//		int head = bq.take();
		//		System.out.println(head);
				
		//	} catch (InterruptedException e) {
		//		e.printStackTrace();
		//	}
		//}
		
		System.out.println("End Program");
		
	}

}
