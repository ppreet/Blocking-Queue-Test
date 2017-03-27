//Test the BlockingQueue structure for a multi-threaded architecture

package blockingQueue;

import java.util.concurrent.*;

public class BQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start Program");
		
		//Create a new blocking queue
		//USE A LINKEDLISTBLOCKINGQUEUE IF THE CAPACITY NEEDS TO BE OPTIONALLY BOUNDED
		BlockingQueue bq = new ArrayBlockingQueue(20);
		
		//Put items in the queue
		for(int i = 10; i >= 0; i-=2){			

			try {
				bq.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(bq);
		
		//Take items out of the queue
		while(!bq.isEmpty()){
			
			try {
				Object head = bq.take();
				System.out.println(head);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End Program");
		
	}

}
